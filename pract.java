import java.util.Arrays;
//count length of the string without using length() method
class main
{
   public static void main(String[]args)
   {
       String s="Hi all";
       int count=0;
       char[]c=s.toCharArray();
       for(char temp:c)
       {
          count++;
       }
       System.out.println(count);
   }
}
//convert a given string to uppercase and lowercase
class main1
{
   public static void main(String[]args)
   {
      String s="Hi all good morning";
      System.out.println(s.toUpperCase());
      System.out.println(s.toLowerCase());
   }
}
//2 strings equal or not
class main2
{
   public static void main(String[]args)
   {
       String s1="Hi all";
       String s2="hi all";
       String s3="hi all good";
       String s4="hi all Good";
       System.out.println(s1.equalsIgnoreCase(s2));  
       System.out.println(s3.equals(s4));  
   }
}
//find the character at a given length
class main3
{
   public static void main(String[]args)
   {
      String s="Hi all good morning";
      System.out.println(s.charAt(3));
   }
}
//concate two strings without using + operater
class main4
{
    public static void main(String[]args)
    {
       String s1="hello";
       String s2="world";
       System.out.println(s1.concat(" "+s2));
    }
}
//count vowels and consonants
class main5
{
   public static void main(String[]args)
   {
      String s="Hi All Good Morning";
      s=s.toLowerCase();
      int vowel=0,consonants=0;
      for(char i=0;i<s.length();i++)
      {
         char ch=s.charAt(i);
          if(ch>='a'&& ch<='z')
          {
                if("aeiou".indexOf(ch)!=-1)
                vowel++;
                else
                consonants++;
          }
      }
      System.out.println("vowel "+vowel);
      System.out.println("consonants "+consonants);
   }
}
//reverse a string
class main6
{
   public static void main(String[]args)
   {
       String s="hi all good morning";
       String rev="";
       char[] ch=s.toCharArray();
       for(int i=ch.length-1;i>=0;i--)
       {
           rev+=ch[i];
       }
       System.out.println(rev);
   }
}
class main7
{
    public static void main(String[]args)
    {
       String s="hi all good morning";
       StringBuilder sb=new StringBuilder(s);
       sb.reverse();
       System.out.println(sb);
    }
}
class main8
{
   public static void main(String[]args)
   {
      String s="madam";
      String s1="";
      char[]ch=s.toCharArray();
      for(int i=ch.length-1;i>=0;i--)
      {
         s1+=ch[i];
      }
      System.out.println(s1.equals(s)?"palindrome":"not");
   }
}
class main9
{
   public static void main(String[]args)
   {
      String s="madam";
      String rev=new StringBuffer(s).reverse().toString();
      if(s.equals(rev))
      System.out.println("p");
      else
      System.out.println("not");
   }  
}
class main10
{
   public static void main(String[]args)
   {
      String s="hi all good morning";
      String []words=s.split(" ");
      int count=0;
      for(int i=0;i<words.length;i++)
      {
        count++;
      }
      System.out.println(count);
   }
}
class main11
{
   public static void main(String[]args)
   {
      String s="hi all good morning";
      String []words=s.split(" ");
      System.out.println(words.length);
   }
}
class main12
{
   public static void main(String[]args)
   {
      String s="  hi all good morning   ";
      System.out.println(s.replace('o','z'));
   }
}
class main13
{
   public static void main(String[]args)
   {
       String s="hi all welcome to java programming";
       String[]words=s.split(" ");
       String longest=words[0];
       for(String word:words)
       {
          if(word.length()>longest.length())
          longest=word;
       }
       System.out.println(longest);
   }
}
class main14
{
   public static void main(String[]args)
   {
       String s="programming";
       char[]ch=s.toCharArray();
       Arrays.sort(ch);
      System.out.println(ch);
   }
}
class main15
{
    public static void main(String[]args)
    {
        String s="kavya";
        for(int i=0;i<s.length();i++)
        {
           for(int j=i+1;j<s.length();j++)
           {
              System.out.println(s.substring(i,j));
           }
        }
    }
}
class main16
{
    public static void main(String[]args)
    {
        String s1="listen";
        String s2="silent";
        char[]ch1=s1.toCharArray();
        char[]ch2=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2))
          System.out.println("anagram");
        else
          System.out.println("not anagram");  
    }
}
class main17
{
    public static void main(String[]args)
    {
       String s="hello";
       char[]c=s.toCharArray();
       char temp=c[0];
       c[0]=c[c.length-1];
       c[c.length-1]=temp;
       System.out.println(c);
    }
}