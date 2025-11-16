class sample16
{
   public static void main(String []args)
   {
       int num=342000,rev=0,count=0,rem=0,rem1=0,temp=num;
        while(temp!=0){
          temp/=10;
          ++count;
        }
        while(num!=0) 
        {
            rem=num%10;
            rev=rev*10+rem;
            num/=10;
            ++count;
        }
        
        int count1=0;
        while(rev!=0)
        {
            rem=rev%10;
            rev/=10;
            ++count1;
            int cnt=count-count1;
            
            switch(rem)
            {
                case 1:System.out.println("one");
                break;
                case 2:System.out.println("two");
                break;
                case 3:System.out.println("three");
                break;
                case 4:System.out.println("four");
                break;
                case 5:System.out.println("five");
                break;
                default:System.out.println("zero");
            }
       }
   }
}
