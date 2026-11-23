package encapsulationandexception;

public class Exceptionprgm {

	public static void main(String[] args) {
		try//line of code which may have error
		{
		int a=10;
		int b=0;
		double c=a/b;
		System.out.println("value after division "+c);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		System.out.println("hai");//it will only executed when the above calculation success
	}

}
