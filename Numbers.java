class Numbers
{
           public static void main(String []args)
            {
              int box1=14,box2=25;
              System.out.println("before swapping"+" "+box1+" "+box2);
              box1=box1+box2;
              box2=box1-box2;
              box1=box1-box2;   
              System.out.println("after swapping"+" "+box1+" "+box2);
            }
}