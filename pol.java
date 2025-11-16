class Child extends Parent
{
   void m1()
   {
        System.out.println("Child");
   }
   public static void main(String[]args)
   {
      Child child=new Child();
      child.m1();
   }
}
class Parent
{
   void m1()
   {
       System.out.println("Parent");
   }
}
