package polymorphismspkg;

public class Practiceoverload {

	
		public void square(int a)
		{
			System.out.println("area of square :"+ (a*a));
			
		}
		
		public void rectangle(int a , int b)
		{
			System.out.println("area of rectangle :"+ (a*b));
			
		}
		
		public void triangle(double a ,int b,int h)
		{
			System.out.println("area of triangle :"+ (a*b*h));
			
		}
		
		public static void main(String[] args)
		{
			Practiceoverload obj = new Practiceoverload();
			obj.square(4);
			obj.rectangle(5, 4);
			obj.triangle(0.5, 4, 2);
	}

}
