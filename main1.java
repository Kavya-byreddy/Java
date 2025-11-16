class main
{
   public static void main(String []args)
   {
      Arm arm=new Arm();
      arm.num=153;int copy=arm.num;
      int count=arm.calCount(arm.num);
      arm.num=copy;
      int result=arm.calSum(count);
      arm.num=copy;
      arm.isArm(result);
   }
}
class Arm
{
   int num,count,rem,sum,rev;
   int calCount(int num)
   {
     while(num!=0)
     {
       count++;
       num/=10;
     }
     return count;
   }
   int calSum(int count)
   {
      while(num!=0)
      {
        rem=num%10;
        sum=sum+(int)Math.pow(rem,count);
        num/=10;
      }
      return sum;
   }
   void isArm(int result)
   {
      System.out.println(num==rev?"Arms":"not");
   }
}