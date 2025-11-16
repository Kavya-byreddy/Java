class main
{
    public static void main(String[]args)
    {
      Parent parent=new Child();
      parent.m3();
    }
}
class Parent
{
   void m3()
   {
      System.out.println("one");
   }
}
class Child extends Parent
{
  void m1()
   {
      System.out.println("two");
   }
  void m2()
   {
      System.out.println("three");
   }
}
//final variable
class main1
{
   public static void main(String[]args)
   {
     int a=10;
     a+=20;
     System.out.println(a);
   }
}
class main2
{
   public static void main(String[]args)
   {
       main22 main21=new main22();
       main21.m1();
       main21.m2();
   }
}
class main22 extends main2
{
      final void m1()
      {
         System.out.println("m1");
      }
      void m2()
      {
         System.out.println("m2");
      }
}
