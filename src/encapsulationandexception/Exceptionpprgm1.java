package encapsulationandexception;

public class Exceptionpprgm1 {

	public static void main(String[] args) 
	{
		try
		{
       int n=5;
       int v=n/0;
       System.out.println(v);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
