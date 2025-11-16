import java.util.Scanner;
class main
{
   public static void main(String []args)
   {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter any value");
   int num=sc.nextInt();
   int count=0;
   for(int i=2;i<=num/2;i++)
   { 
    if(num%i==0)
     {
       count++;
       break;
     }
    }
     System.out.println(count==0?"prime":"not prime");
     System.out.println("Do u want to continue?(yes/no:");
     
   }
}