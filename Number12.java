class Number1
{
  public static void main(String args[])
  { 
    int num=121;
    double num1=Math.sqrt(num);
    if(num>=10 && num<=99)
    {
       if(num%2==0)
       System.out.println("it is 2 digit even");
       else
       System.out.println("it is  2 digit odd"); 
    }
    else{
       if(num1==(int)num1)
       System.out.println("perfect");
       else
       System.out.println("not perfect");
   }
  }
}class main2
{
   public static void main(String []args)
   {
      String arr[]={"even","odd"};
      int n =10;
      System.out.println(arr[n%2]);
   }
}
class main
{
   public static void main(String []args)
   {
   int num=5;
   if(num%2==0)
   System.out.println("even");
   else
   System.out.println("odd");
   }
}
class main1
{
   public static void main(String []args)
   {
      int num=5;
      System.out.println((num%2==0)?"even":"odd");
   }
}
