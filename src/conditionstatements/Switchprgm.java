package conditionstatements;

public class Switchprgm
{

	public static void main(String[] args)
	{
	   int n=2;
	   
	   switch(n)//we can also use string values
	   {
	   case 1 : System.out.println("sunday");
	   break;//To exit after executing the case.
	   
	   case  2 :System.out.println("monday");
	   break;
	     
	   case 3 :System.out.println("tuesday");
	   break;
	   
	   case 4 :System.out.println("wednesday");
	   break;
	   
	   case 5 :System.out.println("thursday");
	   break;
	   
	   case 6 :System.out.println("friday");
	   break;
	   
	   case 7 :System.out.println("saturday");
	   break;
	   
	   default:System.out.println("Invalid choice");   
	   }

	}

}

     

//char e='+';
//switch(e)
//{
//case '+':
//}






