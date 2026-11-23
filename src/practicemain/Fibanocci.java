package practicemain;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		System.out.println("Enter limit");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		for(int i=2;i<=n;i++)
		{
			c=a+b;
			System.out.println(c);
		     a=b;
		     b=c;
		    		
		}
		
		

	}

}
