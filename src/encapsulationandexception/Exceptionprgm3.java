package encapsulationandexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionprgm3
{

	public static void main(String[] args) throws FileNotFoundException //used to handle compile time exception
	{
		try
	  {
		FileInputStream v= new FileInputStream("c://downloads//file.png");
	   } 
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
//	finally
//	{
//		System.out.println("thats it");
//	}
	}

}
