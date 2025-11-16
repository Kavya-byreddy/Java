class Main
{
    public static void main(String[]args)
    {
       Child child=new Child(10,"vyshu");
       System.out.println(child.printData());
    }
}
class Child extends Parent
{
   int roll;String name;
    Child(int roll,String name)
    {
       super(20,"kavya");
       this.roll=roll;this.name=name;
    }
String printData()
   {
      return super.roll+" "+super.name+" "+this.roll+" "+this.name;
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

   }