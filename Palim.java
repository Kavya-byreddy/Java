class Palim
{
     int num,rev;
     int calPalim()
     {
        while(num!=0)
        {
          rev=rev*10+(num%10);
          num/=10;
        }
         return rev;
     }
    public static void main(String []args)
   {
      Palim palim=new Palim();
      palim.num=1231;
      int copy=palim.num;
      int result=palim.calPalim();
      System.out.println(result==copy?"palindrome":"not palindrome");
   }
}