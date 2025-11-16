class Numbers
{
  public static void main(String args[])
  {
     int num1=20, num2=25, num3=30;
     if(num1>num2)
     {
         if(num1>num3)
         {
             System.out.println(num1+" is greater");
         }else
         {
           System.out.println(num3+" is greater");  
         }
     }else 
     {
        if(num2>num3)
        {
        System.out.println(num2+" is greater");
        }else
        {
        System.out.println(num3+" is greater");
        }
     }  
   }
}