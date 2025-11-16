//array as return type /parameter
class main
{
    public static void main(String []arts)
    {
      Sample sample=new Sample(); 
      int result=sample.add(10,20);
      System.out.println(result);
      int []a=new int[]{10,20,30,40,50};
      int[]c=sample.square(a);
      for(int temp:c)
        System.out.println(temp);
      int add=sample.sum(c);
        System.out.println(add);
    }
}
class Sample
{
   int add(int n1,int n2)
   {
       return n1+n2;
   }
   int[]square(int []b)
   {
        for(int x=0;x<b.length;x++)
        b[x]=b[x]*b[x];
        return b;
   }
   int sum(int[]c)
   {
      int sum=0;
      for(int temp1:c)
           sum+=temp1;
            return sum;
   }
}
