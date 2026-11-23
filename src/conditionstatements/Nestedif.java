package conditionstatements;

public class Nestedif {

	public static void main(String[] args) 
	  {
		int age=10,weight=69;
		if(age>=18)
		{
			if(weight>50)
			{
				System.out.println(" you are eligible for blood donation");//execute when both conditions are true
		     }
			else
			{
				System.out.println("you are in underweight category");//execute when second condition is false			
			}

	   }
		else
		{
			System.out.println("Not eligible");
		}
     }

}
