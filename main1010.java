class main
{
   public static void main(String []args)
   {
      int[]a=new int[]{10,20,30,40,50,60,70,80,90,100};
      int x,y;
      System.out.println("original array");
      for(int temp1:a)
      System.out.print(temp1+"\t");
      for(y=1;y<=4;y++)
      {
      int copy=a[0];
      for(x=0;x<a.length-1;x++)
      a[x]=a[x+1];
      a[a.length-1]=copy;
      System.out.println(" rotated array");
      }
      for(int temp2:a)
      System.out.print(temp2+"\t");
   }
}
class main1
{
   public static void main(String []args)
   {
      int a[]=new int[]{10,20,30,40,50,60,70,80,90,100};
      int x,y;
      System.out.println("original array");
      for(int temp:a)
        System.out.print(temp+"\t");
      int copy=a[a.length-1];
      for(x=a.length-1;x>0;x--)
        a[x]=a[x-1];
        a[0]=copy;
      System.out.println("Right rotation");
      for(int temp1:a)
         System.out.print(temp1+"\t");
   }
}
class main2
{
   public static void main(String []args)
   {
     int a[]=new int[]{11,21,34,12,31,9,32,7,16,8};
     int max=0,x;
     for(x=1;x<=a.length-1;x++)
     {
        if(a[max]<a[x])
        max=x;
     }
     for(int temp:a)
        System.out.print(temp+"\t");
          System.out.println();
          System.out.println("Maximum element in the array="+a[max]);
         a[0]=a[max]+a[0];//34+11=45
         a[max]=a[0]-a[max];//45-34=11
         a[0]=a[0]-a[max];//45-11=34
       for(int temp:a)
         System.out.print(temp+"\t");
   }
}
class main3
{
   public static void main(String []args)
   {
     int a[]=new int[]{11,21,34,12,34,9,32,7,16,8};
     int min=0,x;
     for(x=0;x<=a.length-1;x++)
     {
        if(a[min]>a[x])
        min=x;
     }
     for(int temp:a)
        System.out.print(temp+"\t");
          System.out.println();
         System.out.println("Minimum element in the array="+a[min]);
   }
}