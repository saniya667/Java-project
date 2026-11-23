package arraypackage;

import java.util.Scanner;

public class TwoDiaarray {

	public static void main(String[] args)
	{
         //2x3 matrix
		//2 rows and 3 columns
		int [][]b=new int[2][3];
		Scanner sc=new Scanner(System.in);
//		b[0][0]=5;
//		b[0][1]=2;
//		b[0][2]=6;
//		b[1][0]=3;
		System.out.println("Enter the values");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("The values are:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
			    System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
