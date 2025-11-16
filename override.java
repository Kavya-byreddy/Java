class Main
{
    public static void main(String[]args)
    {
       Parent parent=new Child();
       System.out.println(parent.m1());
    }
}
class Child extends Parent
{
    String m1()
    {
         return "im child";
    }
}
class Parent
{
    String m1()
    {
         return "i'm parent";
    }
}