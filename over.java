class Main extends Parent
{
   @Override
      void m2()
      {
         System.out.println(" I m overridden m2");
      }
    public static void main(String[]args)
   {
   }
}
abstract class Parent
{
   void m1()
   {
     System.out.println("im m1");
   }
   abstract void m2();
}