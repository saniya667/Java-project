package stringpackage;

import java.util.Scanner;

public class Reverseprgm {

	public static void main(String[] args) 
	{
	//check whether the word "morning is present or not
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		String  s1=sc.nextLine();
		System.out.println(s1.contains("morning"));
		String s2="java is simple elegent";
		String result[]=s2.split(" ");
		for(String v:result)
		{
			System.out.println(v);
		}
		System.out.println(result.length);
		int index=result.length-1;//to find the last indext position
		index=result.length-1;
		System.out.println("reversed sentence is");
	for(int i=index;i>=0;i--)
	{
		System.out.print(result[i]+" ");
	}

}	
}