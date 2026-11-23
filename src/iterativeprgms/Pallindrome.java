package iterativeprgms;

import java.util.Scanner;


public class Pallindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number") ;
	    
	    int a=sc.nextInt();
	    System.out.println("value of a="+a);
	    int rem;
	    int rev=0;
	    int c=a;
	    
	    while(a>0)
	    {
	    	 rem=a%10;//123%10=3 12%10=2 1%10=1
	    	 rev=(rev*10)+rem;//0*10+3=3 3*10+2=32 32*10+1=321
		    
		      a=a/10;//123/10=12
		  }
	    System.out.println("The reversed value is "+rev);
	    if(c==rev)
	    {
	    	System.out.println("The number is pallindrome");
	    }
	    else
	    {
	    	System.out.println("The number is not pallindrome");
	    }
	    

       }
	}
