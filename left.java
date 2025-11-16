class main
{
    public static void main(String[]args)
    {
       int[]a=new int[]{10,21,13,45,58,98};
       for(int temp:a)
       System.out.print(temp+"\t");
       int copy=a[0],x;
       for(x=0;x<a.length-1;x++)
       a[x]=a[x+1];
       a[a.length-1]=copy;
       for(int temp1:a)
       System.out.print(temp1+"\t");    
    }
}
class main1
{
   public static void main(String[]args)
   {
      int a[]=new int[]{10,21,13,12,34,43,45};
      System.out.println("original array");
      for(int temp:a)
      System.out.print(temp+"\t");
      int copy=a[a.length-1],x;
      for(x=a.length-1;x>0;x--)
      a[x]=a[x-1];
      a[0]=copy;
      System.out.println("after right rotation");
      for(int temp2:a)
        System.out.print(temp2+"\t");
   }
}
class main2
{
   public static void main(String[]args)
   {
      int[]a=new int[]{12,10,7,19,21,23};
      System.out.println("before swapping");
      for(int temp:a)
      System.out.print(temp+"\t");
      int min=0,x;
      for(x=1;x<=a.length-1;x++)
      {
         if(a[min]>a[x])
         min=x;
      }
        System.out.println();
        System.out.print("minimum element"+a[min] );
        System.out.println();
        a[0]=a[min]+a[0];
        a[min]=a[0]-a[min];
        a[0]=a[0]-a[min];
        for(int temp1:a)
        System.out.print(temp1+"\t");
   }
}
class main3
{
    public static void main(String[]args)
    {
       int[]a=new int[]{10,30,13,34,43,54};
       System.out.println("before swapping maximum");
       for(int temp:a)
       System.out.print(temp+"\t");
       int max=0,x;
       for(x=1;x<=a.length-1;x++)
       {
          if(a[max]<a[x])
          max=x;
       }
       System.out.println();
       System.out.println("maximum number is"+a[max]);
       a[0]=a[max]+a[0];
       a[max]=a[0]-a[max];
       a[0]=a[0]-a[max];
       for(int temp1:a)
       System.out.print(temp1+"\t");
    }
}
class main4
{
   public static void main(String[]args)
   {
      int[]a=new int[]{10,20,30,40,50,60};
      System.out.println("before deletion");
      for(int temp:a)
      System.out.print(temp+"\t");
      int value=4;
      for(int x=value;x<a.length-1;x++)
      a[x]=a[x+1];
      System.out.println();
      System.out.println("after deletion");
      for(int temp1:a)
      System.out.print(temp1+"\t");
   }   
}
class main5
{
    public static void main(String[]args)
    {
       int[]a=new int[]{10,20,30,40,50};
       System.out.println("before deletion");
       for(int temp:a)
       System.out.print(temp+"\t");
       int value=2;
       for(int x=value;x>0;x--)
       a[x]=a[x-1];
       System.out.println();
       System.out.println("after deletion");
       for(int temp:a)
       System.out.print(temp+"\t");
    }
}
class main6
    {
    public static void main(String[]args)
    {
     int start=211,end=412;
     for(int x=start;x<=end;x++)
      {
        int num=x,rev=0,rem=0,copy=x;
        while(num!=0)
        {
           rem=num%10;
           rev=rev*10+rem;
           num/=10;
        }
          if(rev==copy)
          System.out.println(copy);
      }
    }
}
class main7
{
    public static void main(String[]args)
    {
       int[]a=new int[]{12,17,19,21,33,15,10,35,77};
       int x;
       for(x=0;x<a.length;x++)
       {
          int min=x,y,temp=0;
          for(y=x+1;y<a.length;y++)
          {
             if(a[min]>a[y])
             min=y;
          }
            temp=a[min];
            a[min]=a[x];
            a[x]=temp;
        }
            for(int temp1:a)
            System.out.print(temp1+"\t");
    }
}
class main8
{
   public static void main(String[]args)
   {
      int[]a=new int[]{12,33,55,12,67,89,33,55,76,45,89};
      boolean[]b=new boolean[a.length];
      int x,y,count=0;
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
         System.out.println(a[x]);
      }
   }
}
class main9
{
   public static void main(String[]args)
   {
       int[]a=new int[]{10,12,11,13,15,18,17};
       int x;
       for(x=0;x<a.length;x++)
       {
          int min=x,y,temp=0;
          for(y=x+1;y<a.length;y++)
          {
             if(a[min]>a[y])
             min=y;
          }
           temp=a[min];
           a[min]=a[x];
           a[x]=temp;
       }
        for(int temp1:a)
        System.out.print(temp1+"\n");
   }
}
//bubble sort
class main10
{
   public static void main(String[]args)
   {
      int[]a=new int[]{10,11,23,21,32,31,25};
      for(int x=0;x<a.length-1;x++)
      {
          for(int y=0;y<a.length-1-x;y++)
          {
             if(a[y]>a[y+1])
             {
                int temp=a[y];
                a[y]=a[y+1];
                a[y+1]=temp;
             }
          }
      }
         for(int num:a)
         System.out.print(num+" ");
   }
}
//2d array
class main11
{
   public static void main(String[]args)
   {
      int[][]arr=new int[][]{{1,2,3},{4,5},{7,8,9}};
      for(int r=0;r<arr.length;r++)
      {
         for(int c=0;c<arr[r].length;c++)
         {
            System.out.print(arr[r][c]+" ");
         }
        System.out.println();
      }
   }
}
//selection sort
class main12
{
    public static void main(String[]args)
    {
       int[]a=new int[]{12,8,9,21,31,29};
       int x;
       for(x=0;x<=a.length-1;x++)
       {
          int min=x,y,temp=0;
          for(y=x+1;y<=a.length-1;y++)
          {
             if(a[min]>a[y])
               min=y;
          }
                 temp=a[min];
                 a[min]=a[x];
                 a[x]=temp;
       }
        for(int temp1:a)
        System.out.print(temp1+" ");
    }
}
//unique element in array
class main13
{
   public static void main(String[]args)
   {
      int[]a=new int[]{19,12,14,7,12,10,12,19};
      boolean[]b=new boolean[a.length];
      int x,y,count=0;
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
            System.out.print(a[x]+" ");
     }
   }
}
//freqency elements in array
class main14
{
    public static void main(String[]args)
    {
       int[]a=new int[]{12,23,12,23,24,27,27,23};
       boolean[]b=new boolean[a.length];
       int x,y,count=0;
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
         System.out.println(a[x]+"->freqency= "+count);
       }
    }
}
//duplicate element in array
class main15
{
   public static void main(String[]args)
   {
      int[]a=new int[]{19,12,14,7,12,10,12,19};
      boolean[]b=new boolean[a.length];
      int x,y,count=0;
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
            System.out.print(a[x]+" ");
     }
   }
}
import java.util.Arrays;
class main16
{
   public static void main(String[]args)
   {
       int[]a=new int[]{10,20,40,50,90};
       int[]b=new int[]{20,40,60,30,100,50};
       if(a.length!=b.length)
       {
          System.out.println("not anagram");
          return;
       }
       Arrays.sort(a);
       Arrays.sort(b);
   }
}

