class main
{
    public static void main(String[]args)
    {
       Developer developer=new Developer(10,"tester","cybr","hyd");
        System.out.println(developer.printPer());
       System.out.println(developer.getExpenses());
       System.out.println(developer.printEmp());
       System.out.println(developer.getSalary());
       System.out.println(developer.printDev());
       System.out.println(developer.getBonus());
    }
}
class Developer extends Employee
{
   int project_id;
   String role,technology,location;
   Developer(int project_id,String role,String technology,String location)
   {
      super(120,"sravya","female","9110");    this.project_id=project_id;this.role=role;this.technology=technology;this.location=location;
   }
   String printDev()
   {
      return project_id+" "+role+" "+technology+" "+location;
   }
   String getBonus()
   {
      return 20000+" ";
   }
}
class Employee extends Person
{
   int id;
   String name,gender,mobile;
   Employee(int id,String name,String gender,String mobile)
   {
      super(101,"kavya","subhaskar","challur");
      this.id=id;this.name=name;this.gender=gender;this.mobile=mobile;
   }
   String printEmp()
   {
      return id+" "+name+" "+gender+" "+mobile;
   }
   String getSalary()
   {
      return 400000+" ";
   }
}
class Person
{
   int id;
   String name,sonof,address;
   Person(int id,String name,String sonof,String address)
   {
      this.id=id;this.name=name;this.sonof=sonof;this.address=address;
   }
   String printPer()
   {
      return id+" "+name+" "+sonof+" "+address;
   }
   String getExpenses()
   {
      return 10000+" ";
   }
}