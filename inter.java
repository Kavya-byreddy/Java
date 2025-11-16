class main
{
     public static void main(String[]args)
     {
        Connection con=new ConnectionImpl();
        con.m1();
        con.m2();
     }
}
interface Connection
{
   public void m1();
   public void m2();
}
class ConnectionImpl implements Connection
{
 @Override
 public void m1()
 {
    System.out.println("m1");
 }
@Override
 public void m2()
 {
    System.out.println("m2");
 }
}

class main1
{
   public static void main(String[]args)
   {
      Child child=new Child();
      child.m1();
      child.m2();
   }
}
interface Parent1
{
   public void m1();
}
interface Parent2
{
  public void m2(); 
}
class Child implements Parent1,Parent2
{
    @Override
    public void m1()
    {
       System.out.println("m1");
    }
@Override
    public void m2()
    {
       System.out.println("m2");
    }

}