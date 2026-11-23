package scannerPackage;

import java.util.Scanner;

public class Factorialprgm {

	public static void main(String[] args)
	{
		int a=1;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			a=a*i;
		}
		System.out.println(a);

	}

}
