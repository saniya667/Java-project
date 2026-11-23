package constructorpackage;

public class Parameterizedcnstr {
	int age;
	String name;
	//accessmodifier classname(parameters){}//syntax for parameterized constructor
	public Parameterizedcnstr(int age,String name)
	
	{
		this.age=age;//this refer the instance variable
		this.name=name;
	}
    public void display()//normal method
    {
    	System.out.println(age);
    	System.out.println(name);
    }
	public static void main(String[] args) {
		
		Parameterizedcnstr obj=new Parameterizedcnstr(10,"john");//calling to parameterized constructor and the will be assigned to instance variable
		obj.display();
	}

}
