//how many numbers,symbols,spaces,uppercase,loercase are there in the given array
class main
{
   public static void main(String []args)
   {
       char[]ch=new char[]{'X','^','9','y','T','@'};
       int upper=0,lower=0,num=0,sym=0,spaces=0;
       for(int i=0;i<=ch.length-1;i++)
       {
       if(ch[i]>='A' && ch[i]<='Z')
       upper++;
       else if(ch[i]>='a' && ch[i]<='z')
       lower++;
       else if(ch[i]>='0' && ch[i]<='9')
       num++;
       else if(ch[i]==' ')
       spaces++;
       else
       sym++;
       }
          System.out.println("upper"+"="+upper); 
          System.out.println("lower"+"="+lower);
          System.out.println("num"+"="+num);
          System.out.println("spaces"+"="+spaces);
          System.out.println("sym"+"="+sym);
   }
}
//print first,last and middle array in given array
class main1
{
   public static void main(String []args)
   {
       char[]ch=new char[]{'X','^','9','y','T','@','a'};
       for(int i=ch.length-1;i>=0;i--)
       System.out.println(ch[i]);
   }
}
//how many vowels cons are there in the given array
class main2
{
   public static void main(String []args)
   {
      char ch[]=new char[]{'a','e','b','A','S'};
      int vowel=0,cons=0;
      for(int i=0;i<=ch.length-1;i++)
      {
         if(ch[i]=='a' ||ch[i]=='e' ||ch[i]=='i' ||ch[i]=='o' ||ch[i]=='u' ||ch[i]=='A' ||ch[i]=='E' ||ch[i]=='I' ||ch[i]=='O' ||ch[i]=='U')
       vowel++;
         else
         cons++;
      }
          System.out.println(vowel+" "+cons);
   }
}