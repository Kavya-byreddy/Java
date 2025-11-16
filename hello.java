class sample1
{
  public static void main(String []args)
  {
    int num=934157,min=9,rem=0;
    while(num!=0)
    {
      rem=num%10;
      if(min>rem)
      min=rem;
      num/=10;
    }
    System.out.println(min);   
  }
}
class sample2
{
 public static void main(String []args)
 {
  int num=2,mul=1;
  for(int start=1;start<=10;start++)
  {
  mul=num*start;
  System.out.println(num+"*"+start+"="+mul);
  }
 }
}
class sample3
{
 public static void main(String []args)
 {
  int num=2,mul=1;
  for(int start=10;start>=1;start--)
  {
  mul=num*start;
  System.out.println(num+"*"+start+"="+mul);
  }
 }
}
class sample4
{
   public static void main(String []args)
   {
     int num1=2456178,rem=0,sum=0;
     while(num1!=0)
     {
      rem=num1%10;
      sum=sum+rem;
      num1/=10;
     }
     System.out.println(sum);
   }
}
class sample5
{
   public static void main(String []args)
   {
      int num=2256886,rem=0,count=0;
      while(num!=0)
      {
      rem=num%10;
      num/=10;
      ++count;
      }
      System.out.println(count);
   }
}
class sample6
{
   public static void main(String []args)
   {
      int num=2256886,rem=0,sum=0;
      while(num!=0)
      {
      rem=num%10;
      sum=(int)Math.pow(rem,2);
      num/=10;
      System.out.println(sum);
      }
      
   }
}
class sample7
{
   public static void main(String []args)
   {
      int num=2156876,rem=0,rev=0;
      while(num!=0)
      {
      rem=num%10;
      rev=rev*10+rem;
      num/=10;
      }
      System.out.println(rev);  
   }
}
class sample8
{
   public static void main(String []args)
   {
      int num=2156512,rem=0,rev=0,temp=num;
      while(num!=0)
      {
      rem=num%10;
      rev=rev*10+rem;
      num/=10;
      }
      num=temp;
      if(num==rev)
      System.out.println("palindrome"); 
      else
      System.out.println("not palindrome");
   }
}
class sample9
{
   public static void main(String []args)
   {
      int num=301,rem=0,count=0,temp=num,arm=0;
      while(num!=0)
      {
      rem=num%10;
      count++;
      num/=10;
      }
      num=temp;
      while(num!=0)
      {
       rem=num%10;
       arm=arm+(int)Math.pow(rem,count);
          num/=10;
      }
      num=temp;
      if(num==arm)
      System.out.println("armstrong"); 
      else
      System.out.println("not armstrong");
   }
}
class sample10
{
   public static void main(String []args)
   {
      int num=25468,rem=0,count=0;
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
class sample11
{
   public static void main(String []args)
   {
      int num=215469,rem=0,min=9,max=1,temp=num;
      while(num!=0)
      {
      rem=num%10;
      if(rem<min)
       {
       min=rem;
       }
      num/=10;
      }
      num=temp;
      while(num!=0)
      {
      rem=num%10;
      if(rem>max)
       {
        max=rem;
       }
       num/=10;
      }
     System.out.println(min+max);
    }
}
class sample12
{
  public static void main(String[] args)
   {
     int start=4438,end=903499,count=0;
     for(start=4438;start<end;start+=2)
     {
     count++;
     }
     System.out.println(count);
   }
}
class sample13
{
   public static void main(String []args)
   {
     int count=0;
     for(int start=99;start>=4;start--)
       if(start%2!=0)
       count++;
     System.out.println(count);
   }
}
class sample14
{
   public static void main(String []args)
   {
     int count=0,per=0;
     for(int start=44;start<=88;start++)
     {
      per=(int)Math.sqrt(start);
      int p=per*per;
      if(p==start)
      {
       count++;
      System.out.println(start);
      }
     
     }
     System.out.println(count);
   }
}
class sample15
{
  public static void main(String []args)
  {
    int start=18,end=6;
    for(start=18;start>=6;start--)
    {
      int sqr=(int)Math.pow(start,2);
      System.out.println(sqr);
    }
  }
}
class sample16
{
   public static void main(String []args)
   {
      int num=1000,count=0;
      for(int x=1;x<=num;x++)
      {
          if(num%x==0)
          {
               count++;
          }
       }  
         if(count>=10)
              System.out.println("superset");
   }
}
class sample17
{
   public static void main(String []args)
   {
      int num=17,count=0;
      for(int x=1;x<=num;x++)
      {
          if(num%x==0)
               count++;
       }  
         if(count==2)
              System.out.println("prime");
         else
              System.out.println("not prime");
   }
}
class sample18
{
    public static void main(String []args)
    {
       int start;
       for(start=0;start<=127;start++)
       {
         if(start>='A' && start<='Z')
         System.out.println((char)(start+32));
       }
   }
}
class sample19
{
    public static void main(String []args)
    {
       int number=10,count=0;
       for(int x=1;x<=number;x++)
       {
         if(number%x==0)
         count++;
       }
         System.out.println(count);
    }
}
class sample20
{
   public static void main(String []args)
   {
      int number=500,count=0;
      for(int x=1;x<=number;x++)
      {
         if(number%x==0)
         {
         count++;
         System.out.println(count);
         }
      }
        if(count>=10)
        System.out.println("superset");
   }
}
class sample21
{
   public static void main(String []args)
   {
       int number=1000,sum=0;
       for(int x=1;x<=number;x++)
       {
          if(number%x==0)
          {
          sum=sum+x;
          System.out.println(x);
          }
       }
        System.out.println(sum);
   }
}
class sample22
{
   public static void main(String []args)
   {
      int num=2,end=10,x;
      for(x=1;x<=end;x++)
      {
       int mul=num*x;
       if(x%2==0)
       System.out.println(num+"*"+x+"="+mul);
      }
   }
}
class sample23
{
   public static void main(String []args)
   {
      int num=2,end=10,x;
      for(x=1;x<=end;x++)
      {
       int mul=num*x;
       if(x%2!=0)
       System.out.println(num+"*"+x+"="+mul);
      }
   }
}
class sample24
{
   public static void main(String []args)
   {
      int num=2,end=10,x,sum=0;
      for(x=1;x<=end;x++)
      {
       int mul=num*x;
       if(x%2==0)
       {
         sum+=mul;
       System.out.println(num+"*"+x+"="+mul);
       
       }
      
        }
        System.out.println(sum);
         if(sum%2==0)
        System.out.println("even");
         else
         System.out.println("not even");
   }
}
class sample25
{
  public static void main(String []args)
  {
    int num=7,end=10;
    for(int x=1;x<=end;x++)
    {
      int mul=num*x;
      if(mul%2==0)
      System.out.println(num+"*"+x+"="+mul);
    }
  }
}
class sample26
{
   public static void main(String []args)
   {
     int num=3,end=10,sum=0,count=0;
     for(int x=1;x<=end;x++)
     {
       int mul=num*x;
       if(mul%2!=0)
       {
        sum+=mul;
       }
    }
          System.out.println(sum);
          for(int x=1;x<=sum;x++)
          {
           if(sum%x==0)
            count++;
          }
            System.out.println(count);
           if(count==2)
          System.out.println("prime");
          else
          System.out.println("not prime");
   }
}
class sample27
{
   public static void main(String []args)
   {
      int num=16,end=10,mul=0,sq=0,square=0;
      for(int x=1;x<=end;x++)     
        {
        mul=num*x;       
        sq=(int)Math.sqrt(mul);
        if(mul==(sq*sq))
        System.out.println(num+"*"+x+"="+mul);
      }
   }
}
class sample28
{
   public static void main(String []args)
   {
     int x=2400,end=1600,count=0;
     for(;x>=1600;x--)
     {
     if(x%4==0 && x%100!=0 || x%400==0)
     count++;
     }
     System.out.println(count);
   }
}
class sample29
{
   public static void main(String []args)
   {
     int num=34567,rem=0,count=0;
     int last_num=num%10;
     while(num!=0)
     {
         rem=num%10; 
         num/=10;
     }
      System.out.println(last_num+rem);
   }
}
class sample30
{
   public static void main(String args[])
   {
     int num=12391,rem=0,sum=0;
     while(num!=0)
     {
       rem=num%10;
       sum=rem+1;
       if(rem==9)
         sum=0;
       System.out.print(sum);
       num/=10;
     } 
   }
}
class sample31
{
   public static void main(String []args)
   {
        int num=12567,rem=0,count=0,count1=0,product=1,temp=num;
        while(num!=0)
        {
          rem=num%10;
          num/=10;
          count++;         
        }
        num=temp;
        while(num!=0)
        {
          rem=num%10;
          num/=10;
          count1++;
          if(count1!=1 && count1!=count)
          {
          product=product*rem;
          }
        }
         System.out.println(product);
   }
}
class sample32
{
  public static void main(String []args)
  {
      int num=134562,rem=0,digit=0;
      while(num!=0)
      {
        rem=num%10;
        num/=10;
        if(rem==7)
        {
        digit=1;
        }
      }
        if(digit==1)
        System.out.println("digit found");
        else
        System.out.println("digit not found");  
  }
}
class sample33
{
   public static void main(String []args)
   {
      int num=246190,rem=0,count=0;
      while(num!=0)
      {
         rem=num%10;
         num/=10;
         if(rem%4==0){
         count++;
         System.out.println(rem);
         }
      }
         System.out.println(count);
   }
}
class sample34
{
   public static void main(String []args)
   {
      int num=12345,rem=0,count=0,sum=0;
      while(num!=0)
      {
        rem=num%10;
        num/=10;
        count++;
        if(count%2!=0)
        sum=sum+rem;
      }
       System.out.println(sum);
   }
}
class sample35
{
    public static void main(String []args)
    {
        int num=123351,rem=0,count=0,temp=num,sum1=0,rev=0,sum2=0,i=0;
        while(num!=0)
        {
            rem=num%10;
            num/=10;
            count++;
         }
          System.out.println(count);
        num=temp;
        while(num!=0)
        {
           rem=num%10;
           rev=rev*10+rem;
           num/=10;
        }
        System.out.println(rev);
        while(rev!=0)
        {
        if(i<count/2)
            sum1=sum1+rev%10;
        else
            sum2=sum2+rev%10;
         rev/=10;
         i++;
         }
         if(sum1==sum2)
           System.out.println("lucky");
         else
           System.out.println("not lucky");
     }
}
class fibanocci
{
    public static void main(String []args)
    {
        int f=0,s=1,t,coun;
        System.out.println(f);
        System.out.println(s);
        for(int i=1;i<=8;i++)
        {
            t=f+s;
            System.out.println(t);
            f=s;
            s=t; 
        }
    }
}
class sample36
{
   public static void main(String []args)
   {
       int count=0,r=0;
         for(int i=1;true;i++)
         {
            if(i%2==0)
            {
            count++;
              if(count==7)
              {
              System.out.println(i);
              break;
             }
           }
        }
   }
}
class sample37
{
    public static void main(String []args)
    {
      int num=10,count=0,max=0,i;
      for(i=1;i<=num/2;i++)
      {
        if(num%i==0)
        {
          count++;
          max=i;
        }
      }
      System.out.println(max);
    }
}
class sample38
{
    public static void main(String []args)
    {
       int num=19,i;
       for(i=2;i<=num;i++)
       {
         if(num%i==0)
         {
         System.out.println(i);
         break;
         }
       }
    }
}
class sample39
{
     public static void main(String []args)
     {
        int num1=27,num2=37,i;
        for(i=num2/2;i<=num1 && i<=num2;i--)
        {
           if(num1%i==0 && num2%i==0)
           {
            System.out.println(i);
            break;
           }
        }
     }
}
class sample40
{
   public static void main(String []args)
   {
      int f=0,s=1,t,count=0,i;
      for(i=1;i<=8;i++)
      {
        t=f+s;
        count++;
        f=s;
        s=t; 
        if(count==8)
        System.out.println(t);
       }
    }
}
class sample41
{
   public static void main(String []args)
   {
      int f=0,s=1,t,i;
      for(i=1;i<=10;i++)
      {
        t=f+s;
        System.out.println(t);
        f=s;
        s=t; 
       }
    }
}
class sample42
{
   public static void main(String []args)
   {
      int num=563,rem=0,sum=0,count=0,f=0,s=1,t=0;
      while(num!=0)
      {
         rem=num%10;
         sum=sum+rem;
         num/=10; 
      }
       System.out.println(sum);
      for(int i=1;i<=sum-2;i++)
      {
        t=f+s;
        count++;
        f=s;
        s=t;
        System.out.println(t);
      }
   }
}
class sample43
{
  public static void main(String []args)
  {
     int f=0,s,t,x,temp=f;
     f=0;
     s=1;
     for(x=1;x<=9;x++)
     {
       t=f+s;
       temp=f;
       f=s;
       s=t;
     }
     System.out.println(temp);
  }
}
class prime44
{
   public static void main(String []args)
   {
     int number=47,x,factor=0;
     for(x=2;x<=number/2;x++)
     {
        if(number%x==0)
        {
          factor++;
          break;
        }
     }
        if(factor==0)
        System.out.println(number);
   }
}
class prime45
{
   public static void main(String []args)
   {
     int count=0,sum=0;
     for(int y=478;y<=558;y++)
     {
     int number=y,x,factor=0;
     for(x=2;x<=number/2;x++)
     {
        if(number%x==0)      
         {
          factor++;
          break;
        }
     }
        if(factor==0)
        {
        System.out.println(number);
        count++;
        sum=sum+number;
        }
     }
      System.out.println(count);
      System.out.println(sum);
   }
}
class sample46
{
   public static void main(String []args)
   {
   int num=12321,rem=0,rev=0,temp=num;
   while(num!=0)
   {
     rem=num%10;
     rev=rev*10+rem;
     num/=10;
    }
     if(temp==rev)
     System.out.println(temp);
  } 
}
class sample47
{
   public static void main(String []args)
   {
   for(int num1=12321;num1<=13731;num1++)
   {
   int num=num1,rem=0,rev=0,temp=num;
   while(num!=0)
   {
     rem=num%10;
     rev=rev*10+rem;
     num/=10;
    }
     if(temp==rev)
     System.out.println(temp);
    }
  } 
}
class sample48
{
  public static void main(String []args)
  {
    int num=152,rem=0,digit=0,copy=num,sum=0;
    while(num!=0)
    {
     digit++;
     num/=10;
    }
    num=copy;
    while(num!=0)
    {
      rem=num%10;
      sum=sum+(int)Math.pow(rem,digit);
      num/=10;  
}
    System.out.println(sum==copy?"armstrong":"not armstrong");
  } 
}
class sample49
{
  public static void main(String []args)
  {
    for(int num1=153;num1<=400;num1++)
    {
    int num=num1,rem=0,digit=0,copy=num,sum=0;
    while(num!=0)
    {
     digit++;
     num/=10;
    }
    num=copy;
    while(num!=0)
    {
      rem=num%10;
      sum=sum+(int)(Math.pow(rem,digit));
      num/=10;
    }
 if(copy==sum)
    System.out.println(sum); 
    }
  } 
}
class sample50
{
   public static void main(String []args)
   {
      int num=1331,rem=0,rev=0,copy=num,sum=0;
      while(num!=0)
      {
      rem=num%10;
      rev=rev*10+rem;
      num/=10;
      }
      num=copy;
      if(num==rev)
      {
        while(num!=0)
        {
        rem=num%10;
        sum=sum+rem;
        num/=10;
        }
        System.out.println(sum%2==0?"even":"odd");
      }
      else
      System.out.println("not palindrome");
   }
}
class sample51
{
   
}




































