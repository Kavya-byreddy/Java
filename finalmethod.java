//final method
class main
{
   public static void main(String[]args)
   {
       Parent parent=new Parent();
       parent.m1();
   }
}
class Parent 
{
      void m1()
      {
         System.out.println("m1");
      }
      void m2()
      {
         System.out.println("m2");
      }
}
final class Child extends Parent 
{
      void m1()
      {
         System.out.println("m3");
      }
      void m2()
      {
         System.out.println("m4");
      }
}

