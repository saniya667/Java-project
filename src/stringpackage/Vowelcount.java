package stringpackage;

import java.util.Scanner;

public class Vowelcount {

	public static void main(String[] args) 
	{
		System.out.println("Enter a word");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char c[]=s.toCharArray();
		int vowelcount=0;
		for(char temp : c)
		{
			if(temp=='a' || temp=='e' || temp=='i' || temp=='o' ||temp=='u')
			{
				vowelcount++;
			}
		}
		System.out.println("vowelcount="+vowelcount);
	}

}
