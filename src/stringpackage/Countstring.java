package stringpackage;

import java.util.Scanner;

public class Countstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
    	String name=sc.nextLine();
    	String[]words=name.split(" ");
		
		System.out.println("count of name is "+words.length);
		
	}

	}

