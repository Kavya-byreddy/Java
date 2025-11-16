class Restaurant
{
   public static void main(String args[])
   {
      String Rname = "mehfil";
      String address = "Kukatpally";
      String phno    =   "9392582653";
      String product1 = "chicken 65", product2="fish fry" , product3="naan", product4="veg curry",product5="biryani",product6="cool drinks";
      double p1_price = 300, p2_price=400,p3_price=70, p4_price=400, p5_price=450, p6_price=800;
     int p1_quantity = 3, p2_quantity=2, p3_quantity=3, p4_quantity=2, p5_quantity=3, p6_quantity=10;
     double p1_tprice = p1_price*p1_quantity, p2_tprice=p2_price*p2_quantity,p3_tprice=p3_price*p3_quantity,p4_tprice=p4_price*p4_quantity,p5_tprice=p5_price*p5_quantity,
                          p6_tprice=p6_price*p6_quantity;
     double total_price=p1_tprice+p2_tprice+p3_tprice+p4_tprice+p5_tprice+p6_tprice;
     double cgst = (9.0/100*total_price);
     double sgst = (9.0/100*total_price);
     double gst = cgst+sgst;
     double bill = total_price+gst;
     double discount = (5.0/100*bill);
     double final_bill = bill+discount;
     System.out.println("                                "+Rname);
     System.out.println("                              "+address);
     System.out.println("                              "+phno);
     System.out.println("_________________________________________________________________________");
     System.out.println("item\t\tprice\t\tquantity\t\tt_price");
     System.out.println(product1+"\t\t"+p1_price+"\t\t"+p1_quantity+"\t\t"+p1_tprice);
     System.out.println(product2+"\t\t"+p2_price+"\t\t"+p2_quantity+"\t\t"+p2_tprice);
     System.out.println(product3+"\t\t"+p3_price+"\t\t"+p3_quantity+"\t\t"+p3_tprice);
     System.out.println(product4+"\t\t"+p4_price+"\t\t"+p4_quantity+"\t\t"+p4_tprice);
     System.out.println(product5+"\t\t"+p5_price+"\t\t"+p5_quantity+"\t\t"+p5_tprice);
     System.out.println(product6+"\t\t"+p6_price+"\t\t"+p6_quantity+"\t\t"+p6_tprice);
     System.out.println("__________________________________________________________________________");
     System.out.println("total_price                                              "+total_price);
     System.out.println("cgst                                                      "+cgst);
     System.out.println("sgst                                                      "+sgst);
     System.out.println("gst                                                       "+gst);
     System.out.println("__________________________________________________________________________");
     System.out.println("bill                                                      "+bill);
     System.out.println("discount                                                    "+discount);
     System.out.println("__________________________________________________________________________");
     System.out.println("final_bill                                                "+final_bill);
   }
}