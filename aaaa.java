import java.util.Arrays;
class main
{
   public static void main(String[]args)
   {
      int[]a=new int[]{100,60,80,90,70,30};
      System.out.println(Arrays.toString(a));
      Arrays.sort(a);
      System.out.println(Arrays.toString(a));
   }
}
class main1
{
   public static void main(String[]args)
   {
      int[]a=new int[]{10,20,30};
      int[]b=new int[]{10,50,30};
      System.out.println(Arrays.toString(a));
      System.out.println(Arrays.toString(b));
      System.out.println(Arrays.equals(a,b));
   }
}
class main2
{
   public static void main(String[]args)
   {
      int[]a=new int[]{100,60,80,90,70,30};
      Arrays.sort(a);
      System.out.println(Arrays.binarySearch(a,100));
   }
}
class main3
{
   public static void main(String[]args)
   {
      int[]a=new int[]{100,60,80,90,70,30};
      Arrays.fill(a,100);
      System.out.println(Arrays.toString(a));
   }
}
class main4
{
   public static void main(String[]args)
   {
      int[]a=new int[]{10,20,30,40};
      int[]b=new int[]{10,50,30};
      a=Arrays.copyOf(a,1);
      b=Arrays.copyOf(b,3);
      System.out.println(Arrays.toString(a));
      System.out.println(Arrays.toString(b));
   }
}
class main5
{
   public static void main(String[]args)
   {
      int[][]a=new int[][]{{10,20},{30,40}};
      int[][]b=new int[][]{{10,50},{40,30}};
      for(int i=0;i<a.length;i++)
      System.out.println(Arrays.toString(a[i]));
      for(int j=0;j<b.length;j++)
      System.out.println(Arrays.toString(b[j]));
      System.out.println(Arrays.deepEquals(a,b));

   }
}
//anagram or not
class main16
{
   public static void main(String[]args)
   {
       int[]a=new int[]{10,20,40,50,90};
       int[]b=new int[]{20,40,50,10,90,100};
       if(a.length!=b.length)
       {
          System.out.println("not anagram");
          return;
       }
       Arrays.sort(a);
       Arrays.sort(b);
         if(Arrays.equals(a,b))
           System.out.println("the arrays are in anagram");
         else
           System.out.println("the arrays are not in anagram");
   }
}
class main18
{
   public static void main(String[]args)
   {
      int[][]a=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
      int sum=0;
      for(int x=0;x<a.length;x++)
      {
         if(x==x)
         sum+=a[x][x];
      }
     System.out.println(sum);
   }
}
class main19
{
   public static void main(String[]args)
   {
      int[][]a=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
      int sum=0,x,y;
      for(x=0,y=a.length-1;x<a.length;x++,y--)
      {
         if(x==x)
         sum+=a[x][y];
      }
     System.out.println(sum);
   }
}
//binary search
class main20
{
  public static void main(String[]args)
  {
     int[]arr={10,20,30,40,50,60};    
     int search=40;
     int low=0,high=arr.length-1;
     boolean found=false;
     while(low<=high)
     {
     int mid=(low+high)/2;
     if(arr[mid]==search)
     {
       System.out.println("element found at"+mid);
       found=true;
       break;
     }
     else if(arr[mid]>search)
        high=mid-1;
     else
        low=mid+1;
    }
    if(!found)
    System.out.println("element not found");
   }
}
//second maximum element in array
class main21
{
   public static void main(String[]args)
   {
     int[]a=new int[]{10,20,15,20,15,60,89};
     int max=Integer.MIN_VALUE;
     int smax=max;
     for(int i=0;i<a.length;i++)
     {
        if(max<a[i])
        {
           smax=max;
           max=a[i];
        }
        else if(max>a[i]&&smax<a[i])
        smax=a[i];
     }
    System.out.println(smax);
   }
}
//max unique element
class main17
{
    public static void main(String[]args)
    {
        int[]a=new int[]{10,20,20,40};
        boolean[]b=new boolean[a.length];
        int x,y,count=0,temp=0;
        int[]c=new int[a.length];
        for(x=0;x<a.length;x++)
        {
           if(b[x]==true)
           continue;
           count=0;
           for(y=x+1;y<a.length;y++)
           {
                if(a[x]==a[y])
                {
                   count++;
                   b[y]=true;
                }
           }
          if(count==0)
          c[x]=a[x];
        }
      for(x=0;x<c.length;x++)
      {
	          System.out.println("c[x]"+c[x]);
         if(c[temp]>c[x]&&c[x]!=0)
         temp=x;
      }
          System.out.println("minimum element="+c[temp]);
    }
}
//most repeated element 
class main22
{
     public static void main(String[]args)
     {
       int[]a=new int[]{100,100,40,40,80,80,80,80,90,60,100,100};
       boolean[]b=new boolean[a.length];
       int x,y,count=0,mcount=0,element=0;
       for(x=0;x<a.length;x++)
       {
          if(b[x]==true)
          continue;
          count=1;
          for(y=x+1;y<a.length;y++)
          {
             if(a[x]==a[y])
             {
                count++;
                b[y]=true;
             }
          }
          if(count>mcount)
          {
           mcount=count;
           element=a[x]; 
          }
       }
        System.out.print(element+" ");
     }
}
// second max duplicate element in array
class main15
{
   public static void main(String[]args)
   {
      int[]a=new int[]{19,12,14,14,12,10,12,19};
      boolean[]b=new boolean[a.length];
      int[]c=new int[a.length];
      int x,y,count=0,max=Integer.MIN_VALUE,smax=max;
      for(x=0;x<a.length;x++)
      {
          if(b[x]==true)
          continue;
          count=0;
          for(y=x+1;y<a.length;y++)
          {
            if(a[x]==a[y])
            {
               count++;
               b[y]=true;
            }
          }
      if(count>0)
      {
          c[x]=a[x];
      }
       for(x=0;x<a.length;x++)
       {
          if(max<c[x])
          {
          max=x;
          smax=max;
       }
     }
       System.out.print(c[smax]+" ");
   }
}
