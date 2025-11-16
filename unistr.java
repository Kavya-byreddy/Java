//unique character
import java.util.Arrays;
class main
{
    public static void main(String[]args)
    {
       String s="hi all good morning";
       char[]c=s.toCharArray();
       boolean[]b=new boolean[c.length];
       int i;
       for(i=0;i<c.length;i++)
       {
           if(b[i]==true||c[i]==' ')
           {
              continue;
           }
          int count=1;
         for(int j=i+1;j<c.length;j++)
         {
            if(c[i]==c[j])
            {
               count++;
               b[j]=true;
            }
         }
          if(count==1)
          System.out.println(c[i]);
       }
    }
}
