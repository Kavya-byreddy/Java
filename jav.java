import java.util.Scanner;
class main
{
   public static void main(String[]args)
   {
     int num;
     Scanner sc=new Scanner(System.in);
     while(true)
     {
        System.out.println("enter your number");
        num=sc.nextInt();
        System.out.println(num%2==0?"even":"odd");
        System.out.println("do u want to continue");
        String str=sc.next();
         if(!str.equals("yes"))
         {
          System.out.println("thanku");
          break;
         }
     }
   }
}
import java.util.Scanner
class main1
{
   public static void main(String[]args)
   {
      String s="kavya";
      Scanner sc=new Scanner(System.in);
      s=sc.next();
      System.out.println(s);
   }
}