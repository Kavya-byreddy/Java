class main
{
   public static void main(String[]args)
   {
      int[][]arr=new int[][]{{1,2,3},{2,3},{4,5,6}};
      for(int r=0;r<arr.length;r++)
      {
         for(int c=0;c<arr[r].length;c++)
         {
            System.out.print(arr[r][c]);
         }
         System.out.println();
      }
   }
}