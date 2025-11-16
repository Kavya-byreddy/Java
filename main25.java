class main
{
  public static void main(String []args)
  {
     Palindrome palindrome=new Palindrome();
     palindrome.num=121;int copy=palindrome.num;
     int result=palindrome.calPalim(palindrome.num);
     palindrome.num=copy;
     palindrome.isPalim(result);
  }
}
class Palindrome
{
  int num,rem,rev;
  int calPalim(int num)
  {
    while(num!=0)
    {
    rem=num%10;
    rev=rev*10+rem;
    num/=10;
    }
    return rev;
  }
  void isPalim(int result)
  {
   System.out.println(rev==num?"palindrome":"not palindrome");
  }
}