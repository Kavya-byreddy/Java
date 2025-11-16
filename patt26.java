class main
{
   public static void main(String []args)
   {
     int rows=5;  
     for(int r=1;r<=rows;r++)
     {
        for(int c=1;c<=r;c++)
        {
            System.out.print("*");
        }
        System.out.println();
     }
   }
}
class main1
{
   public static void main(String []args)
   {
     int rows=5;  
     for(int r=1;r<=rows;r++)
     {
        for(int c=r;c<=rows;c++)
        {
            System.out.print("*");
        }
        System.out.println();
     }
   }
}
class main2
{
   public static void main(String []args)
   {
     int rows=4,cols=4;
     for(int r=1;r<=rows;r++)
     {
        int temp=r;
        for(int c=1;c<=cols;c++)
        {
            System.out.print(temp);
            temp++;
         }
        System.out.println();
     }
   }
}
class main3
{
   public static void main(String []args)

   {
     int rows=4,cols=4;
     for(int r=1;r<=rows;r++)
     {
       char upper='A;
        for(int c=1;c<=cols;c++)
        {
            System.out.print((char)(upper+c));
         }
        System.out.println();
     }
   }
}