class sample
{
   public static void main(String []args)
   {
     Prim prim1=new Prim();
     prim1.num=11;
     prim1.calFactor();
     prim1.checkPrime();
   }
}
class Prim
{
    int num,count;
    void calFactor()
    {
        for(int i=2;i<=num/2;i++)
        {
          if(num%2==0)
          count++;
        }         
     }
     void checkPrime()
     {
       if(count==0)
       System.out.println("prime");
       else
       System.out.println("not prime");
     }
}