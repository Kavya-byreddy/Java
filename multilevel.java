class main
{
     public static void main(String[]args)
     {
        Developer developer=new Developer();
     }
}
class Person
{
    Person()
    {
      System.out.println("I am grandfather");
    }
}
class Employee extends Person
{
    Employee()
    {
      System.out.println("I am father");
    }
}
class Developer extends Employee
{
    Developer()
    {
      System.out.println("I am child");
    }
}