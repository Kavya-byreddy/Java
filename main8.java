//find how many upper,lower,symbol,number,spaces
class main
{
    public static void main(String []args)
    {
       char a[]=new char[]{'x','^',9,'y','T','@'};
       int upper=0,c1=0,c2=0,c3=0,symbol=0;
       for(int x=0;x<a.length;x++)
       {
        char ch=a[x];
       if(ch>='A' && ch<='Z')
       {
         upper++;
       }
       else if(ch>='a' && ch<='z')
       {
         c1++;
       }
       else if(ch>=0 && ch<=9)
       {
         c2++;
       }
       else if(ch==' ')
       {
         c3++;
       }
       else
       {
         symbol++;
       }

       }
        System.out.println(upper);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(symbol);
    }
}
//print first last mid element in given arrray
class main1
{
   public static void main(String []args)
   {
      String str[]=new String[]{"hi","all","good","morning","ntmu"};
      System.out.println(str[0]+" "+str[(str.length-1)/2]+" "+str[str.length-1]);
   }
}
//print the array element in reverse order
class main2
{
   public static void main(String []args)
   {
      String str[]=new String[]{"hi","all","good","morning","ntmu"};
      for(int x=str.length-1;x>=0;x--)
      System.out.println(str[x]);
   }
}
//print the 1st half normal and  second half reverse array element 
class main3
{
   public static void main(String []args)
   {
      String str[]=new String[]{"hi","all","good","morning","ntmu"};
      int mid=(str.length-1)/2;
      for(int x=0;x<=mid;x++)
      {
      System.out.println(str[x]);
      }
      for(int x=str.length-1;x>mid;x--)
      {
      System.out.println(str[x]);
      }
   }
}
//print the 1st half reverse and  second half as it is array element 
class main4
{
   public static void main(String []args)
   {
      String str[]=new String[]{"hi","all","good","morning","ntmu"};
      int mid=(str.length-1)/2;
      for(int x=mid;x>=0;x--)
      {
      System.out.println(str[x]);
      }
      for(int x=mid;x<=str.length-1;x++)
      {
      System.out.println(str[x]);
      }
   }
}
//copying model that is copying the 'a' values into 'b' arrays
class main5
{
   public static void main(String []args)
   {
      int a[]=new int[]{10,20,30,40,50,60,70};
      int b[]=new int[a.length];
      for(int x=0;x<=a.length-1;x++)
      {
         b[x]=a[x];
         System.out.println(b[x]);
      }
   }
}
//copying model that is copying the 'a' values into 'b' arrays in reverse order
class main6
{
  public static void main(String []args)
  {
     int[]a=new int[]{10,20,30,40,50,60,70};
     int[]b=new int[a.length];
     for(int x=a.length-1;x>=0;x--)
     {
       b[x]=a[x];
       System.out.println(b[x]);
     }
  }
}