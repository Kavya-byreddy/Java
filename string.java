import java.util.Arrays;
//how many vowels & consonants are their in a string
class main
{
   public static void main(String[]args)
   {
       String s=new String("hello");
       char[]a=s.toCharArray();
       int vowels=0,consonants=0;
       for(int i=0;i<a.length;i++)
       {
         if(a[i]=='a'||a[i]=='e'||a[i]=='o'||a[i]=='e'||a[i]=='u')
         vowels++;
         else
         consonants++;
       }
       System.out.println("vowels"+vowels);
       System.out.println("consonants"+consonants);
   }
}
class main1
{
   public static void main(String[]args)
   {
      String s=new String("Hello1! All2@ Good#0 ^Morning9");
      char[]a=s.toCharArray();
      int numbers=0,symbols=0,upper=0,lower=0;
      for(int i=0;i<a.length;i++)
      {
         if(a[i]>='0'&&a[i]<='9')
         numbers++;
         else if(a[i]>='A'&&a[i]<='Z')
         upper++;
         else if(a[i]>='a'&&a[i]<='z')
         lower++;
         else
         symbols++;
      }
       System.out.println("numbers="+numbers);
       System.out.println("symbols="+symbols);
       System.out.println("upper="+upper);
       System.out.println("lower="+lower);
   }
}
class main2
{
   public static void main(String[]args)
   {
      String s=new String("HelloWorld");
      System.out.println(s);
      char[]a=s.toCharArray();
      int upper=0,lower=0;
      for(int i=0;i<a.length;i++)
      {
         if(a[i]>='A'&&a[i]<='Z')
         {
            a[i]=(char)(a[i]+32);
         }
         else
         {
            a[i]=(char)(a[i]-32);
         }
      }
     for(char temp:a)
      System.out.print(temp);
   }
}
class main3
{
   public static void main(String[]args)
   {
      String s=new String("hello world");
      System.out.println(s);
      boolean b=false;
      char[]a=s.toCharArray();
      System.out.print(a);
      int i,j,count=0,count1=0,count2=0,count3=0,count4=0;
      for(i=0;i<a.length;i++)
      {
          if(b==true)
          continue;
          count=0;
          for(j=i+1;j<a.length;j++)
          {
             if(a[j]>='A'&&a[j]<='Z')
             {
                count1++;
                b=true;
             }
             else if(a[j]>='a'&&a[j]<='z')
             {
                count2++;
                b=true;
             }
            else if(a[j]>='0'&&a[j]<='9')
             {
                count3++;
                b=true;
             }
           else
             {
                count4++;
                b=true;
             }
          }
      }
       System.out.println(a[i]+"->frequency="+count1);
       System.out.println(a[i]+"->frequency="+count2);
       System.out.println(a[i]+"->frequency="+count3);
       System.out.println(a[i]+"->frequency="+count4);

   }
}