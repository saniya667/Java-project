package accessmodifierpkg;

public class Accessmodifierprgm 
{
	
	private int a=10;//private variable
	int b=4;//default variable
	protected int c=7;//protected variable
	public int d=9;//public variable
	
	public static void main(String[] args) 
	{
		Accessmodifierprgm obj=new Accessmodifierprgm();
		System.out.println("private variable :"+obj.a);
		System.out.println("default variable :"+obj.b);
		System.out.println("protected variable :"+obj.c);
		System.out.println("public variable :"+obj.d);
		

	}

}
