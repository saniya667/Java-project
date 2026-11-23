package scannerPackage;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int a,b;
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two values");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter any operation");
		char x=sc.next().charAt(0);
		switch(x)
		   {
		   case '+' : System.out.println(a+b);
		   break;
		   
		   case  '-' :System.out.println(a-b);
		   break;
		     
		   case '*' :System.out.println(a*b);
		   break;
		   
		   case '/' :System.out.println(a/b);
		   break;
		   
		   default:System.out.println("Error");
	}
	}

}
