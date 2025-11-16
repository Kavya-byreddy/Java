class sample
{
    public static void main(String []args)
    {
       int num=8468,rem=0;
       int f=0,s=1,t;
       while(num!=0)
       {
         rem=num%10;
           for(int i=rem;i>=1;i--)
           {
             t=f+s;
             System.out.println(f);

             f=s;
             s=t;
            
           }
         num/=10;
       }
    }
}
class sample1
{
   public static void main(String []args)
   {
     int num=349,rem=0,rev=0,sum=0,copy=num;
     while(num!=0)
     {
       rem=num%10;
       rev=rev*10+rem;
       num/=10;
     }
     num=copy;
     if(rev!=num)
     {
     sum=num+rev;
     }
     num=sum; 
     while(num!=10)
     {
      sum=num%10;
      rev=rev*10+sum;
      num/=10;   
     if(num==rev)
     break;
     System.out.println(sum);
    }
  }
}
class sample2
{
    public static void main(String []args)
    {
      int num=721167,rem=0,rev=0,copy=num;
      while(num!=0)
      {
        rem=num%100;
        char ch=(char)rem;
        num/=100;
        System.out.println(ch);  
      }
      num=copy;
      while(num!=0)
      {
      rem=num%10;
      rev=rev*10+rem;  
      num/=10;
      }
      System.out.println(rev);
      while(rev!=0)
      {
        rem=rev%100;
        char c=(char)rem;
        rev/=100;
        System.out.println(c);
      }
    }
}
class sample1
{
   public static void main(String []args)
   {
     int num=349,rem=0,rev=0,sum=0,copy=num;
     while(num!=0)
     {
       rem=num%10;
       rev=rev*10+rem;
       num/=10;
     }
     num=copy;
     if(rev!=num)
     {
     sum=num+rev;
     }
     num=sum; 
     while(num!=10)
     {
      sum=num%10;
      rev=rev*10+sum;
      num/=10;   
     if(num==rev)
     break;
     System.out.println(sum);
    }
  }
}


 