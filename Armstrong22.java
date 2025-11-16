class sample
{
   public static void main(String []args)
   {
     Arm arm1=new Arm();
     arm1.num=;
     arm1.calCount();
     arm1.calSum();
     arm1.calArmstrong();
   }
}
class Arm
{
   int num,rem,count,sum,copy;
   void calCount()
   {
     while(num!=0)
     {
     count++;
     num/=10;
     }
   }
   void calSum()
   {
   num=copy;
   while(num!=0)
   {
    rem=num%10;
    count++;
    sum=sum+(Math.pow(rem,count));
    num/=10;
   }
   }
   void calArmstrong()
   {
    if(sum==copy)
    System.out.println("Armstrong");
    else
    System.out.println("not Armstrong");
   } 
}