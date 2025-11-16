class Main
{
    public static void main(String[]args)
    {
       Child child=new Child();
    }
}
class Child extends Parent
{
   Child()
   {
      super(83,"Hi");
      System.out.println("I am child default");
   }
}
class Parent
{
   Parent()
   {
      System.out.println("i am default");
   }
   Parent(int x,String y)
   {
     System.out.println("I an parent default");
   }
}