class main
{
   public static void main(String[]args)
   {
      int num=153,rem=0,count=0,copy=num,sum=0;
      while(num!=0)
      {
         count++;
         num/=10;
      }
      num=copy;
        while(num!=0)
        {
           rem=num%10;
           sum=sum+(int)Math.pow(rem,count);
           num/=10;
        }  
        System.out.println(sum==copy?"arm":"not arm");
    }
}