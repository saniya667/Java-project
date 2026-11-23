package practicearray;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		int []a=new int[3];
		int b=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers into array");
		for(int i=0;i<3;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]>b)
			{
				b=a[i];
		}
	}
        System.out.println("Largest number="+b);
	}

}

