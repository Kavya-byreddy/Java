class Transaction
{
      public static void main(String []args)
      {
         double payment = 10000;
         double discount = 0;
         String p_mode ="online";
         String t_mode = "card";
         if(p_mode=="online")
         {
            if(t_mode=="upi")
            {
               discount=(15.0/100*payment);
              
            }
            else
            {
               discount=(10.0/100*payment);
            }
         }
         else
         {
            if(p_mode=="offline")
            {
               if(t_mode=="cash")
               {
                   discount=(5.0/100*payment);
               }
               else
               {
                   discount=0;
               }
            }
         }
         double bill=payment-discount;
         System.out.println("bill="+" "+bill);
      }
}