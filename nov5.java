class Child extends Parent
{
     Child()
     {
         System.out.println("i am in child class");
     }
     public static void main(String[]args)
     {
        Child child=new Child();
     }
}
class Parent
{
   Parent()
   {
         System.out.println("i am in parent class");      
   }
}