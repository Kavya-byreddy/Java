class main
{
   public static void main(String[]args)
   {
       Programmer programmer=new Programmer(101,"developer","java","hyd");
       System.out.println(programmer.printData());
       System.out.println(programmer.getBonus());
       System.out.println(programmer.getSalary());
   }
}
class Programmer extends Employee
{
   int project_id;
   String role,technology,location;
   Programmer(int project_id,String role,String technology,String location)
   {
      super(11,"kavya","female","9849");
         this.project_id=project_id;this.role=role;this.technology=technology;this.location=location;
   }
   String printData()
   {
      return role+" "+project_id+" "+technology+" "+location+" "+super.id+" "+super.name+" "+super.gender+" "+super.mobile+" ";
   }
   String getBonus()
   {
      return 10000+" ";
   }
}
class Employee
{
   int id;
   String name,gender,mobile;
   Employee(int id,String name,String gender,String mobile)
   {
      this.id=id;this.name=name;this.gender=gender;this.mobile=mobile;
   }
     String getSalary()
   {
      return 50000+" ";
   }
}