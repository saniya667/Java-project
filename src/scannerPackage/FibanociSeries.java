package scannerPackage;

import java.util.Scanner;

public class FibanociSeries {

	public static void main(String[] args) 
	{
	   int n;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the limit");
	   n=sc.nextInt();
	   int a=0;
	   int b=1;
	   int c;
	   System.out.println(a);
	   System.out.println(b);
	   for(int i=2;i<=n;i++)
	   {
		   c=a+b;
		   System.out.println(c);
		   a=b;
		   b=c;
	   }

	}

}
