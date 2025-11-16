import java.util.Arrays;
class main
{
   public static void main(String[]args)
   {
      String s=new String("hi all good morning");
      String copy="";
      char ch[]=s.toCharArray();
      for(int i=ch.length-1;i>=0;i--)
      {
         copy+=ch[i];
      }
      System.out.println(copy);
   }
}
class main1
{
    public static void main(String[]args)
    {
       String str=new String("MALAYALAM");
       String copy="";
       char ch[]=str.toCharArray();//M A L A Y A L A M
       for(int i=ch.length-1;i>=0;i--)
       {
          copy+=ch[i];//M 
       }
         System.out.println((str.equals(copy))?"palindrome":"not palindrome");
    }
}
class main2
{
   public static void main(String[]args)
   {
      String s=new String("hi all good morning");
      char ch[]=s.toCharArray();
      Arrays.sort(ch);
      System.out.println(ch);
   }
}
class main3
{
   public static void main(String[]args)
   {
      String s=new String("H4i1 @aLl *1good 3morning");
      char ch[]=s.toCharArray();
      String a="",b="",c="",d="";
      for(int i=0;i<ch.length;i++)
      {
         if(ch[i]==' ')
            a+=ch[i];
         else if(ch[i]>='a' && ch[i]<='z'||ch[i]>='A' && ch[i]<='Z' )
            b+=ch[i];
         else if(ch[i]>='0' && ch[i]<='9')
            c+=ch[i];
         else
            d+=ch[i];
      }
            System.out.print(a+" "+b+" "+c+" "+d);
   }
}
class main4
{
   public static void main(String[]args)
   {
      String s=new String("morning");
      char ch[]=s.toCharArray();char temp;
      for(int i=0;i<ch.length-1;i+=2)
      {
            temp=ch[i];
            ch[i]=ch[i+1];
            ch[i+1]=temp;
      }
      System.out.println(ch);
   }
}