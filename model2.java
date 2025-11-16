//model 2 palindrome or not
class main
{
   public static void main(String[]args)
   {
      Sample sample=new Sample();
      int copy=sample.num;
      sample.num=123;
      sample.num=copy;
      sample.palin();
   }
}
class Sample
{
   int num,rev;
   int calpalin(int num)
   {
     while(num!=0)
     {
       rev=rev*10+(num%10);
       num/=10;
     }
     return rev;
   }
   void palin()
   {
     System.out.println(rev==num?"palimd":"not");
   }
}