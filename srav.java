class prac
{
   public static void main(String []args)
   {
     int rows=4,cols=4;
     char upper='A';
     char lower='a';
     for(int r=1;r<=rows;r++)
     {
       for(int c=1;c<=cols;c++)
       {
          if(r%2==0)
          {
          System.out.print(lower);
          lower++;
          }
          else
          {
          System.out.print(upper);
          upper++;
          } 
       }
        System.out.println();
        if(r%2==0)
        lower+=4;
        else
        upper+=4;
     }
     }
}
class patt1
{
  public static void main(String []args)
  {
    int rows=4;
    int start=25;
    for(int r=1;r<=rows;r++)
    {
      int temp=25,num=6;
      for(int c=r;c<=rows;c++)
      {
       System.out.print(temp+" ");
       temp-=num;
       num-=1;
      }
       System.out.println();
    }
  }
}
class patt2
{
   public static void main(String []args)
   {
      int rows=5;
      for(int r=1;r<=rows;r++)
      {
         int temp=3,num=3;
         for(int c=r;c<=rows;c++)
         {
           System.out.print(temp+" "); 
           temp=3;
           temp*=num;
           num+=1;
         }
        System.out.println();
      }  
   }
}
class patt3
{
   public static void main(String []args)
   {
      int rows=4;
      for(int r=1;r<=rows;r++)
      {
        int start=27,num=9;
        for(int c=r;c<=rows;c++)
        {
           System.out.print(start+" ");
           start-=num;
           num-=1;
        }
         System.out.println();
      }
   }
}
class patt4
{
   public static void main(String []args)
   {
      int rows=4;
      for(int r=1;r<=rows;r++)
      {
        int start=9,num=5;
        for(int c=r;c<=rows;c++)
        {
           System.out.print(start+" ");
           start+=num;
           num+=1;
        }
         System.out.println();
      }
   }
}
class patt5
{
   public static void main(String []args)
   {
      int rows=4;
      for(int r=1;r<=rows;r++)
      {
        int start=8,num=7;
        for(int c=r;c<=rows;c++)
        {
           System.out.print(start+" ");
           start+=num;
           num-=1;
        }
         System.out.println();
      }
   }
}
class patt6
{
   public static void main(String []args)
   {
      int rows=4;
      for(int r=1;r<=rows;r++)
      {
        int start=3,num=9;
        for(int c=r;c<=rows;c++)
        {
           System.out.print(start+" ");
           start+=num;
        }
         System.out.println();
      }
   }
}
class patt7
{
   public static void main(String []args)
   {
      int rows=4;
      for(int r=1;r<=rows;r++)
      {
        int start=1,num=2;
        for(int c=1;c<=r;c++)
        {
           System.out.print(start+" ");
           start+=num;
        }
         System.out.println();
      }
   }
}


