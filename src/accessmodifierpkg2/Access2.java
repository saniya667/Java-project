package accessmodifierpkg2;

import accessmodifierpkg.Accessmodifierprgm;

public class Access2 extends Accessmodifierprgm //access2 is the child class of accesmodifierprgm
{

	public static void main(String[] args) {
		Access2 obj=new Access2();
		//System.out.println("private variable :"+obj.a);
		//System.out.println("default variable :"+obj.b);
		System.out.println("protected variable :"+obj.c);
		System.out.println("public variable :"+obj.d);
		

	}

}

