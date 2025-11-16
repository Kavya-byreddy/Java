import java.util.Arrays;
class struniq
{
   public static void main(String[]args)
   {
      String s="hello";
      for(int x=0;x<s.length();x++)
      {
         char ch=s.charAt(x);
         if(s.indexOf(ch)==s.lastIndexOf(ch))
         System.out.println(ch);
      }
   }
}