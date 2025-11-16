class main
{
    public static void main(String []args)
    {
       int value=4;
       int[]a=new int[]{11,21,31,12,14,15,19};
       System.out.println("original array");
       for(int temp:a)
       System.out.print(temp+"\t");
       for(int x=value;x<a.length-1;x++)
          a[x]=a[x+1];
      System.out.println("after deletion");
       for(int temp1:a)
       System.out.print(temp1+"\t");
    }
}
class main1
{
   public static void main(String []args)
   {
      int index=4;
      int[]a=new int[]{11,21,31,12,14,15,19};
      System.out.println("original array");
      for(int temp:a)
      System.out.print(temp+"\t");
      for(int x=index;x>0;x--)
      a[x]=a[x-1];
        System.out.println("after deletion");
        for(int temp1:a)
          System.out.print(temp1+"\t");    
   }
}
//max of the elements in the array and swap the maxi with the first element
class main2
{
   public static void main(String []args)
   {
      int[]a=new int[]{11,21,34,12,31,9,32};
      for(int temp:a)
        System.out.print(temp+"\t");
        int max=0,i;
        for(i=0;i<=a.length-1;i++)
        {
          if(a[max]<a[i])
          max=i;
        }
         System.out.println("the maximum element in array"+a[max]);
         a[0]=a[max]+a[0];
         a[max]=a[0]-a[max];
         a[0]=a[0]-a[max];
         for(int temp1:a)
         System.out.print(temp1+"\t");
   }
}
//min of the elements in the array and swap the maxi with the first element
class main3
{
   public static void main(String []args)
   {
       int[]a=new int[]{11,21,34,12,31,9,32};  
       for(int temp:a)
         System.out.print(temp+"\t");
       int min=0,x;
       for(x=0;x<=a.length-1;x++)
       {
          if(a[min]>a[x])
           min=x;
       }
         System.out.println();
         System.out.println("minimum element in array"+a[min]);
         a[0]=a[min]+a[0];
         a[min]=a[0]-a[min];
         a[0]=a[0]-a[min];
          for(int temp:a)
           System.out.print(temp+"\t");
   }
}
















