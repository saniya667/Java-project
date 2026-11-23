package stringpackage;

public class Areashapes {

	public static void main(String[] args) 
	{
		Areashapes obj=new Areashapes();
		obj.Triangle();
		obj.circle(3.14,4);
		int result=obj.rectangle();
		System.out.println("area of rectangle is :"+ result);
		int area=obj.square(5);
		System.out.println("area of square is :" +area);
		
		
		
	}
	  
	public  void Triangle()
	  {
		double b=20;
		  double  h=3;
		  System.out.println("Area of triangle is :" +(0.5*b*h));
		  
	  }
	public void circle(double a,double r)
	{
		System.out.println("area of circle is :"+(a*r*r));
	}
	
	public int rectangle()
	{
		int l=4;
		int j=3;
		return l*j;
	}
	public int square(int a)
	{
		return a*a;
	}
}
