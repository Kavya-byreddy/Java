class main2
{
   public static void main(String []args)
   {
   String pname="book";
   int price=500,quantity=3;
   double discount=0;
   double total_price=price*quantity;
   double bill=total_price-discount;
   if(total_price>=1000 && total_price<2000) 
   discount=10.0/100*total_price;
   System.out.println(bill);
   }
}
   
   