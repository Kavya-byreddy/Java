class greatest_num
{
    public static void main(String []args)
    {
       int num1=312,num2=90;
       if(num1>num2)
       {
       System.out.println("num1 is greater="+num1);
       }
       else
       {
       System.out.println("num2 is greater="+num2);
       }
    }
}
class smaller_num
{
    public static void main(String []args)
    {
       int num1=100,num2=20,num3=30;
       if(num1<num2)
       {
          if(num1<num3)
          {
             System.out.println("smallest number is ="+num1);
          }
          else
          {
              System.out.println("smallest number is ="+num3);
          }
       }
       else
       {
          if(num2<num3)
          {
            System.out.println("smallest number is="+num2);
          }
          else
          { 
           System.out.println("smallest number is="+num3);
          }
       }
    }
}
class numberr
{
   public static void main(String []args)
   {
      int num=0;
      if(num>0)
      {
        System.out.println("positive");
       }  
       else
        {
           if(num<0)
           {
           System.out.println("negative"); 
           }
           else
           {  
           System.out.println("zero");
           }
        }
      
   }
}
class number1
{
  public static void main(String []args)
  {
    char ch='6';
      if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
       {
         System.out.println("alphabet");
       }
      else
      {
        if(ch>='0' && ch<='9')
        
          System.out.println("number");
        
        else
        
          System.out.println("symbol");
        
      }
  }
}
class number2
{
   public static void main(String []args)
   {
     char ch='A';
     if(ch>='a' && ch<='z')
     
       System.out.println("lower case");
      else
     {
       if(ch>='A' && ch<='Z')
       
         System.out.println("upper case");
       else
        {
         if(ch>='0' && ch<='9')
         
           System.out.println("number");
         
         else
         
           System.out.println("symbol");
         
        }
     }
   }
}
class vow
{
   public static void main(String []args)
   {
      char ch='z';
      if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u')
      System.out.println("vowel");
      else
      System.out.println("not a vowel");
   }
}
class sym
{
   public static void main(String []args)
   {
     char ch=' ';
     if(ch=='\0')
     System.out.println("null");
     else
     System.out.println("space");
     
   }
}
class vote
{
    public static void main(String []args)
    {
     int age=17;
     String nationality="indian";
     if(age>=18 && nationality=="indian")
     {
        System.out.println("eligible for voting");
     }
     else
     {
       System.out.println("not eligible for voting");
     }
    }
}
class job
{
   public static void main(String []args)
   {
    int marks=62;
    int attendence=76;
     if(marks>60 && attendence>75)
     System.out.println("eligible for the placement drive");
     else
     System.out.println("not eligible for the placement drive");
   }
}
class leap_year
{
   public static void main(String []args)
   {
     int year=1900;
     if(year%4==0 || year%400==0)
     System.out.println("leap year");
     else
     System.out.println("not a leap year");
       
   }
}
class lower
{
   public static void main(String []args)
   {
        char ch='G';     
        if(ch>='a' && ch<='z')
        {
        ch-=32;
        System.out.println(ch);
        }
        else
        {
        ch+=32;
        System.out.println(ch);
        }
   }
}
class kkk
{
   public static void main(String [] args)
   {
       int num=423;
       if(num>=0 && num<=9)
       System.out.println("single digit number");
       else if(num>=10 && num<=99)
       System.out.println("two digit number");
       else if(num>=100 && num<=999)
       System.out.println("three digit number");
       else
       System.out.println("more than three digit number");

   }
}
class month
{
  public static void main(String []args)
  {
     int month=9;
     if(month==1)
     System.out.println("january");
     else if(month==2) 
     System.out.println("feb");
     else if(month==3) 
     System.out.println("march");
     else if(month==4) 
     System.out.println("april");
     else if(month==5) 
     System.out.println("may");
     else if(month==6) 
     System.out.println("june");
     else if(month==7) 
     System.out.println("july");
     else if(month==8) 
     System.out.println("august");
     else if(month==9) 
     System.out.println("septem");
     else if(month==10) 
     System.out.println("octo");
     else if(month==11) 
     System.out.println("nov");
     else if(month==12) 
     System.out.println("dec");
    
  }
}
class day
{
  public static void main(String []args)
  {
     int day=6;
     if(day==1)
     System.out.println("monday");
     else if(day==2) 
     System.out.println("tuesday");
     else if(day==3) 
     System.out.println("wednesday");
     else if(day==4) 
     System.out.println("thrusday");
     else if(day==5) 
     System.out.println("friday");
     else if(day==6) 
     System.out.println("saturday");
     else
     System.out.println("sunday");
}
}
class numberr1
{
  public static void main(String []args)
  {
    int num=-12;
    if(num>0)
    System.out.println("positive");
    else
    System.out.println("negative");
  }
}
class even
{
   public static void main(String []args)
   {
     int num=46;
     if(num%2==0)
     System.out.println("even");
     else
     System.out.println("odd");
   }
}
class divisible
{
   public static void main(String []args)
   {
     int num1=20,num2=20;
     if(num1%num2==0)
     System.out.println("divisible");
     else
     System.out.println("not divisible");
   }
}
class eligible
{
   public static void main(String []args)
   {
      int age=19;
      if(age>18)
      System.out.println("eligible to vote");
      else
      System.out.println("not eligible");
   }
}
class num2
{
  public static void main(String []args)
  {
   int num1=27,num3=20 ;
   if(num1==num3)
   System.out.println("equal");
   else
   System.out.println("not equal");
  }
}
class num3
{
   public static void main(String []args)
   {
     int num=55;
     if(num%10==0)
     System.out.println("divisible");
     else
     System.out.println("not divisible");
   }
}
class num4
{
   public static void main(String []args)
   {
     int num=510;
     if((num/10)*10==num)
     System.out.println("multiple");
     else
     System.out.println("not multiple");
   }
}
class num5
{
   public static void main(String []args)
   {
     int num=45;
     if(num>53)
     System.out.println("greater");
     else
     System.out.println("not greater");
   }
}
class num6
{
   public static void main(String []args)
   {
    int num1=5,num2=29;
    if(num2==(int)Math.pow(num1,2))
    System.out.println("square");
    else
    System.out.println("not square");
   }
}
class num7
{
    public static void main(String []args)
    {
       String name1="kavya";
       String name2="kavya";
       if(name1==name2)
       System.out.println("equal");
       else
       System.out.println("not equal");     
    }
}
class num8
{
    public static void main(String []args)
    {
       char ch='a';
       if(ch=='A')
       System.out.println("equal");
       else
       System.out.println("not equal");     
    }
}
class student
{
  public static void main(String []args)
  {
      int roll=10,m1=50,m2=44,m3=49;
      double donation=0,scholarship=0,fee=50000,cgst=0,sgst=0;  
      String name="kavya";
      char sec='a';
      String email="kavya@gmail.com";
      int total_marks=m1+m2+m3;
      int max_marks=150;
      String section=" ";
      double gst=cgst+sgst;
      double t_fee=fee+donation,total_fee=t_fee-scholarship;
      double final_fee=total_fee+gst;
      double percentage=total_marks/150.0*100;
      if(percentage>80)
      {
          scholarship=10.0/100*fee;
          cgst=5.0/100*fee;
          sgst=5.0/100*fee;
          section="cream";
          }
       else if(percentage<80)
           {
           scholarship=0;
           donation=5000;
           cgst=5.0/100*fee;
           sgst=5.0/100*fee;
           }
        else if(total_marks>35)
           {
           System.out.println("passed all subjects");
           }
        else if((m1<35)||(m2<35)||(m3<35))
           {
           System.out.println("failed in one subject");
           }
         else if(section=="B")
           {
             section="A";
           System.out.println(section);
           }
         else if(roll<100)
           {
           System.out.println("old admission");
           }
          else if(roll>=100)
           {
           System.out.println("new admission");
           }
           else 
           {
           percentage=80;
           System.out.println("just missed scholarshiop");
           }    System.out.println("roll"+roll+'\n'+"name"+name+'\n'+"sec"+sec+'\n'+"email"+email+'\n'+"section"+section+'\n'+"scholarship"+scholarship+'\n'+"cgst"+cgst+'\n'+"sgst"+sgst+'\n'+"gst"+gst+'\n'+"t_fee"+t_fee+'\n'+"final_fee"+final_fee);       
  }
}




















