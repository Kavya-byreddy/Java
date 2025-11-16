class main
{
   public static void main(String []args)
   {
      int[]a=new int[]{10,11,12,13,15};
      for(int temp:a)
        System.out.print(temp+"\t");
           int copy=a[0],x;
           for(x=0;x<a.length-1;x++)
             a[x]=a[x+1];
             a[a.length-1]=copy;
         System.out.println();
         for(int temp1:a)
         System.out.print(temp1+"\t");
   }
}
class main1
{
   public static void main(String[]args)
   {
      int[]a=new int[]{10,20,30,40,50,60,70,80,90,100};
      for(int temp:a)
       System.out.print(temp+"\t");
       System.out.println();
       int copy=a[a.length-1],x;
       for(x=a.length-1;x>0;x--)
          a[x]=a[x-1];
          a[0]=copy;
        for(int temp:a)
      System.out.print(temp+"\t");
   }
}
class main2
{
   public static void main(String[]args)
   {
      int[]a=new int[]{10,5,20,21,4,7,9,17};
      for(int temp:a)
      System.out.print(temp+"\t");
      int min=0,x;
      for(x=0;x<a.length;x++)
      {
        if(a[min]>a[x])
        min=x;
      }
       System.out.println("minimum"+a[min]);
   }
}
class main3
{
   public static void main(String[]args)
   {
      int[]a=new int[]{10,5,20,21,4,7,9,17};
      for(int temp:a)
      System.out.print(temp+"\t");
      int max=0,x;
      for(x=0;x<a.length;x++)
      {
        if(a[max]<a[x])
        max=x;
      }
       System.out.println("maximum"+a[max]);
   }
}
class main4
{
   public static void main(String[]args)
   {
      int[]a=new int[]{10,5,20,21,4,7,9,17};
      for(int temp:a)
      System.out.print(temp+"\t");
      int min=0,x;
      for(x=0;x<a.length;x++)
      {
        if(a[min]>a[x])
        min=x;
      }
       System.out.println("minimum"+a[min]);
       a[0]=a[min]+a[0];
       a[min]=a[0]-a[min];
       a[0]=a[0]-a[min];
       for(int temp:a)
       System.out.print(temp+"\t");
   }
}

