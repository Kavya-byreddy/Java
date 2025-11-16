class Child extends Parent
{
      Child()
      {
         super(10,"kavya");
    
      }
      public static void main(String[]args)
      {
         Child child=new Child();
         System.out.println(child.printDetail());
      }
}
class Parent
{
  int roll;
  String name;
   Parent(int roll,String name)
   {
     this.roll=roll;this.name=name;       
   }
   String printDetail()
   {
      return roll+" "+name;
   }
}