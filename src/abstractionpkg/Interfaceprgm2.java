package abstractionpkg;

interface Tvremote
{
	abstract public void poweron();
	abstract public void poweroff();
}
interface SmartTv extends Tvremote //inherit one interface to another using keyword extends
{
	abstract public void display();
}
class Samsung  implements SmartTv//smartTv has already inherited the properties of Tvremote
{

@Override
public void display() 
   {
	System.out.println("Display method");
	
     }

@Override
public void poweron() 
   {
	System.out.println("poweron method");
	
   }

@Override
public void poweroff()
    {
	System.out.println("poweroff method");
	
    }
}


public class Interfaceprgm2
{

	public static void main(String[] args) {
		Samsung obj=new Samsung();
		obj.display();
		obj.poweron();
		obj.poweroff();

	}
}


