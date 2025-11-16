class main
{
   public static void main(String []args)
   {
      int num=607564,rem=0;
      boolean status=false;
      while(num!=0)
      {
        rem=num%10;
        num/=10;
        if(rem==5)
        {
           status=true;
        System.out.println("five is present");
          break;
        }
        else
        System.out.println("not");
       
       }
    
     
   }
           
}