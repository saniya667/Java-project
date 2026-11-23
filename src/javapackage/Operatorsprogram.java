package javapackage;

public class Operatorsprogram {

	public static void main(String[] args) {
	  System.out.println("Arithemetic operators");
	  int a=5;
	  int b=3;
	  System.out.println(a+b);
	  System.out.println(a-b);
	  System.out.println(a*b);
	  System.out.println(a/b);//a/b=1 it is quotient
	  System.out.println(a%b);//a%b=2 it is reminder
	  System.out.println();
	  System.out.println("Assignment operators");
	  //a=b;//The value of b assigned to variable a.(left assign)
	  System.out.println(a+=b);//a=a+b; a=5+3=8
	  System.out.println(a-=b);// a=a-b; a=8-3=5 the updated value of a=5;
	  
	  System.out.println();
	  System.out.println("a="+a);
	  System.out.println("b="+b);
	  System.out.println("Relational operators");
	  System.out.println(a==b);// false-The result will be in boolean datatype.
	  System.out.println(a>b);
	  System.out.println(a<b);
	  System.out.println(a<=b);
	  System.out.println(a>=b);
	  System.out.println(a!=b);
	  System.out.println();
	  System.out.println("Logical opertors");
	  String username="abc";
	  String password="1234";
	  //And(&&)-verify whether both conditions are true
	  System.out.println(username=="xyz"&& password=="789");//abc==xyz && 1234==789-conditon one and two is false so result will be false.
	  System.out.println(username=="abc"&& password=="1234");
	  System.out.println();
	  
	  System.out.println("OR operators");//it returns true when atleast one condition become true
	  System.out.println(username=="abc"||password=="789");//one of the condition is true
	  System.out.println(username=="xyz"||password=="789");
	  
	  System.out.println();
	  System.out.println("result of not operator");
	  System.out.println(!(username=="unc"));//condition is true
	  System.out.println();
	  System.out.println("unary operators");//++(value incremented by one)--(value decremented by one);
	  System.out.println("postincrement");
	  //post increment/decrement i++,i-- The value will be updated after printing
	  int i=1;
	  System.out.println("The value of i="+i);
	  System.out.println("The value of i++="+i++);//Value will be updated after this line.
	  System.out.println("The updated value of i="+i);
	  System.out.println();
	  
	  //preincrement/decrement ++i,--ii//value will be updated before printing the value.
	  System.out.println("preincrement");
	  System.out.println("The value of i="+i);
	//  System.out.println("The value of i after ++i="+(++i));
	  System.out.println(++i);//The value of i incremented by one then the value will be displayed
	    
	  System.out.println();
	  
	  
	  
	  
	  
	  
	  

	}

}
