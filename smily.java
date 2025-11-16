import java.util.Scanner;
class main
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    int num;
    while(true)
    {
      System.out.println("enter any number");
      num=sc.nextInt();
      if(num%2==0)
      {
          System.out.println("even");
      }
      else
      {
         System.out.println("odd");
      }
       System.out.println("do u want to continue");
       String str=sc.next();
       if(!str.equals("yes"))
       {
          System.out.println("thank you");
          break;
       }
    }
  }
}
