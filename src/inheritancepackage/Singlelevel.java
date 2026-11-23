package inheritancepackage;

class Parent//parent class
{
	int a=5;
	public void parentmethod()
	{
		System.out.println("parentmethod");
	}
}
class child extends Parent //child class.which inherit the properties of class parent
{
	public void childmethod()
	{
		System.out.println("childmethod");
	}
}
public class Singlelevel {

	public static void main(String[] args)
	{
		child obj=new child();
		System.out.println("value of a "+obj.a);//calling parent class variable using child object
		obj.parentmethod();//calling parent class method
		obj.childmethod();
	 }

}
