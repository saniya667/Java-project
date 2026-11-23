package iterativeprgms;

public class Breakcontinue {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				//break;//To terminate the execution.
				continue;//skipping the value mentioned in the condition
			}
			System.out.println(i);
		}
	}

}
