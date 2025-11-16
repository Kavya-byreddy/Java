class kav
{
  public static void main(String []args)
  {
   int num=143,rem=0,sum=0,count=0,copy=num;
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
    if(sum==copy)
    System.out.println("armstrong");
    else
    System.out.println("not armstrong");
  }
}
class kav1
{
  public static void main(String []args)
  {
   int num=5,count=0;
   for(int i=2;i<=num/2;i++)
   {
     if(num%i==0)
     {
     count++;
     }
   }
     if(count==0)
     System.out.println("prime");
     else
     System.out.println("not prime");
  }
}