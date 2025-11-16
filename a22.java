class Sample
{
  public static void main(String []args)
  {
      Student student1=new Student();
      student1.name="kavya";student1.roll=10;
      student1.section="c";student1.m1=20;
      student1.m2=20;student1.m3=19;
      student1.max_marks=60;
      student1.caltotal();student1.calpercentage();student1.printData();
      Student student2=new Student();
      student2.name="sravya";student1.roll=20;
      student2.section="c";student2.m1=20;
      student2.m2=20;student2.m3=19;
      student2.max_marks=60;
      student2.caltotal();student2.calpercentage();student2.printData();
   }
}
class Student
{
    String name,section;
    int roll,m1,m2,m3,total;
    double max_marks,percentage;
    void caltotal()
    {
      total=m1+m2+m3;
    }
    void calpercentage()
    {
      percentage=total/max_marks*100;
    }
    void printData()
    {
     System.out.println(name+" "+roll+" "+total+" "+percentage);
    }
}