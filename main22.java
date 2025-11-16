class main
{
   public static void main(String []args)
   {
      Student student1;
      student1=new Student();
      System.out.println("Before the method");
      student1.firstMethod();
      student1.secondMethod();
      student1.thirdMethod();
      student1.fourMethod();
      student1.fiveMethod();
      System.out.println("after the method");
      
   }
}
class Student
{
   void firstMethod()
   {
   System.out.println("this is my first class");
   }
   void secondMethod()
   {
   System.out.println("this is my second class");
   }
   void thirdMethod()
   {
   System.out.println("this is my third class");
   }
  void fourMethod()
   {
   System.out.println("this is my four class");
   }
   void fiveMethod()
   {
   System.out.println("this is my five class");
   }
}