import java.util.Arrays;
class main
{
   public static void main(String[]args)
   {
       String s="hello1 all2 go3od 2morni1ng";
       String s2="",s3="";
       for(int x=0;x<s.length();x++)
       {
          char ch=s.charAt(x);
          if(ch>='0' && ch<='9')
          {
             s2=s2+ch;
          }
       }
      System.out.println(s2);
        char[] a=s2.toCharArray();
        for(int y=a.length-1;y>=0;y--)
        {
           s3=s3+a[y];
        }
       System.out.println(s2.equals(s3)?"palindrome":"not palindrome");
   }
}
class main1
{
    public static void main(String[]args)
    {
        String s="hello all good morning everyone";
        String s2[]=s.split(" ");
        String s3="";
        for(int x=0;x<s2.length;x++)
        {
            String word=s2[x];
            if(word.length()%2!=0)
            {
            s3+=word;
            }
            else
            {
                char []c=word.toCharArray();
                for(int y=0;y<word.length();y+=2)
                {
                    char a=c[y];
                    c[y]=c[y+1];
                    c[y+1]=a;
                }
               word=new String(c);
            }
            System.out.print(word+" ");
        }
    }
}