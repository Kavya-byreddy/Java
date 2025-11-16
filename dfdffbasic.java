class number4
{
    public static void main(String []args)
    {
       int hours=24;
       int minutes=60*hours;
       System.out.println(minutes);
    }
}  
class number5
{
   public static void main(String []args)
   {
      System.out.println("Learn Programming..build a better future"+'\n'+"Learn Programming/build a better future");
   }
}
class time
{
    public static void main(String []args)
    {
        int minutes=29;
        int second=60*minutes;
        System.out.println(second);
    }
}
class time1
{
public static void main(String []args)
   {
      int seconds=120;
      int minutes=seconds/60;
      int minutes2=seconds%60;
      System.out.println(minutes+"."+minutes2+" minutes");
   }
}
class interest
{
   public static void main(String []args)
   {
     int minutes=56;
     int hours=minutes/60;
     int hours1=minutes%60;
     System.out.println(hours+" "+hours1);
    
   }
}
class interest1
{
   public static void main(String []args)
   {
      int p=1000,t=2,r=3;
      int si=p*t*r/100;
      System.out.println(si);
   }
} 
class max
{
   public static void main(String []args)
   {
      int num=0;
      num+=Math.pow(10,3);
      System.out.println(num);
   }
}
class max1
{
   public static void main(String []args)
   {
      int num=5;
      double num1=Math.sqrt(num);
      if(num1==(int)num1)
      {      }
      else
      {
      System.out.println("not perfect");
      }

    }   
} 

class max2
{
   public static void main(String []args)
   {
      int num1=23,num2=56;
      System.out.println((num1+num2)+"\n"+(num1-num2)+"\n"+(num1*num2)+"\n"+(num1/num2)+"\n"+(num1%num2));
      System.out.println("name=kavya"+"\n"+"age=22");
   }
}
class avg_numbers
{
   public static void main(String []args)
   {
      int num1=35,num2=34,num3=71;
      double num=(num1+num2+num3)/3;
      System.out.println(num);
   }
}
class square_number
{
    public static void main(String []args)
    {
         int num=8;
         int num1=(int)Math.pow(num,2);
         int num2=(int)Math.pow(num,3);
         System.out.println("square_num ="+num1+" "+"cube_num="+num2);
    }  
}
class students
{  
    public static void main(String []args)
    {
       int roll=10,m1=25,m2=24,m3=23;
       String name="kavya";
       String email="kavya@gmail.com";
       String section="a";
       int max_marks=75;
       int total_marks=m1+m2+m3;
       double percentage=(double)total_marks/max_marks*100.0;
       System.out.println("roll= "+roll+"\n"+"name= "+name+"\n"+"email= "+email+"\n"+"section= "+section+"\n"+"percentage= "+percentage);
    }
}
class shop
{   
   public static void main(String []args)
   {   
       String product_code="AX123";
       String name="book";
       int price=345,quantity=9;
       int amount=price*quantity;
       double discount=7.5/100*amount;
       double bill=amount-discount;
       System.out.println("product_code="+product_code+" "+"name="+name+" "+"price="+price+" "+"quantity="+quantity+" "+"amount="+amount+" "+"discount="+discount+" "+"bill="+bill);
   }
}
class employee
{ 
    public static void main(String []args)
    {
      int emp_id=101;
      double basic_salary=30000;
      String name="kavya";
      double ta=11.5/100*basic_salary;
      double da=3.5/100*basic_salary;
      double hra=15.5/100*basic_salary;
      double total_salary=basic_salary+ta+da+hra;
      double cgst=5.0/100*total_salary;
      double sgst=5.0/100*total_salary;
      double final_salary=total_salary+cgst+sgst;
      System.out.println("emp_id="+emp_id+"\n"+"name="+name+"\n"+"ta="+ta+"\n"+"da="+da+"\n"+"hra="+hra+"\n"+"total_salary="+total_salary+"\n"+"cgst="+cgst+"\n"+"sgst="+sgst+"\n"+"final_salary="+final_salary);
    }
}
class swap
{
   public static void main(String []args)
   {
     int num1=34,num2=45;
     num1=num1+num2;
     num2=num1-num2;
     num1=num1-num2;
     System.out.println(num1+" "+num2);
   }
}
class swap1
{
   public static void main(String []args)
   {
     int num1=34,num2=58,num3=0;
     num3=num1;
     num1=num2;
     num2=num3;
     System.out.println(num1+" "+num2);
   }
}
class swap3
{
    public static void main(String []args)
    {
      int a=45,b=37;
      a=a^b;
      b=a^b;
      a=a^b;
      System.out.println(a+" "+b);
    }
}









