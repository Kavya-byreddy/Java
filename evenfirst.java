//print the even elements first and odd elements next in the given array
class main
{
   public static void main(String []args)
   {
      int[] a=new int[]{69,10,40,99,80,49,5};
      int[] b=new int[a.length];
      int y,x;
      for(x=0;x<a.length;x++)
      System.out.print(a[x]+"\t");
      for(x=0,y=0;x<a.length;x+=2,y++)
      {
        b[y]=a[x];
      }    
      for(x=1;x<a.length;x+=2,y++)
      {
        b[y]=a[x];
      }
        System.out.println();
        for(x=0;x<b.length;x++)
        System.out.print(b[x]+"\t");
   }
}
class main1
{
    public static void main(String []args)
    {
      int[]a=new int[]{5,10,3,6,9,11,15};
      for(int x=0;x<a.length;x++)
      {
         if(x%2==0)
         System.out.print(a[x]+" ");
      }
      for(int x=0;x<a.length;x++)
      {
         if(x%2==1)
         System.out.print(a[x]+" ");
      }
    }
}
class main2
{
  public static void main(String[]args)
  {
   int[]a=new int[]{10,12,13,15,16,17};
   int[]b=new int[a.length];
   int x,y;
   for(x=0;x<a.length;x++)
   {
     System.out.print(a[x]+"\t");
   }
   System.out.println();
   for(x=0,y=0;x<a.length;x+=2,y++)
   {
     b[y]=a[x];
   }
   for(x=1;x<a.length;x+=2,y++)
   {
      b[y]=a[x];
   }
     System.out.println();
     for(x=0;x<b.length;x++)
     System.out.print(b[x]+"\t");
  }
}
class main3
{
  public static void main(String[]args)
  {
   int[]a=new int[]{10,11,12,13,15,16,17};
   int[]b=new int[a.length];
   int x,y;
   for(x=0;x<a.length;x++)
   {
     System.out.print(a[x]+"\t");
   }
   for(x=0,y=0;x<a.length;x++,y++)
   {
     if(a[x] % 2==0)
     b[y]=a[x];
   }
   for(x=0;x<a.length;x++,y++)
   {
      if(a[x] % 2==1)
      b[y]=a[x];
   }
     System.out.println();
     for(x=0;x<b.length;x++)
     System.out.print(b[x]+"\t");
  }
}