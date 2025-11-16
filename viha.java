class main
{
   public static void main(String []args)
   {
      Student student=new Student();
      student.name="kavya";
      student.roll=10;student.email="kavya@gmail.com";
      int T=student.calTotal(50,49,47);
      double P=student.calPercentage((int)T);
      int Sch=student.calScholership((int)P);
      int F=student.finalFee(100000,Sch,20000);
      System.out.println(student.name+" "+student.roll+" "+student.email+" "+T+" "+P+" "+Sch+" "+F);
   }
}
class Student
{
   int roll,m1,m2,m3,Finalfee,total;
   String name,section,email;
   int scholership,fee,donation;
   double percentage;
   int calTotal(int m1,int m2,int m3)
   {
     total=m1+m2+m3;
     return total;
   }
   double calPercentage(int total)
   {
     percentage=total/150.0*100;
     return percentage;
   }
   int calScholership(int percentage)
   {
     if(percentage>=75)
     scholership=5000;
     else
     scholership=1000;
        return scholership;
   } 
   int finalFee(int fee,int scholership,int donation)
   {
     Finalfee=(fee+donation)-scholership;
     return Finalfee;
   }
}