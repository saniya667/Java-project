package abstractionpkg;


abstract class Parent//abstract class
{
	abstract public void display();//abstract method//method without implementation
	public void normalmethod()//its a normal method with implementation
	{
		System.out.println("normal method");
	}
}
class Child extends Parent
{

	@Override
	public void display()//overriding abstract method
	{
		System.out.println("Abstract method");
	}
	


public class Abstractionprgm
{

	public static void main(String[] args)
	{
		Child obj=new Child();
		obj.display();//calling abstract method using child class object
		obj.normalmethod();

	}
}
}