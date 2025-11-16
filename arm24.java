class main
{
   public static void main(String []args)
   {
    Arm arm=new Arm();
    arm.number=153;int copy=arm.number;
    arm.calDigit();
    arm.number=copy;
    arm.calNum();
    arm.number=copy;
    arm.calArms();
    System.out.println(arm.calArms());
   }
}
class Arm
{
   int number,count,rem,sum;
   int calDigit()
   {
     while(number!=0)
     {
       count++;
       number/=10;
     }
     return count;
   }
  int calNum()
  {
   while(number!=0)
   {
    rem=number%10;
    sum=sum+(int)Math.pow(rem,count);
    number/=10;
   }
   return sum;
  }
  String calArms()
  {
   if(number==sum)
   return "Armstrong";
   else
   return "not armstrong";
  }
}