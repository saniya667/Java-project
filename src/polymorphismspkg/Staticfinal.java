package polymorphismspkg;


public class Staticfinal {
	int a=5;
	static String company="luminar";
	final  double pi=3.14;
	static final double pivalue=3.14;
	public static void main(String[] args) 
	{
		Staticfinal obj = new Staticfinal();
		
		System.out.println(obj.a);
		
		System.out.println("value of company :"+company);//company  is a static variable we can call it without the help of an object
	      company="luminar technolab";
	      System.out.println("updated value of company :"+company);//static variable value can be updated
	      System.out.println("value of pi "+obj.pi);
	      //obj.pi=4.15;//cannot be modified
	      System.out.println("value of pi value:"+pivalue);
	      
	     }

}
