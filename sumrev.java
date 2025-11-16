//sum and reverse the array elements
class main1
{
   public static void main(String []args)
   {
     Sample sample=new Sample();
     int a[]=new int[]{10,21,30,40};
     System.out.println(sample.sum(a));
     sample.rev(a);
   }
}
class Sample
{
   int sum(int[]b)
   {
      int sum=0;
      for(int temp:b)
      {
         if(temp%2==0)
         sum+=temp;
      }
       return sum;
   }
   int[]rev(int[]c)
   {
      for(int x=c.length-1;x>=0;x--)
      {
        if(c[x]%2==0)
        System.out.println(c[x]+" ");
      }
      return c;
   }
}