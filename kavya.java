class armstr
{
   public static void main(String []args)
   {
      int num=152,rem=0,count=0,sum=0,copy=num;
      while(num!=0)
      {
        count++;
        num/=10;
      }
     num=copy;
     while(num!=0)
     {
     rem=num%10;
     sum=sum+(int)(Math.pow(rem,count));
     num/=10;
     }
     System.out.println(copy==sum?"armstrong":"not armstrong");
   }
}
class palim
{
   public static void main(String []args)
   {
      int num=121,rem=0,rev=0,copy=num,count=0;
      while(num!=0)
      {
        rem=num%10;
        rev=rev*10+rem;
        num/=10;
       }
       num=copy;
       if(num==rev)
       {
         for(int i=2;i<=num/2;i++)
         {
         if(num%i==0)
         {
           count++;
         }
         }
       }
          System.out.println((num==rev)&&(count==0)?"palindromic prime":"not palindromic prime");
        }
}
class fiba
{
public static void main(String []args)
   {
       int f=0,s=1,t;
       System.out.println(f);
       System.out.println(s); 
       for(int i=1;i<=18;i++)
       {
       t=f+s;
       f=s;
       s=t;
       System.out.println(t);
       }    
   }
}
class tabl
{
  public static void main(String []args)
  {
    int num=1,mul=0,i=0;
    for(i=1;num<=10 && i<=10;num++)
    {
      mul=num*i; 
      System.out.println(num+"*"+i+"="+mul);  
    }
  }
}
class twis
{
  public static void main(String []args)
  {
    int num=13,rev=0,count=0,copy=num,count1=0;
    for(int i=2;i<=num/2;i++)
    {
      if(num%i==0)
      {
        count++;
          if(count==0)
          {
            rev=rev+num%10;
            num/=10;
              if(copy%i==0)
              count1++;
          }
      }
    } 
       System.out.println((count==0)&&(count1==0)?"twisted prime":"not twisted prime");
  }
}
class num
{
   public static void main(String []args)
  {
    int num=3;
    while(num!=0)
    {
    if(num%2==0)
    {
       num=num/2;
    }
    else
    {
    num=(3*num)+1;
    }
    }
     System.out.println(num);
    } 
}










