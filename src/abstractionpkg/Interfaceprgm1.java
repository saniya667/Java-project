package abstractionpkg;

interface  Bike {
	abstract public void speedlimit();
	public void accelarate();
}

class Honda implements Bike
{
	@Override
	public void speedlimit()
	{
		System.out.println("Honda speed limit");
		}
	@Override
	public void accelarate()
	{
		System.out.println("Honda acceleration");
	}
	
}

public class Interfaceprgm1
{
	public static void main(String[] args)
	{
		Honda ob=new Honda();
		ob.speedlimit();
		ob.accelarate();
		
		Bike obj=new Honda();//created interface reference
		obj.speedlimit();
		obj.accelarate();
		//we cannot call class method using interface reference.only interface methods can be call
	}
}



	
	
	
	
	
	
	
	
	
	

