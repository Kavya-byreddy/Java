import java.util.Scanner;
class main
{
   public static void main(String []args)
   {
     Scanner sc=new Scanner(System.in);
     while(true)
     {
     int num;
     System.out.println("enter your number");
     num=sc.nextInt();
     if(num%2==0)
     System.out.println("even");
     else
     System.out.println("odd");
     System.out.println("do u want to stay here");
     String str=sc.next();
     if(!str.equals("yes"))
     {
       System.out.println("thank u visit again");
        break;
     }
     }
   }
}