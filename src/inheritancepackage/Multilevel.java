package inheritancepackage;

class animal//parent class
{
	int a=5;
	public void animalmethod()
	{
		System.out.println("animal class method");
	}
}
class Dog extends animal//class dog extends from class animal
{
	public void dogmethod()
	{
		System.out.println("dog class method");
	}
}
class puppy extends Dog//child class of dog
{
	public void puppymethod()
	{
		System.out.println("puppy class method");
	}
}

public class Multilevel 
{
  public static void main(String[] args) 
	{
		puppy obj = new puppy();
		System.out.println("value of a :"+obj.a);//calling parent class variable using child class object 
		obj.animalmethod();//calling parent class(animal) variable using child class object 
		obj.dogmethod();//calling parent class(dog method variable using child class object 
		obj.puppymethod();//calling child class method variable using child class object 
	}

}
