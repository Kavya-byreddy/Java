//method overloading
class main
{
   public static void main(String[]args)
   {
      Method method=new Method();
      method.m1();
      method.m2(10);
      method.m3(10,"kavya");
   }
}
class Method
{
   void m1()
       {
           System.out.println("no parameters");
       } 
    void m2(int a)
       {
           System.out.println("one parameters");
       }
    void m3(int a,String b)
       {
           System.out.println("two parameters");
       }
}
//---------------------------------------------------------------------
//constructor overloading
class main1
{
   public static void main(String[]args)
   {
      Myclass m1=new Myclass();
      Myclass m2=new Myclass(10);
      Myclass m3=new Myclass(12,"sravya");
   }
}
class Myclass
{
   Myclass()
   {
      System.out.println("without parameters"); 
   }
   Myclass(int a)
   {
      System.out.println("with 1 parameters"); 
   }
   Myclass(int a,String b)
   {
      System.out.println("with 2 parameters"); 
   }
}
