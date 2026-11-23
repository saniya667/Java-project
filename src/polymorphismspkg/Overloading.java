package polymorphismspkg;

public class Overloading {
	
	
	public void add(int a , int b)
	{
		System.out.println("method1 :"+ (a+b));
		
	}
	
	public void add(int a , int b, int c)
	{
		System.out.println("method2 :"+ (a+b+c));
		
	}
	
	public void add(int a , double b)
	{
		System.out.println("method3 :"+ (a+b));
		
	}
	public void add(double a, int b)
	{
		System.out.println("method4 :"+ (a+b));
		
		
	}
	
	public static void main(String[] args)
	{
		Overloading obj=new Overloading();
		obj.add(2,3,4);//method2
		obj.add(4.5, 6);//method 4
		obj.add(3, 2.2);//method 3
		obj.add(2,4);
	}

}
