class patt
{
   public static void main(String []args)
   {
     int rows=7,cols=7;
     for(int r=1;r<=rows;r++)
     {
        for(int c=1;c<=cols;c++)
        {
          if(r%2==0 && c%2==0)
          System.out.print("$");
          else
          System.out.print("#");
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
          if(r==2 && c==1 || r==3 && c==3 || r==4 && c==4)
          System.out.print("$");
          else
          System.out.print("#");
        }
          System.out.println();
     }
   }
}
class patt2
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
class patt3
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
class patt4
{
   public static void main(String []args)
   {
     int rows=3,cols=4;
     char upper='A';
         for(int r=1;r<=rows;r++)
     {
          for(int c=1;c<=cols;c++)
          {
            if(c%2!=0)
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
class patt5
{
   public static void main(String []args)
   {
     int rows=4,cols=4;
     char upper='A';
     for(int r=1;r<=rows;r++)
     {
      int num=r;
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
class patt6
{
    public static void main(String []args)
    {
       int rows=4,cols=4;
       for(int r=1;r<=rows;r++)
       {
          int temp=r;
          for(int c=1;c<=cols;c++)
          {
            System.out.print(temp);
            temp++;
          }
           System.out.println();
       }
    }
}
class patt7
{
   public static void main(String []args)
    {
       int rows=4,cols=4;
       char ch=(char)('A');
       for(int r=1;r<=rows;r++)
       {
          for(int c=1;c<=cols;c++)
          {
            System.out.print(ch);
            ch++;
          }
            System.out.println();
       }
    }
}
class patt8
{
  public static void main(String []args)
    {
       int start=3;
       int diff=9;
       int rows=4;
       for(int r=1;r<=rows;r++)
       {
         int num=start;
         for(int c=r;c<=rows;c++)
         {
            System.out.print(num+" ");
            num+=diff;
          }
            System.out.println();
         }
       }
}
class patt9
{
  public static void main(String []args)
    {
       int start=15;
       int diff=-3;
       int rows=5;
       for(int r=1;r<=rows;r++)
       {
         int num=start;
         for(int c=r;c<=rows;c++)
         {
            System.out.print(num+" ");
            num+=diff;
          }
            System.out.println();
         }
       }
}
class patt10
{
  public static void main(String []args)
    {
       int start=1;
       int diff=2;
       int rows=4;
       for(int r=1;r<=rows;r++)
       {
         int num=start;
         for(int c=1;c<=r;c++)
         {
            System.out.print(num+" ");
            num+=diff;
          }
            System.out.println();
         }
       }
}
class patt11
{
  public static void main(String []args)
    {
       int start=3;
       int diff=3;
       int rows=5;
       for(int r=1;r<=rows;r++)
       {
         int num=start;
         for(int c=r;c<=rows;c++)
         {
            System.out.print(num+" ");
          }
            num+6=diff;
            System.out.println();
         }
       }
}

 