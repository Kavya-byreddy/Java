//anagram or not
import java.util.Arrays;
class main
{
   public static void main(String[]args)
   {
       int[]a=new int[]{10,20,40,50,90};
       int[]b=new int[]{20,40,50,10,90,100};
       if(a.length!=b.length)
       {
          System.out.println("not anagram");
          return;
       }
       Arrays.sort(a);
       Arrays.sort(b);
         if(Arrays.equals(a,b))
           System.out.println("the arrays are in anagram");
         else
           System.out.println("the arrays are not in anagram");
   }
}
