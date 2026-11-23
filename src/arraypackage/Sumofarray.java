package arraypackage;

import java.util.Scanner;

public class Sumofarray {

	public static void main(String[] args) {
		int []a=new int [5];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers");
		for(int i=0;i<5;i++)
		{
			
			a[i]=sc.nextInt();
			
			
		}
	
		for(int v:a)
		{
			System.out.println(v);
		}
		for(int i=0;i<5;i++)
		{
			
			sum=sum+a[i];
		}
		System.out.println();
		System.out.println("sum="+sum);
			
	

	}

}
