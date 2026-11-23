package polymorphismspkg;


class Parent
{
	public void qualification()
	{
		System.out.println("BCA");
	}
}


class Child extends Parent
{
     //rightclick-source-override or implement methods
	
	@Override
	public void qualification() {
	
		System.out.println("Btech");
		super.qualification();//calling immediate parent class method
	}
	
}

public class Overriding {

	public static void main(String[] args) 
	{
		Child obj= new Child();
		obj.qualification();
		
	
		//Parent obj1=new Parent();
		//obj1.qualification();

	}

}
