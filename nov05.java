class Main
{
      public static void main(String[]args)
      {
         Orders orders=new Orders();
         System.out.println(orders.printData());
      }
}
class Orders extends Customers
{
    Orders()
    {
    super(10,"kavya");
    }
}
class Customers
{
   int id;
   String name;
   Customers(int id,String name)
   {
      this.id=id;
      this.name=name;
   }  
    String printData()
    {
        return id+" "+name;
    }
}