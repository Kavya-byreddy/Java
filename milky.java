import java.util.Scanner;
class main
{
   public static void main(String []args)
   {
       int num,count=0;
       Scanner sc=new Scanner(System.in);
       while(true)
       {
          System.out.println("enter any value");
          num=sc.nextInt();
          for(int i=2;i<=num/2;i++)
          {
             if(num%i==0)
             {
               count++;
               break;
             }
          }
          if(count==0)
          System.out.println("prime");
          else
          System.out.println("not prime");
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