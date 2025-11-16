class main
{
  public static void main(String []args)
  {
    int x=34,y=56;
    System.out.println(++x);//35
    System.out.println(y++);//56
    System.out.println(x);//35
    System.out.println(y);//57
  }
}
class main1
{
  public static void main(String []args)
  {
    int x=45,y=55;
    System.out.println(--x+" "+y--);
    System.out.println(x+" "+y);//35
   
  }
}
class main2
{
  public static void main(String []args)
  {
    int x=45,y;
    y=x++ + ++x + --x - x-- + x - ++x + x++;
    System.out.println(x+" "+y);
   
  }
}
class main3
{
  public static void main(String []args)
  {
    int x=45,y=43,z=34;
    z=x++ - y-- + ++z - ++y + y++ - x++ + --y - z-- + x - y/2;
    System.out.println(x+" "+y+" "+z);
   
  }
}
class main4
{
  public static void main(String []args)
  {
    int x=23,y=46,z=34;
    z=--x + x++ - y++ - --z + y-- + z++ - x++ + --y - y--;
    System.out.println(x+" "+y+" "+z);
   
  }
}
class main5
{
  public static void main(String []args)
  {
    int x=57,y=86,z=90;
    z=x++ - --y + y++ - --x + --z - z++ - x++ + z-- + y++ - x++;
    System.out.println(x+" "+y+" "+z);
   
  }
}
class main6
{
  public static void main(String []args)
  {
    int x=56,y=10,z=15;
    z=--x + y++ - z++ + x++ - y-- + z-- - x++ - x-- + y;
    System.out.println(x+" "+y+" "+z);
   
  }
}
class main7
{
  public static void main(String []args)
  {
    int x=73,y=226,z=40;
    x=y++ + --y - x++ - z++ + --x + z + x-- - y++ + z - x++ - z--;
    System.out.println(x+" "+y+" "+z);
   
  }
}
class main8
{
  public static void main(String []args)
  {
    int x=105,y=207,z=312;
    y=x++ - y-- + ++z - --x - y-- + --z +  y-10 - x++ + z-- + z*2 + x+2;
    System.out.println(x+" "+y+" "+z);
   
  }
}
class main9
{
  public static void main(String []args)
  {
    int x=100,y=200,z=300;
    y=x-- + y++ - --z + z++ - y-- + --x + z-- + z/2;
    System.out.println(x+" "+y+" "+z);
   
  }
}
class main10
{
  public static void main(String []args)
  {
    int x=47,y=68,z=57;
    y=--x + z-- + y++ - x++ + z-- - z++ + x-- - y-- + x/2;
    System.out.println(x+" "+y+" "+z);
   
  }
}
class main12
{
   public static void main(String []args)
   {
     double num=23;
     int num1=(int)num;
     System.out.println(num1);
   }
} 
class main13
{
   public static void main(String []args)
   {
     long num=2333;
     int num1=(int)num;
     System.out.println(num1);
   }
} 
class main14
{
   public static void main(String []args)
   {
     float num=2453.5f;
     double num1=num;
     System.out.println(num1);
   }
} 
class main15
{
   public static void main(String []args)
   {
      String designation="analyst";
      int experience=12,bonus=0,basic_salary=0;
      String location="coimbatore";
      int total_allowance=0;
      if(designation=="manager")
      basic_salary=70000;
      else if(designation=="developer")
      basic_salary=60000;
      if(designation=="tester")
      basic_salary=40000;
      else
      basic_salary=30000;
      if(experience>5)
      bonus=10000;
      else
      bonus=0;
      if(location=="hyderabad" || location=="chennai" || location=="banguloore")
      total_allowance=5000;
      else
      total_allowance=0;
      int total_salary=basic_salary+bonus;
      System.out.println(total_salary+" "+basic_salary+" "+bonus+" "+total_allowance);

   }
}
class main16
{
   public static void main(String []args)
   {
     String location="chennai";
     int total_allowance=0;
     if(location=="hyderabad" || location=="chennai" || location=="banguloore")
     total_allowance=5000;
     else
     total_allowance=0;
     System.out.println(total_allowance);
    }
}
class main17
{
   public static void main(String []args)
    {
      int year=2025,month=3;
      switch(month)
       {
         case 1,3,5,7,8,10,12:
           System.out.println("31 days");
           break;
         case 2:
            if(year%4==0 && year%100!=0 || year%400==0)
            System.out.println("29 days");
            else
            System.out.println("28 days");
            break;
         default:
          System.out.println("30 days");
       }
     }
}


          



     







