class main
{
   public static void main(String[]args)
   {
       Child1 child1=new Child1();
       Child2 child2=new Child2();
       Child3 child3=new Child3();
   }
}
class Child1 extends Parent
{
   Child1()
   {
      super(10);
      System.out.println("I am child1 class");
   }
}
class Child2 extends Parent
{
   Child2()
   {
      System.out.println("I am child2 class");
   }
}
class Child3 extends Parent
{
   Child3()
   {
      System.out.println("I am child3 class");
   }
}
class Parent
{
   Parent(int x)
   {
      System.out.println("I am parent class");
   }
   Parent()
   {
   }
}