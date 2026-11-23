package javapackage;

public class Taskprogram {

	public static void main(String[] args) {
		int a=20;
		  int b=30;
		  System.out.println("a="+a);
		  System.out.println("b="+b);
		  a=a+b;
		  b=a-b;
		  a=a-b;
		  System.out.println("variables after swap");
		  System.out.println("a="+a);
		  System.out.println("b="+b);
		  System.out.println();
		 
		  System.out.println("To check two numbers are equal");
         int c=23;
         int d=45;
         System.out.println("c="+c);
         System.out.println("d="+d);
         System.out.println(c==d);
         
         System.out.println();
         System.out.println("To check two conditions are true");
         int a1=55;
         int b1=70;
         System.out.println("a1="+a1);
         System.out.println("b1="+b1);
         System.out.println(a1<50&&a1<b1);
         System.out.println();
         int a2=17;
         System.out.println("a2="+a2);
         int secondDigit=a2 % 10;
         System.out.println("secondDigit="+secondDigit);
         
      
         

	}

}
