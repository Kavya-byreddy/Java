class sample49
{
  public static void main(String []args)
  {
int num1;
    for(num1=153;num1<=400;num1++)
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
