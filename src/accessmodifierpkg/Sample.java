package accessmodifierpkg;

public class Sample {

	public static void main(String[] args) {
		Accessmodifierprgm obj=new Accessmodifierprgm();//variables are already declared in the accessmodifier class thats why we create object for that class
		//System.out.println("private variable :"+obj.a);//a is a private variable.so it cannot access outside its class.
		System.out.println("default variable :"+obj.b);
		System.out.println("protected variable :"+obj.c);
		System.out.println("public variable :"+obj.d);

	}

}
