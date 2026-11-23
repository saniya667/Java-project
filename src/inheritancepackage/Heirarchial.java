package inheritancepackage;

class mobile
{
	public void mobilemethod()
	{
		System.out.println("mobile class method");
		
	}
}
class samsung extends mobile//inherit from class mobile
{
	public void samsungmethod()
	{
		System.out.println("samsung method");
	}
}
class iphone extends mobile//inherit from  class mobile
{
	public void iphonemthod()
	{
		

	System.out.println("Iphone method");
	}
}

public class Heirarchial {

	public static void main(String[] args) {
	samsung obj=new samsung();
	obj.mobilemethod();
	obj.samsungmethod();
	
	iphone obj1=new iphone();
	obj1.iphonemthod();
	obj1.mobilemethod();

	}

}
