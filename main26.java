class main
{
   public static void main(String []args)
   {
      Student student=new Student();
      student.name="kavya";student.roll=10;student.email="kavya@gmail.com";
      int T=student.calTotal(20,19,18);
      double p=student.calPercentage((int)T);
      int sch=student.calScholership((int)p);
      int F=student.calFinalTotal(50000,sch,5000);
      System.out.println(student.email+" "+student.name+" "+student.roll+" "+T+" "+p+" "+sch+" "+F);
   }
}
class Student
{
   int roll,m1,m2,m3,total,FinalTotal,scholership;
   String name,email;
   double percentage;
   int calTotal(int m1,int m2,int m3)
   {
     total=m1+m2+m3;
     return total;
   }
   double calPercentage(int total)
   {
     percentage=total/60.0*100;
     return percentage;
   }
   int calScholership(int percentage)
   {
      if(percentage>50)
      scholership=3000;
      else
      scholership=1000;
       return scholership;
   }
   int calFinalTotal(int fee,int scholership,int donation)
   {
      FinalTotal=(fee+donation)-scholership;
      return FinalTotal;
   }
}