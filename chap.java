class chap
{
   public static void main(String []args)
   {
      int s=1,end=300,primecount=0;
      for(int i=s;i<=end;i++)
      {
       int count=0;
         for(int start=2;start<=i/2;start++)
         {
           if(i%start==0)
           {
           count++;
           }
         }    
          if(count==0 && i!=1)
          {
          System.out.println(i);
          primecount++;
          }
       }
       System.out.println(primecount);
    }
}
class fiba
{
   public static void main(String []args)
   {
   int f=0,s=1,t=0;
   for(int i=1;i<=10;i++)
   {
  System.out.println(f);
   t=f+s;
   f=s;
   s=t;
   }
   }
}
class fiba1
{
   public static void main(String []args)
   {
   int f=0,s=1,t=0;
   for(int i=1;i<=10;i++)
   {
   f=s;
   s=t;
   t=f+s;
   }
  System.out.println(f);
   }
}
class numb
{
  public static void main(String []args)
   {
   int start=567,end=445;
   for(int i=start;i>=end;i--)
   {
     System.out.println(i);
   }
   }
}
class numb1
{
  public static void main(String []args)
   {
   int start=445,end=789;
   for(int i=start;i<=end;i++)
   {
     System.out.println(i);
   }
   }
}
class numb2
{
  public static void main(String []args)
   {
   int start=445,end=789;
   for(int i=start;i<=end;i++)
   {
     System.out.println(i);
     if(i==450)
     break;
   }
   }
}
class numb3
{
  public static void main(String []args)
   {
   int start=445,end=460;
   for(int i=start;i<=end;i++)
   {
     if(i==450)
     continue;
     System.out.println(i);
   }
   }
}
class numb4
{
   public static void main(String []args)
   {
      int start=1,end=200,primecount=0;
      for(int i=start;i<=end;i++)
      {
        int count=0;
        for(int j=2;j<=i/2;j++)
        {
           if(i%j==0)
           count++;
        }
         if(count==0 && i!=1)
         {
         primecount++;
         }
         System.out.println(i);
         System.out.println(primecount);
      }
   }
}




