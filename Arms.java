class Arm
{
  int num,count,sum,rem,copy;
  int calArm()
  {
       while(num!=0)
       {
         count++;
         num/=10;
       }
       num=copy;
       while(num!=0)
       {
         rem=num%10;
         sum=sum+(int)Math.pow(rem,count);
         num/=10;
       }
         return sum;
  }
   public static void main(String []args)
   {
     Arm arm=new Arm();
     arm.num=153;arm.copy=arm.num;
     int result=arm.calArm();
     System.out.println(result==arm.copy?"Arm":"not arm");
   }
}