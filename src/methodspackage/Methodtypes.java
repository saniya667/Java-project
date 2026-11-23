package methodspackage;

public class Methodtypes {

	public static void main(String[] args) 
	{
		 Methodtypes obj=new  Methodtypes();
		int result= obj.add(2, 5);//calling the method addThe result of the method is stored in the variable 'result'
		//we get value for the variable when we call the method
		System.out.println("Addition:"+result);
		
		 obj.sub();//calling method sub
		 
		 obj.multi(5, 2);//calling method mutli and passing parameters
		 
		// System.out.println(obj.div());
		 int value=obj.div();
		 System.out.println("division "+value);
	}
	//methods
	
	//methods with parameter and return type
	public int add(int a,int b)
	{
		return a+b;//The value will be returned to the main method 
	}
	
	//method without  parameter without return type
	int x=10,y=2;
	public void sub()
	{
		System.out.println("substraction" +(x-y)); 
	}
	//methods with parameters and without return type
	public void  multi(int a,int b)
	{
		System.out.println("multiplication :"+(a*b));
	}
	//method without parameter and with return type
	public int div()
	{
		return x/y;
	}
}
