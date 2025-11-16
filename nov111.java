class main
{
   public static void main(String[]args)
   {
       Parent.m2();
       System.out.println(Parent.institute);
       Parent parent=new Parent();
       System.out.println(parent.roll);
      parent.m1();
   }
}
class Parent
{
    int roll;
    static  String institute;
    void m1()
    {
       System.out.println("m1");
    }
     static void m2()
    {
       System.out.println("m2");
    }
}
