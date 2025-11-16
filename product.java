class product
{
    public static void main(String []args)
    {
       String p_name="book";
       double p_price=345.5;
       String rating="*****";
       int quantity=2;
       double t_price=p_price*quantity;
       double gst=18.0/100*t_price;
       double final_bill=t_price+gst;
       int bill=(int)final_bill;
       System.out.println("product name = "+p_name+"\n"+
                          "product price = "+p_price+"\n"+
                           "rating = "+rating+"\n"+
                           "quantity = "+quantity+"\n"+
                           "t_price = "+t_price+"\n"+
                           "gst = "+gst+"\n"+
                           "total_bill = "+bill);               
    }
}