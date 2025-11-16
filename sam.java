class sample1
{
   public static void main(String []args)
   {
       int num=251816,rem=0;
       int n2=0,sum=0;
       while(num!=0)
       {
          rem=num%10;  
            if(rem%2==0)
            {
                sum=sum+rem;
                n2=(int)Math.sqrt(sum);
                  if(sum==(n2*n2))
                   System.out.println(sum);
            }
               num/=10;
        }
   }
}
class sample2
{
   public static void main(String []args)
   {
      int num=251816,rem=0;
       int n2=0,sum=0;
       while(num!=0)
       {
          rem=num%10;  
            if(rem%2==0)
            {
                sum=sum+rem;
                n2=(int)Math.sqrt(sum);
                  if(sum==(n2*n2))
                   System.out.println(sum);
            }
               num/=10;
        }

   }
}