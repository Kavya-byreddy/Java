class
{
  public static void main(String []args)
  {
     char ch='2';
     if(ch>='a' && ch<='z')
     System.out.println("lower");
     else if(ch>='A' && ch<='Z')
     System.out.println("upper");
     else if(ch>='0' && ch<='9')
     System.out.println("number");
     else if(ch>=' ')
     System.out.println("lower");
     else
     System.out.println("symbol");
   }
}