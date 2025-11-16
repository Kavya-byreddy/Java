class Student
{
     public static void main(String []args)
     {  
         int roll = 10; 
         String name = "kavya";
         String email = "kavya@gmail.com";
         int m1=10,m2=20,m3=30,m4=40,m5=50;
         double total_marks=m1+m2+m3+m4+m5;
         double donation=0,scholarship=0;
         double fee = 35000;
         double max_marks = 200.0;
         double percentage =total_marks/max_marks*100;
	 String section="";
         if(percentage>80)
         {
             donation=(5.0/100*fee);
             scholarship=(23.5/100*fee);
             section="first";
             System.out.println("percentage is more than 80");             
         }
         else
         {
            donation=(23.5/100*fee);
            scholarship=(5.0/100*fee);
            section="second";
            System.out.println("percentage is less than 80");
         }
         double t_fee = fee + donation;
         double fees = t_fee-scholarship;
         double gst = (9.0/100*t_fee);
         double total_fee =fees+gst;
         System.out.println("roll number = "+roll+"\n"+
                            "name = "+name+"\n"+
                            "percentage = "+percentage+"\n"+
                            "email = "+email+"\n"+
                            "total marks = "+total_marks+"\n"+
                            "donation = "+donation+"\n"+
                            "scholarship = "+scholarship+"\n"+
                            "section = "+section+"\n"+
                            "t fee = "+t_fee+"\n"+
                            "fees = "+fees+"\n"+
                            "gst = "+gst+"\n"+
                            "total fee = "+total_fee);
     }
}