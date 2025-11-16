//unique elements in the given array
class main
{
   public static void main(String[]args)
   {
      int[]a=new int[]{10,20,15,17,17,20,15,19,21,10};
      boolean[]b=new boolean[a.length];
      for(int i=0;i<a.length;i++)
      {
         if(b[i]==true)
         continue;
         int count=1;
          for(int j=i+1;j<a.length;j++)
          {
             if(a[i]==a[j])
             {
                count++;
                b[j]=true;
             }   
          }
          if(count==1)
          System.out.println(a[i]);
      }
   }
}