class sample
{
    public static void main(String []args)
    {
       Boolean status=true;
       int count=0;
       while(status)
       {
       System.out.println("good morning");
       ++count;
       break;
       }
    }
}
class sample1
{
   public static void main(String []args)
   {
      boolean status=true;
      int count=0;
      while(status)
      {
       System.out.println("good morning");
       ++count;
      }
       System.out.println(count);
   }
}
class sample2
{
    public static void main(String []args)
    {
        int num=9848,count=0;
        while(num!=0)
        {
          System.out.println(num%10);
          num=num/10;
          ++count;
        }
       System.out.println(count);
    }
}
class sample3
{
    public static void main(String []args)
    {
        int num=9848,count=0;
        while(num!=0)
        {
          System.out.println(num/10);
          num=num%10;
          ++count;
        }
       System.out.println(count);
    }
}
class sample4
{
    public static void main(String []args)
    {
        int num=65853,rem=0;
        while(num!=0)
        {
          rem=num%10;
          num/=10;
        }
         System.out.println(rem+" "+num);
    }
}
class sample5
{
    public static void main(String []args)
    {
        int num=9849;
        while(num!=0)
        {
            System.out.println(num%10);
            num/=10;
        }
   }
}
class sample6
{
   public static void main(String []args)
   {
     int num=2346,rem=0;
     while(num!=0){
     rem=num%10;
     num/=10;
     System.out.println(rem+1);
     }  
   }
}
class sample7
{
   public static void main(String []args)
   {
     int num=2346;
     double rem=0;
     while(num!=0){
     rem=num%10;
     num/=10;
     rem=(double)Math.sqrt(rem);
     System.out.println(rem);
     }       
   }
}
class sample8
{
   public static void main(String []args)
   {
     int num=12,rem=0,c=0;
     while(num!=0)
     {
        rem=num%10;
        num/=10;
        ++c;
        
     }
       System.out.println(c);
   }
}
class sample9
{
   public static void main(String []args)
   {
      int num=123,rem=0;
      while(num!=0)
      {
      rem=num%10;
      num/=10;
      System.out.println(num+" "+rem);
      }
     System.out.println(num+" "+rem);
}
}
class sample10
{
   public static void main(String []args)
   {
      int num=123,c=0;
      while(num!=0)
      {
      ++c;
      num/=10;
      System.out.println(c);
      }
     System.out.println(c);
}
}
class sample11 

{
   public static void main(String []args)
   {
      int num=123,c=0;
      while(num!=0)
      {
      ++c;
      num/=10;
      System.out.println(num%10+" "+c);
      }
     System.out.println(c);
}
}
class sample12

{
   public static void main(String []args)
   {
      int num=17566578,count=0,rem=0;
      while(num!=0)
      {
      rem=num%100;
      num/=100;
      ++count;
      System.out.println(rem+" "+count);
      }
     System.out.println(count);
}
}
class sample13
{
   public static void main(String []args)
   {
     long num=1234567887654321l;
     int count=0;
 
     double rem=0;
     while(num!=0)
     {
        ++count;
        count=count/2;

        rem=num%(Math.pow(10,(count)));
        num/=10;
     }
     System.out.println(num+" "+count+" "+(count/2));
  }
}
class sample15
{
   public static void main(String []args)
   {
      int num=77,rev=0,rem=0,copy=num;
      while(num!=0)
      {
         rem=num%10;
         rev=rev*10+rem;
         num/=10;  
      }
      if(copy==rev)
        System.out.println("palindrome");
      else
        System.out.println("not palindrome");
    }
}
class sample16
{
   public static void main(String []args)
   {
     int num=342000,rem=0,c1=0,rev=0,c2=0;
     while(num!=0)//34200!=0  //34200 3420 342 34 3
     {
       ++c1;
       rem=num%10;//342000%10=0  0  0 2 4 3
       num/=10;//342000/10=34200  3420  342 34 3 0
       rev=rev*10+rem;//0*10+0=0  0*10+0=0 0 2 24  243
     }
     while(rev!=0)//243//24 2 0
     {
      rem=rev%10;//3//4//2
      rev=rev/10;//24//2//0
      ++c2;
     switch(rev)
      {
      case 1:
              System.out.println("one");
              break;
      case 2:
              System.out.println("two");
              break;
      case 3:
              System.out.println("three");
              break;
      case 4:
              System.out.println("four");
              break;
      case 5:
             System.out.println("five");
             break;
      case 6:
            System.out.println("six");
            break;
      case 7:
            System.out.println("seven");
            break;
      case 8:
             System.out.println("eight");
             break;
      case 9:
             System.out.println("nine");
             break;
      default:
              System.out.println("zero");
      }
      }
    int diff=c1-c2;
    int start=0;
   while(start<=diff)
   {
     System.out.println("zero");
     start++;
   }
   }
}

  class sample17
{
   public static void main(String []args)
   {
      int num=370,rev=0,rem=0,copy=num,c=0,temp=0;
      while(copy!=0)
      {
         rem=copy%10;
         copy/=10; 
         c++; 
      }
      while(num!=0)
      {
         rem=num%10;
         num/=10;  
         temp=temp+(int)(Math.pow(rem,c));
      }
      if(copy==temp)
        System.out.println("armstrong");
      else
        System.out.println("not armstrong");
    }
}
class sample18
{
   public static void main(String []args)
   {
      int num=3456616,count=0;
      while(num!=0)
      {
        num/=10;
        count++;
      }
        System.out.println(count);
   }
}
class sample19
{
   public static void main(String []args)
   {
     int num=12345,sum=0,rem=0;
     while(num!=0)
     {
       rem=num%10;
       num/=10;
       sum=sum+rem;
     }
        System.out.println(sum);
   }
}
class sample21
{
   public static void main(String []args)
   {
     int num=10034000,rem=0,rev=0,c1=0,c2=0;
     while(num!=0)//134000 13400 1340 134 13 1
     {
       ++c1;
       rem=num%10;//0 0 0 4 3 1
       num/=10;//13400 1340 134 13 1 0
       rev=rev*10+rem;//0 0 0 4 43 431
     }
     System.out.println(rev);
     while(rev!=0)//431 43 4 0
     {  
       ++c2;     
       rem=rev%10;//1 3 4
      switch(rem)
      {
      case 1:
              System.out.println("one");
              break;
      case 2:
              System.out.println("two");
              break;
      case 3:
              System.out.println("three");
              break;
      case 4:
              System.out.println("four");
              break;
      case 5:
             System.out.println("five");
             break;
      case 6:
            System.out.println("six");
            break;
      case 7:
            System.out.println("seven");
            break;
      case 8:
             System.out.println("eight");
             break;
      case 9:
             System.out.println("nine");
             break;
      case 0:
              System.out.println("zero");
      }
        rev/=10;//43 4 0
      }
        int diff=c1-c2;
        int start=1;
         while(start<=diff)
         {
           System.out.println("zero");
            diff--;
          }
   }
}
class sample120
{
   public static void main(String []args)
   {
      int num=607564,rem=0;
      boolean status=false;
      while(num!=0)
      {
        rem=num%10;
        num/=10;
        if(rem==5)
        {
           status=true;
        System.out.println("five is present");
          break;
        }
        else
        System.out.println("not");
       }
       }       
}
class sample22
{
    public static void main(String []args)
    {
       int num=4454237,count=0,rem=0;
       while(num!=0)
       {
         rem=num%10;
         num/=10;
         if(rem%2!=0)
          {
           count++;
         }
               }
       System.out.println(count);
    }
}
class sample23
{
    public static void main(String []args)
    {
      int num=143000,rev=0,rem=0,c=0,c2=0,rev2=0;
      System.out.println(num);
      while(num!=0)       {
        ++c;
        rem=num%10; 
        num/=10;  
        rev=(rev*10)+rem;
       }
        System.out.println(rev);
      while(rev!=0)      {
      rem=rev%10;
      rev/=10;
      rev2=rev2*10+rem;
      c2++;
      }
      int diff=c-c2,rev1=0;
            if(c!=c2)
            rev1=rev2*(int)Math.pow(10,diff);
        System.out.println(rev1);
     }
}
class sample24
{
   public static void main(String []args)
   {
     int num=123456,count=0,temp=num,rev=0;
     while(num!=0)
     {
       
       num/=10;
       ++count;
     }
     num=temp;
     int n1=num%(int)Math.pow(10,(count/2));
     int n2=num/(int)Math.pow(10,(count/2));
     int n3=n1+n2;
     System.out.println(n3);
     int temp1=n3;
     while(n3!=0)
     {
       rev=rev*10+(n3%10);
       n3/=10;
     }
      n3=temp1;
     System.out.println(n3==rev?"palindrome":"not palindrome");
   }
}
class sample25
{
public static void main(String []args)
{
   int num=3455678,rem=0;
   while(num!=0)
   {
   rem=num%10;
   num/=10;
   if(rem%2!=0)
   System.out.println(rem);
   }
}
}
class sample26
{
  public static void main(String []args)
  {
    int num=3145627,count1=0,count2=0,rem=0;
    while(num!=0)
    {
      rem=num%10;
      if(rem%2==0)
      ++count1;
      else
      ++count2;
      num/=10;
    }
     System.out.println(count1+" "+count2);
  }
}
class sample27
{
   public static void main(String []args)
   {
     int num=421689,rem=0,value=0;
     while(num!=0)
     {
       rem=num%10;
       value=(int)Math.sqrt(rem);
       if(rem==value*value)
       System.out.println(rem);
       num/=10;
     }
   }
}
class sample28
{
   public static void main(String []args)
   {
     int num=251416,rem=0,value=0;
     while(num!=0)
     {
     rem=num%100;
     num/=100;
     value=(int)Math.sqrt(rem);
     if(rem==value*value)
     System.out.println(rem);
     }
   }
}
class sample29
{
   public static void main(String []args)
   {
      int num=211414,rem=0,sum=0;
      while(num!=0)
      {
        rem=num%10;
        num/=10;
        if(rem%2==0)
        
          sum=sum+rem;
       }
          int value=(int)Math.sqrt(sum);
          if(sum==(value*value))
            System.out.println("perfect square");
          else
            System.out.println("not a perfect square");
   }
}
class sample30
{
   public static void main(String []args)
   {
     int num=234789,rem=0,sum=0;
     while(num!=0)
     {
       rem=num%10;
       num/=10;
       if(rem!=0)
       sum=sum+rem;
     }
           if(sum%2==0)
           System.out.println("even");
           else
           System.out.println("not even");
   }
}













