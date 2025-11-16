class main
{
  public static void main(String[]args)
  {
      Programmer programmer=new Programmer("developer",101,"cyber security","hyd");
      Hr hr=new Hr("testing",100,"java","dlh");
      Tester tester=new Tester("develpoer","wipro","python","hndk");
      System.out.println(programmer.printDatas());
      System.out.println(programmer.getSalary());
      System.out.println(programmer.printData());
      System.out.println(programmer.getBonus());
      System.out.println(hr.printData());
      System.out.println(hr.getStatus());
      System.out.println(tester.printData());
      System.out.println(tester.getErrors());
  
  }
}
class Programmer extends Employee
{
   String role;
   int project_id;
   String technology,location;
   Programmer(String role,int project_id,String technology,String location)
   {
       super("kavya",120,"female","9849");
       this.role=role;
       this.project_id=project_id;

       this.technology=technology;
       this.location=location;
   }
   String printData()
   { 
      return role+" "+project_id+" "+technology+" "+location;
   }
   String getBonus()
   {
       return 10000+" ";
   }
}
class Hr extends Employee
{
   int recruitment;
   String role,projects,location;
   Hr(String role,int recruitment,String projects,String location)
   {
       this.role=role;
       this.recruitment=recruitment;
       this.projects=projects;
       this.location=location;
   }
   String printData()
   { 
      return role+" "+recruitment+" "+projects+" "+location;
   }
   String getStatus()
   {
       return 50000+" ";
   }

}
class Tester extends Employee
{
   String role,technology,location,company;
   Tester(String role,String company,String technology,String location)
   {
       this.role=role;
       this.company=company;
       this.technology=technology;
       this.location=location;
   }
   String printData()
   { 
      return role+" "+company+" "+technology+" "+location;
   }
   String getErrors()
   {
       return 40000+" ";
   }
}
class Employee
{
   int id;
   String name,gender,mobile;
   Employee(String name,int id,String gender,String mobile)
   {
       this.name=name;
       this.id=id;
       this.gender=gender;
       this.mobile=mobile;
   }
   String printDatas()
   { 
      return name+" "+id+" "+gender+" "+mobile;
   }
   String getSalary()
   {
       return 600000+" ";
   } 
   Employee()
   {
   }
}