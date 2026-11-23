package inheritancepackage;

class Member
{
	int age;
	String name;
	int salary;
	public void printdetails()
	{
		System.out.println("name :"+name);
		System.out.println("age :"+age);
		System.out.println("salary :"+salary);
	}
}
class Employee extends Member
{
	String specification;
	public void emp()
	{
		//printdetils();
		System.out.println("specification :"+specification);
	}
	
	
}
class Manager extends Member
{
	String department;
	public void manage()
	{
		//printdetails();
	  System.out.println("department :"+department);
	}
}

public class Practiceinheritance {

	public static void main(String[] args)
	{
		Employee e=new Employee();
		e.name="vyga";
		e.age=35;
		e.salary=40000;
		e.specification="HR";
		System.out.println("Employee details");
		e.printdetails();
		e.emp();
		System.out.println();
		Manager obj = new Manager();
		obj.name="swetha";
		obj.age=20;
		obj.salary=35000;
		obj.department="QA";
		System.out.println("manager details");
		obj.printdetails();
		obj.manage();
		
			
	}

}
