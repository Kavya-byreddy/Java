class main
{
   public static void main(String[]args)
   {
      int[]a={10,20,30,40,50};
      int sum=0;
      for(int i=0;i<a.length;i++)
      {
        sum+=a[i];
      }
     System.out.println(sum);
   }
}
class main1
{
   public static void main(String[]args)
   {
      int[]a={10,20,30,40,50};
      int large=a[0],small=a[0];
      for(int i=1;i<=a.length-1;i++)
      {
          if(a[i]>large)
          large=a[i];
          if(a[i]<small)
          small=a[i];
      }
      System.out.println("large="+large);
      System.out.println("small="+small);
   }
}
class main2
{
   public static void main(String[]args)
   {
      int[]a={10,20,40,50,30,90};
      int first=a[0],second=Integer.MIN_VALUE;
      for(int i=1;i<a.length;i++)
      {
         if(a[i]>first)
         {
             second=first;
             first=a[i];
         }
         else if(a[i]>second && a[i]!=first)
         second=a[i];
      } 
       System.out.println(second);
   }
}