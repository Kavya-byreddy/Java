import java.util.Arrays;
//toogle case
class main1
{
    public static void main(String[]args)
    {
        String s="HelLo All GooD Morning";
        char c[]=s.toCharArray();
        for(int x=0;x<c.length;x++)
        {
            if(c[x]>='A' && c[x]<='Z')
            c[x]+=32;
            else if(c[x]==' ')
            c[x]=c[x];
            else
            c[x]-=32;
        }
        System.out.println(c);
    }
}
//String to charArray
class main2
{
   public static void main(String[]args)
   {
      String s=new String("Hell$o1 all* A3 good 2morning");
      char c[]=s.toCharArray();
      Arrays.sort(c);
      for(char temp:c)
         System.out.print(temp);
   }
}
//number of words in a string
class main3
{
    public static void main(String[]args)
    {
        String s="Hello all good morning";
        int count=0;
        char[]a=s.toCharArray();
        for(int x=0;x<a.length;x++)
        {
             if(a[x]==' ')
             count++;
        }
        count+=1;
        System.out.println(count);
    }
}
//rev the string
class main4
{
    public static void main(String[]args)
    {
       String s="Hello all good morning";
       String copy=" ";
       char c[]=s.toCharArray();
       for(int x=c.length-1;x>=0;x--)
       {
          copy=copy+c[x];
       }
        System.out.print(copy);
    }
}
//to check given string is palindrome or not
class main5
{
    public static void main(String[]args)
    {
       String s="MADA";
       String copy="";
       char[]c=s.toCharArray();
       for(int i=c.length-1;i>=0;i--)
       {
           copy+=c[i];
       }
       System.out.println(s.equals(copy)?"palin":"not");
    }
}
//how many numbers,symbols,uppcase,lower in a given string
class main6
{
    public static void main(String[]args)
    {
        String s="Hello!1 all 7GooD ^Mo3rning0";
        int countupper=0,clower=0,cnumber=0,csymbols=0;
        char[]c=s.toCharArray();
        for(int x=0;x<c.length;x++)
        {
           if(c[x]>='A' && c[x]<='Z')
           countupper++;
           else if(c[x]>='a' && c[x]<='z')
           clower++;
           else if(c[x]>='0' && c[x]<='9')
           cnumber++;
           else
           csymbols++;
        }
       System.out.println("countupper "+countupper);
       System.out.println("clower "+clower);
       System.out.println("cnumber "+cnumber);
       System.out.println("csymbols "+csymbols);
    }
}
//vowels and cons in a string
class main7
{
    public static void main(String[]args)
    {
       String s="Hello allgoodmorning";
       char c[]=s.toCharArray();
       int countvowel=0,ccons=0;
       for(int x=0;x<c.length;x++)
       {
        if(Character.isLetter(c[x])) 
        {
if(c[x]=='A'||c[x]=='E'||c[x]=='I'||c[x]=='O'||c[x]=='U'||c[x]=='a'||c[x]=='e'||c[x]=='i'||c[x]=='o'||c[x]=='u')
      countvowel++;
      else
         ccons++;
       }
     }
      System.out.println("countvowel"+countvowel);
      System.out.println("ccons"+ccons);
    }
}
//freqencies of characters
class main8
{
    public static void main(String[]args)
    {
       String s="Hello all good morning";
       char[]c=s.toCharArray();
       boolean[]b=new boolean[c.length];
       for(int i=0;i<c.length;i++)
       {
           if(b[i]==true||c[i]==' ')
           continue;
           int count=1;
         for(int j=i+1;j<c.length;j++)
         {
            if(c[i]==c[j])
            {
               count++;
               b[j]=true;
            }
         }
          System.out.println(c[i]+"->"+count);
       }
    }
}
//duplicate characters
class main9
{
    public static void main(String[]args)
    {
        String s="Hello all good morning";
        char[]c=s.toCharArray();
        boolean[]b=new boolean[c.length];
        for(int i=0;i<c.length;i++)
        {
           if(b[i]==true||c[i]==' ')
           continue;
           int count=1;
            for(int j=i+1;j<c.length;j++)
            {
                if(c[i]==c[j])
                {
                     count++;
                     b[j]=true;
                }
            }
            if(count>1)
                 System.out.println(c[i]+"->"+count);
        }
    }
}
//unique characters
class main10
{
    public static void main(String[]args)
    {
        String s="Hello all good morning";
        char[]c=s.toCharArray();
        boolean[]b=new boolean[c.length];
        for(int x=0;x<c.length;x++)
        {
           if(b[x]==true||c[x]==' ')
           continue;
           int count=1;
              for(int y=x+1;y<c.length;y++)
              {
                  if(c[x]==c[y])
                  {
                     count++;
                     b[y]=true;
                  }
              }
              if(count==1)
              System.out.println(c[x]+"->"+count);
        }
    }
}
//search whether specificcharacter is present or not