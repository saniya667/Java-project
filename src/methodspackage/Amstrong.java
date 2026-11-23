package methodspackage;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int original = num;
		int sum=0;
		while(num>0)
		{
			int digit=num%10;
			sum=sum+(digit*digit*digit);
					num=num/10;
		}
		if (sum==original)
		{
			System.out.println(original+"is an amstrong number");
		}
		else
		{
			System.out.println(original+"is not an amstrong number");
			
		}

	}

}
