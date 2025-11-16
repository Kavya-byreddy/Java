//linear search
class main
{
   public static void main(String[]args)
   {
      int a[]=new int[]{10,100,30,40};
      int key=40;
      boolean found=false;
      for(int i=0;i<a.length;i++)
      {
          if(a[i]==key)
         {
            System.out.println("element found");
            found=true;
            break;
         }
      }
     if(!found)
     System.out.println("element not found");
   }
}
//binary search
class main1
{
   public static void main(String[]args)
   {
     int a[]=new int[]{10,20,30,40,50};
     int search=40;
     int low=0,high=a.length-1;
     boolean found=false;
     while(low<=high)
     {
        int mid=(low+high)/2;
        if(a[mid]==search)
        {
            System.out.println("element found at :"+(mid+1));
            found=true;
            break; 
        }
        else if(a[mid]>search)
        {
           high=mid-1;
        }
        else
        {
           low=mid+1;
        }
     }
       if(!found)
        System.out.println("element not found");
   }
}