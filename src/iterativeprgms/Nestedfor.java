package iterativeprgms;

public class Nestedfor {

	public static void main(String[] args)
	{
		//****
		//****
		//****
		//rows=3
		//column=4
		//3*4 matrix
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print("*");
			}
			System.out.println();//return back to inner loop j++
		}//return back to outer loop i++

	}

}
