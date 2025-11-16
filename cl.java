class main
{
   public static void main(String[]args)
   {
      int f=0,s=1,t;
      for(int x=1;x<10;x++)
      {
      t=f+s;
      f=s;
      s=t;
      }
     System.out.println(f);
   }
}