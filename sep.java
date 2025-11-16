class main
{
   public static void main(String []args)
   {
     Sample sample1=new Sample();
     sample1.isInteger();
     System.out.println(sample1.isInteger());
     double d=sample1.isDouble();
     boolean b=sample1.isBoolean();
     System.out.println(d+" "+b);
   }
}
class Sample
{
  int isInteger()
  {
     return 2;
  }
  double isDouble()
  {
     return 45.89;
  }
  boolean isBoolean()
  {
    return false;
  }
}