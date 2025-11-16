class main
{
   public static void main(String []args)
   {
     Prime prime=new Prime();
     prime.num=7;
     int result=prime.calPrime();
     prime.isPrime(result);
   }
}
class Prime
{
  int num,count=0;
  int calPrime()
  {
     for(int x=2;x<=num/2;x++)
     {
       if(num%x==0)
       {
         count++;
         break;
       }
     }
   return count;
  } 
  void isPrime(int result)
  {
    System.out.println(result==0?"prime":"not prime");
  }
}