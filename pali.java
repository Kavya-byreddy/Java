class Pali
{ 
  public static void main(String [] args){
    int num=349,rev=0,temp=num,rem=0;
    while(num!=0){
      rem=num%10;
      num/=10;
      rev=rev*10+rem;
    }
    num=temp;
    if(num==rev)
     System.out.println("palindrome");
    else
    {
      while(num!=0){
       int sum=0,rev1=0;
       sum=num+rev;
        num=sum;
        System.out.println(num);
        while(num!=0){//1292
         rem=num%10;
         rev1=rev1*10+rem;
         num/=10;
        }
        num=sum;
         if(num==rev1)
         System.out.println(num);
         else 
          sum=num+rev1;     
         num=sum;
      }           
    }
  }
}
class sample5
{
   public static void main(String []args)
   {
     int num=1981,rem=0,rev=0,count=0,copy=num,sum1=0,sum2=0,sum=0;
     while(num!=0)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
     {
        count++;
        num/=10;
     }
     num=copy;
     int n1=num%((int)Math.pow(10,count/2));
     int n2=num/((int)Math.pow(10,count/2));
     while(n1!=0)
     {
     rem=n1%10;
     sum1=sum1+rem;
     n1/=10; 
         
     }
     while(n2!=0)
     {
     rem=n2%10;
     sum2=sum2+rem;
     n2/=10;     
     }
      sum=sum1+sum2;
      System.out.println(sum);
   }
}
class sample6
{
   public static void main(String []args)
   {
     int num=12321,rem=0,count=0,copy=num;
     while(num!=0)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
     {
        rem=num%10;
        num/=10;
        count++;
     }
     System.out.println(count);      
     num=copy;
     int n1=num%(int)Math.pow(10,count/2);
     int n2=num/(int)Math.pow(10,count/2);
     int n=n1+n2;
     System.out.println(n1);      
     System.out.println(n2);      
     System.out.println(n);      
     while(n!=0)
     {
       rem=n%10;
       for(int i=1;i<=rem;i++)
       {
       if(rem%i==0)
        System.out.println(i);      
      }
      n/=10;
     }
   }
}
class Digit
{
   public static void main(String []args)
   {
      int num=479,rem=0,rev=0,sum=0;
      while(num!=0)
      {
         rem=num%10;
         rev=rev*10+rem;
         num/=10;
      }
      while(rev!=0)
      {
       rem=rev%10;
       sum=rem+1;
       if(sum==10)
       sum=0;
        rev/=10;
      System.out.print(sum);   
      }   
   }
}
class digit1
{
   public static void main(String []args)
   {
       int num=4567,rem=0,count=0,copy=num;
       while(num!=0)
       {
         count++;
         num/=10;
       }
       num=copy;
       while(num!=0)
       {
       rem=num%10;
       num/=10;
         System.out.println(count);
       }
   }
}




























