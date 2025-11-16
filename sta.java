class main
{
   public static void main(String[]args)
   {
      Parent child=new Child();
      child.m2();
   }
}
class Child extends Parent
{
   void m1()
   {
      System.out.println("I am non static m1 child");
   }
   static void m2()
   {
     System.out.println(" I am static m2 child");
   }
}
class Parent
{
   void m1()
   {
      System.out.println("I am non static m1 parent");
   }
static void m3()
   {
     System.out.println(" I am static m2 parent");
   }
}