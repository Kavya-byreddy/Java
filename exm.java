class evil
{
   public static void main(String []args)
   {
     int num=9,rem=0,sum=0;
     int square=(int)Math.pow(num,2);
          while(square!=0)
          {
          rem=square%10;
          sum=sum+rem;
          square/=10;
          }
     System.out.println(sum==num?"evil":"not evil");
   }
}
class power
{
   public static void main(String []args)
   {
      int num=217,rem=0,sum=0,product=0,copy=num;
      while(num!=0)
      {
        rem=num%10;
        sum=sum+rem;
        num/=10;
      }
      num=copy;
      while(num!=0)
      {
        rem=num%10;
        product=product*rem;
        num/=10;
      }
      System.out.println(sum==product?"power":"notpower");
   }
}
class auto
{
   public static void main(String []args)
   {
     int num=6,rem=0,count=0,copy=num;
     int square=(int)Math.pow(num,2);
    while(num!=0)
    {
     num/=10;
     count++;
    }
     num=copy;
     rem=square%(int)Math.pow(10,count);
     System.out.println(square);
     System.out.println(num==rem?"automatic":"not automatic");
   }
}
class tech
{
   public static void main(String []args)
   {
      int num=2025,count=0,rem=0,copy=num;
      while(num!=0)
      {
        count++;
        num/=10;
      } 
      num=copy;
      int num1=num%(int)Math.pow(10,count/2);
      int num2=num/(int)Math.pow(10,count/2);
      int total=num1+num2;
      int square=(int)Math.pow(total,2);
      System.out.println(num==square?"technology":"not technology");
      }
}
class bus
{
  public static void main(String []args)
   {
      int num=12347,rem=0;
      while(num!=0)
      {
        rem=num%10;
        if(rem==7)
         System.out.println("the number is a busy");
        rem=num%7;
        num/=10;
       }
         if(rem==0)
         System.out.println("the number is a busy");
         else
         System.out.println("the number is not a busy");
      }
}
class digit
{
   public static void main(String []args)
   {
     int num=124956,rem=0,max=0;
     while(num!=0)
     {
       rem=num%100;
       if(rem>max)
       max=rem;
       num/=100;
     }
     System.out.println(max);
   }
}
class evil1
{
   public static void main(String []args)
   {
     int num=9,rem=0,sum=0;
     int square=(int)Math.pow(num,2);
     int sq=(int)Math.sqrt(square);
     if(num==sq)
       {
          while(square!=0)
          {
          rem=square%10;
          sum=sum+rem;
          square/=10;
          }
       }
     System.out.println(num==sq && sum==num?"evil":"not evil");
     }
}
class digit1
{
   public static void main(String []args)
   {
     int num=124956,rem=0,max=0,count=0;
     while(num!=0)
     {
       rem=num%100;
       if(rem>max)
       max=rem;
       count++;
       if(count==2)
       {
       System.out.println(max);
       }
       num/=100;
     }
   }
}
class Inav3     
{
  public static void main(String []args)
  {
     int num=199,count=0,copy=num,rem=0,temp=num,sum=0;
      while(num!=0)
      {
        count++;        
        num/=10;
      }
      num=temp;
      if(count==1)
         System.out.println(num==1?"inav":"not inav");
      else
      {
           while(true){
              sum=0;
              while(num!=0)
               {          
                 rem=num%10;
                 num/=10;
                 sum+=rem;
               }
                if(sum==1){
                  System.out.println("inav");
                   break;
                }
                else if(sum<10){
                  System.out.println(" not inav");
                   break;
                }
               else
                 num=sum;
               System.out.println(sum);
           }
      }
  }
}
class incre
{
   public static void main(String []args)
   {
      int num=6789,count=0,rem=0,copy=num,count1=0,count2=0;
      int f=num%10;
      while(num!=0)
      {
         count++;
         num/=10;
      }
      num=copy;
      while(num!=0)
      {
        rem=num%10;
        if(f-rem==1)
        {
           count1++;
           f=rem;
        }
        else
        {
        if(f-rem==-1)
        {
           count2++;
           f=rem;
        }
        }
         num/=10;  
      }
     System.out.println((count-1==count1) || (count-1==count2)?"increasing":"not increasing");
   }
}
class same
{
   public static void main(String []args)
   {
     int num=1111,rem=0,copy=num,count=0,count1=0;
     int f=num%10;
     while(num!=0)
     {
       num/=10;
       count++;
     }
     num=copy;
     while(num!=0)
     {
        rem=num%10;
        num/=10;
        if(f==rem)
        {
           f=rem;
          count1++;
        }
     }
      System.out.println(count==count1?"all are same digits":"digits are different");
   }
}
class digit2
{
   public static void main(String []args)
   {
      int num=7908,rem=0,rev=0,copy=num;
      while(num!=0)
      {
      rem=num%10;
      rev=rev*10+rem;
      num/=10;
      }
      System.out.println(rev);
      while(rev!=0)
      {
         rem=rev%10;
         switch(rem)
         {
         case 1->
         System.out.println("one");
         case 2->
         System.out.println("two");
         case 3->
         System.out.println("three");
         case 4->
         System.out.println("four");
         case 5->
         System.out.println("five");
         case 6->
         System.out.println("six");
         case 7->
         System.out.println("seven");
         case 8->
         System.out.println("eight");
         case 9->
         System.out.println("nine");
         default->
         System.out.println("zero");
         }
        rev/=10;
      }
   }
}
class hub
{
   public static void main(String []args)
   {
      String name="Codinghub ";
      for(int i=1;i<=10;i++)
      {
        System.out.print(name);
      }
   }
}
class chub
{
   public static void main(String []args)
   {
      String name="java";
      String lang="programming";
      for(int i=1;i<=100;i++)
      {
        System.out.println(name);
        System.out.println(lang);
      }
   }
}
class eveod
{
   public static void main(String []args)
   {
    for(int i=100;i>=1;i--)
    {
    if(i%2==0)
    System.out.println(i);
    }
   }
}
class eveod1
{
   public static void main(String []args)
   {
    for(int i=200;i<=400;i++)
    {
    if(i%2!=0)
    System.out.println(i);
    }
   }
}
class fact
{
   public static void main(String []args)
   {
     int num=6,mul=1;
     for(int i=num;i>=1;i--)
     {
          mul=mul*i;
      }
      System.out.println(mul);
     }
}
class squ
{
   public static void main(String []args)
   {
     for(int i=1;i<=10;i++)
     {
     int square=(int)Math.pow(i,2);
     int cube=(int)Math.pow(i,3);
     System.out.println(square+" "+cube);
     }
   }
}
class nat
{
  public static void main(String []args)
   {
     int sum=0;
     for(int i=1;i<=5;i++)
     {
      sum=sum+i;
      }
       System.out.println(sum);
   }
}
class powe
{
  public static void main(String []args)
   {
     int num=3,num2=4,pow1=0;
     pow1=(int)Math.pow(num,num2);
     System.out.println(pow1);
   }
}
class mult
{
  public static void main(String []args)
   {
   int num=29,mul=1;
   for(int i=1;i<=10;i++)
     {
        mul=num*i;
        System.out.println(num+"*"+i+"="+mul);
     }
   }
}
class numbers
{
  public static void main(String []args)
   {
   int num=-490,rem=0,count=0,count1=0,count2=0;
   while(num!=0)
   {
       rem=num%10;
       if(rem==0)
        count++;
       else if(rem>0)
        count1++;
       else
       count2++;
       num/=10;
   }
    System.out.println("zero:"+count);
   System.out.println("postive:"+count1);
   System.out.println("negative:"+count2);
   }
}
class fact1
{
   public static void main(String []args)
   {
      int num=5,count=0;
      for(int i=1;i<=num;i++)
      {
        if(num%i==0)
        {
           //count++;
           System.out.println(i);
        }
      }
   }
}
class uni
{
     public static void main(String []args)
     {
         int i,end=255,count=0;
         for(i=0;i<=end;i++)
         {
          char ch=(char)i;
          count++;
          System.out.println(i+" "+ch);          
         }
          System.out.println(count);          
     }
}
class uni1
{
   public static void main(String []args)
     {
       for(char ch='A';ch<='Z';ch++)
       {
          System.out.println(ch);
       }
     for(char ch='a';ch<='z';ch++)
       {
          System.out.println(ch);
       }

     }
}
class uni2
{
   public static void main(String []args)
     {
      int start,end=57;
      for(start=48;start<=end;start++)
      {
      char ch=(char)start;
      System.out.println(start+" "+ch);
      }
     }
}
class uni3
{
   public static void main(String []args)
     {
       for(char ch='A';ch<='Z';ch++)
       {
          char c=ch;
          c+=32;
          System.out.println(c);
       }
     }
}
class uni4
{
    public static void main(String []args)
    {
      for(char ch='a';ch<='z';ch++)
      {
         char c=ch;
         c-=32;
         System.out.println(c);
      }
    }
}
class uni5
{
   public static void main(String []args)
    {
       int rows=5,cols=5;
       for(int r=1;r<=rows;r++)
       {
         int temp=r;
         for(int c=1;c<=cols;c++)
         {
         
         }
         System.out.println();
       }
    }
}
class uni6
{
   public static void main(String []args)
    {
       int rows=3,cols=5,temp=65;
       for(int r=1;r<=rows;r++)
       {
          for(int c=1;c<=cols;c++)
         {
             System.out.print((char)(temp++)+" ");
         }
         System.out.println();
       }
    }
}
class uni7
{
   public static void main(String []args)
   {
      int rows=4,cols=3;
      char letter='A';
      for(int r=1;r<=rows;r++)
      {
         for(int c=1;c<=cols;c++)
         {
            if(r%2!=0)
            System.out.print(letter+" ");
            else
            System.out.print((char)(letter+32)+" ");
         }
         letter++;
      }
      System.out.println();
   }
}
class uni8
{
    public static void main(String []args)
    {
       int rows=4,cols=5;
       char letter='A';
       for(int r=1;r<=rows;r++)
       {
         for(int c=1;c<=cols;c++)
         {
           System.out.print(letter+"");
           letter++;
         }
          System.out.println();
       }
    }
}
class uni9
{
   public static void main(String []args)
   {
      int rows=4,cols=4;
      char letter='A';
      for(int r=1;r<=rows;r++)
      {
        for(int c=1;c<=cols;c++)
        {
          System.out.print(letter+"");
        }
          letter++;
          System.out.println();
      }
      
   }
}
class uni10
{
    public static void main(String []args)
    {
      int rows=5;
      for(int r=1;r<=rows;r++)
      {
          for(int c=1;c<=r;c++)
          {
            System.out.print(" ");
          }
           for(int c=r;c<=rows;c++)
           {
             System.out.print("#");
           }           
          System.out.println();
      }
    }
}
class patt
{
   public static void main(String []args)
   {
     int rows=3,cols=5;
     for(int i=1;i<=rows;i++)
     {
         for(int j=1;j<=cols;j++)
         {
            System.out.print("* ");
         }
        System.out.println();
     }
   }
}
class patt1
{
  public static void main(String []args)
   {
      int rows=4,cols=5;
      for(int r=1;r<=rows;r++)
      {
         for(int c=1;c<=cols;c++)
         {
           if(r==2&&c==1 || r==3&&c==3 || r==4&&c==4)
           System.out.print("#");
           else
           System.out.print("%");
         }
         System.out.println();
      }
   }
}
class patt2
{
  public static void main(String []args)
   {
      int rows=5,cols=5;
      for(int r=1;r<=rows;r++)
      {
         for(int c=1;c<=cols;c++)
         {
            if(r==1 || r==rows)
            System.out.print("#");
            else
            System.out.print("$");
         }
         System.out.println();
      }
   }
}
class patt3
{
  public static void main(String []args)
   {
      int rows=4,cols=5;
      for(int r=1;r<=rows;r++)
      {
         for(int c=1;c<=cols;c++)
         {
            if(r==1 || r==rows || c==1 ||c==cols)
            System.out.print("#");
            else
            System.out.print("$");
         }
         System.out.println();
      }
   }
}
class patt4
{
  public static void main(String []args)
   {
      int rows=5,cols=5;
      for(int r=1;r<=rows;r++)
      {
         for(int c=1;c<=cols;c++)
         {
            if(r==c)
            System.out.print("#");
            else
            System.out.print("$");
         }
         System.out.println();
      }
   }
}
class patt5
{
  public static void main(String []args)
   {
      int rows=4,cols=5;
      for(int r=1;r<=rows;r++)
      {
         for(int c=1;c<=cols;c++)
         {
            if(r==1 || r==rows || c==1 ||c==cols)
            System.out.print("#");
            else
            System.out.print(" ");
         }
         System.out.println();
      }
   }
}
class patt6
{
  public static void main(String []args)
   {
      int rows=5,cols=5;
      for(int r=1;r<=rows;r++)
      {
         for(int c=1;c<=cols;c++)
         {
            if(r+c==rows+1)
            System.out.print("#");
            else
            System.out.print("^");
         }
         System.out.println();
      }
   }
}
class patt7
{
  public static void main(String []args)
   {
      int rows=7,cols=7;
      for(int r=1;r<=rows;r++)
      {
         for(int c=1;c<=cols;c++)
         {
            if(r==1 || r==rows || c==1 ||c==cols || r==c || r+c==rows+1)
            System.out.print("#");
            else
            System.out.print("@");
         }
         System.out.println();
      }
   }
}
class patt8
{
  public static void main(String []args)
   {
      int rows=4,cols=5;
      for(int r=1;r<=rows;r++)
      {
         for(int c=1;c<=cols;c++)
         {
            if(r%2==0 && c%2==0)
            System.out.print("#");
            else
            System.out.print("$");
         }
         System.out.println();
      }
   }
}
class patt9
{
  public static void main(String []args)
   {
      int rows=5,cols=5;
      for(int r=1;r<=rows;r++)
      {
         for(int c=1;c<=cols;c++)
         {
            System.out.print(r+" ");
         }
         System.out.println();
      }
   }
}
class patt10
{
  public static void main(String []args)
   {
      int rows=5,cols=5;
      for(int r=1;r<=rows;r++)
      {
         for(int c=1;c<=cols;c++)
         {
            System.out.print(c+" ");
         }
         System.out.println();
      }
   }
}
class patt11
{
  public static void main(String []args)
   {
      int rows=4,cols=3,temp=1;
      for(int r=1;r<=rows;r++)
      {
         for(int c=1;c<=cols;c++)
         {
            System.out.print(temp+" ");
            temp++;
         }
         System.out.println();
      }
   }
}
class patt12
{
  public static void main(String []args)
   {
      int rows=4,cols=4;
      for(int r=1;r<=rows;r++)
      {
         int temp=r;
         for(int c=1;c<=cols;c++)
         {
            System.out.print(temp+" ");
            temp++;
         }
         System.out.println();
      }
   }
}
class patt13
{
  public static void main(String []args)
   {
      int rows=5,cols=5;
      for(int r=1;r<=rows;r++)
      {
         for(int c=1;c<=cols;c++)
         {
            if(r==c || r+c==rows+1)
            System.out.print(r+" ");
            else
            System.out.print(" ");
          }
         System.out.println();
      }
   }
}
class patt14
{
  public static void main(String []args)
   {
      int rows=5,cols=5;
      for(int r=1;r<=rows;r++)
      {
         for(int c=1;c<=cols;c++)
         {
            if(r==c || c==(cols-r+1))
            System.out.print(c+" ");
            else
            System.out.print(" ");
          }
         System.out.println();
      }
   }
}
class patt15
{
   public static void main(String []args)
   {
       int rows=3,cols=5;
       char letter='A';
       for(int i=1;i<=rows;i++)
       {
          for(int j=1;j<=cols;j++)
          {
            System.out.print(letter+" ");
            letter++;
          }
           System.out.println();
       } 
   }
}
class patt16
{
   public static void main(String []args)
   {
       int rows=4,cols=3;
       char upper='A';
       for(int i=1;i<=rows;i++)
       {
         for(int j=1;j<=cols;j++)
         {
           if(i%2!=0)
           {
           System.out.print(upper+" ");
           }
           else
           System.out.print((char)(upper+32)+" ");
           upper++;
         }
          System.out.println();
       }
   }
}
class patt17
{
   public static void main(String []args)
   {
       int rows=4,cols=4;
       char upper='A';
       int num=2;
       for(int i=1;i<=rows;i++)
       {
         for(int j=1;j<=cols;j++)
         {
           if(i%2!=0)
           {
           System.out.print(upper+" ");
           upper++;
           }
           else
           {
           System.out.print(num+" ");
           num++;
           }
         }
          System.out.println();
       }
   }
}
class patt18
{
   public static void main(String []args)
   {
       int rows=3,cols=3;
       char letter='A';
       for(int r=1;r<=rows;r++)
       {
          for(int c=1;c<=cols;c++)
          {
            System.out.print(letter+" ");
            letter++;
          }
           System.out.println();
       } 
   }
}
class patt19
{
   public static void main(String []args)
   {
       int rows=3,cols=3;
       char letter='A';
       for(int r=1;r<=rows;r++)
       {
          for(int c=1;c<=cols;c++)
          {
            System.out.print(letter+" ");
          }
           letter++;
           System.out.println();
       } 
   }
}
class patt20
{
   public static void main(String []args)
   {
       int rows=3,cols=3;
       for(int r=1;r<=rows;r++)
       {
          char letter='A';
          for(int c=1;c<=cols;c++)
          {
            System.out.print(letter+" ");
            letter++;
          }
           System.out.println();
       } 
   }
}
class patt21
{
   public static void main(String []args)
   {
       int rows=6;
       for(int r=1;r<=rows;r++)
       {
         for(int c=1;c<=r;c++)
         {
            if(c==1 || r==rows || r==c)
            System.out.print("#");
            else
            System.out.print("%");
         }
          System.out.println();
       }
   }
}
class patt22
{
   public static void main(String []args)
   {
       int rows=5;
       for(int r=1;r<=rows;r++)
       {
         for(int c=r;c<=rows;c++)
         {
            if(r==c || r==1 || c==rows) 
            System.out.print("#");
            else
            System.out.print(" ");
          }
          System.out.println();
       }
   }
}
class patt23
{
   public static void main(String []args)
   {
        int rows=4;
        for(int r=1;r<=rows;r++)
        {
          for(int c=r;c>=1;c--)
          {
             System.out.print(c+" ");
          }
           System.out.println();
        }
   }
}
class patt24
{
   public static void main(String []args)
   {
        int rows=5;
        for(int r=1;r<=rows;r++)
        {
          int temp=r;
          for(int c=r;c<=rows;c++)
          {
             System.out.print(temp+" ");
             temp++;
           }
             System.out.println();
        }
   }
}
class aa
{
    public static void main(String []args)
    {
      int rows=3,cols=3;
      char letter='A';
      for(int r=1;r<=rows;r++)
      {
         for(int c=1;c<=cols;c++)
         {
           System.out.print(letter+" ");
           letter++;
         }
          System.out.println();
      }
    }
}
class aa1
{
    public static void main(String []args)
    {
      int rows=3,cols=3;
      char letter='A';
      for(int r=1;r<=rows;r++)
      {
         for(int c=1;c<=cols;c++)
         {
           System.out.print(letter+" ");
         }
          letter++;
          System.out.println();
      }
    }
}
class aa2
{
    public static void main(String []args)
    {
      int rows=3,cols=3;
      for(int r=1;r<=rows;r++)
      {
         char letter='A';
         for(int c=1;c<=cols;c++)
         {
           System.out.print(letter+" ");
           letter++;
         }
          System.out.println();
      }
    }
}
class aa3
{
   public static void main(String []args)
    {
       int rows=4;
       for(int r=1;r<=rows;r++)
       {
         for(int c=1;c<=r;c++)
         {
           System.out.print(c+" ");
         }
          System.out.println();
       }
    }
}
class aa4
{
   public static void main(String []args)
    {
       int rows=4,tem=1;
       for(int r=1;r<=rows;r++)
       {
         for(int c=1;c<=r;c++)
         {
           System.out.print(tem+" ");
           tem++;
         }
          System.out.println();
       }
    }
}
class aa5
{
   public static void main(String []args)
    {
       int rows=5;
       for(int r=rows;r>=1;r--)
       {
         for(int c=1;c<=r;c++)
         {
           System.out.print(c+" ");
         }
          System.out.println();
       }
    }
}
class aa6
{
   public static void main(String []args)
    {
       int rows=4;
       for(int r=1;r<=rows;r++)
       {
         for(int c=1;c<=r;c++)
         {
           System.out.print("#");
         }
            System.out.println();
       }
         for(int r=rows-1;r>=1;r--)
         {
         for(int c=1;c<=r;c++)
         {
           System.out.print("#");
         }
        System.out.println();
       }
    }
}
class aa7
{
   public static void main(String []args)
    {
      int rows=5;
      for(int r=rows;r>=1;r--)
      {
        for(int c=1;c<=r;c++)
        {
           System.out.print("#");
        }
        System.out.println();
      }
      for(int r=rows-1;r>=1;r--)
      {
        for(int c=r;c<=rows;c++)
        {
           System.out.print("#");
        }
        System.out.println();
      }
    }
}
class aa8
{
    public static void main(String []args)
    {
       int rows=4;
       for(int r=1;r<=rows;r++)
       {
          for(int c=1;c<=r;c++)
          {
             System.out.print("#");
          }
           System.out.println();
       }
    }
}
class aa9
{
   public static void main(String []args)
    {
       int rows=4;
       for(int r=1;r<=rows;r++)
       {
          for(int c=r;c<=rows;c++)
          {
              System.out.print("#");
          }
            System.out.println();
       }
    }
}
class aa10
{
   public static void main(String []args)
   {
      int rows=4;
      for(int r=1;r<=rows;r++)
      {
         for(int c=1;c<=r;c++)
         {
            System.out.print("#");
         }
         for(int c=rows;c>=r;c--)
         {
            System.out.print("&");
         }
         System.out.println();
      }
   }
}
class aa11
{
    public static void main(String []args)
   {
      int rows=5;
      for(int r=1;r<=rows;r++)
      {
         for(int c=r;c<=rows;c++)
         {
            System.out.print("#");
         }
         for(int c=1;c<=r;c++)
         {
            System.out.print("@");
         }
         System.out.println();
      }
   }
}
class aa12
{
   public static void main(String []args)
   {
      int rows=5;
      for(int r=1;r<=rows;r++)
      {
        for(int c=r;c<=rows;c++)
        {
        System.out.print(" ");
        }
        for(int c=1;c<=r;c++)
        {
          System.out.print("#");
        }
        System.out.println();
      } 
   }
}
class aa13
{
   public static void main(String []args)
   {
       int rows=4,cols=4;
       char upper='A';
       for(int r=1;r<=rows;r++)
       {
          for(int c=1;c<=cols;c++)
          {
            if(r%2!=0)
            {
            System.out.print(upper);
            }
            else
            {
            System.out.print((char)(upper+32));
            }
            upper++;
          }
          System.out.println();
       }
   }
}
class aa14
{
   public static void main(String []args)
   {
       int rows=4,cols=4;
       char upper='A';
       int num=2;
       for(int r=1;r<=rows;r++)
       {
          for(int c=1;c<=cols;c++)
          {
            if(r%2!=0)
            {
            System.out.print(upper);
            upper++;
            }
            else
            {
            System.out.print(num);
            num++;
            }
           }
            System.out.println();
       }
   }
}











