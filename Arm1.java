class Arm1
{
  public static void main(String []args)
  {
    Arm arm=new Arm();
    arm.num=153;
    int copy=arm.num;
    arm.calCount();
    arm.num=copy;
    arm.calSum();
    arm.num=copy;
    arm.checkArm();
  }
}
class Arm
{
   int num,count,rem,copy,sum;
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
      while(num!=0)
      {
      rem=num%10;
      sum=sum+(int)Math.pow(rem,count);
      num/=10;
      }
   }
   void checkArm()
   {
      if(sum==num)
      System.out.println("Armstrong");
      else
      System.out.println("not Armstrong");
   }
}
