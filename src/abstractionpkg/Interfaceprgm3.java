package abstractionpkg;


interface Basicanimal
{
	abstract public void eat();
	abstract public void sleep();
}
class  Monkey
{
	public void jump()
	{
		System.out.println("jump method");	}
	public void  bite()
	{
		System.out.println("bite method");
	}
}
class Human extends Monkey implements Basicanimal
{
	public void speak() {
		System.out.println("speak method");
	}

	@Override
	public void eat() {
		System.out.println("eat method");
	}

	@Override
	public void sleep() {
		System.out.println("sleep method");
		
	}
}

public class Interfaceprgm3 {

	public static void main(String[] args) {
	 Human obj=new Human();
	 obj.jump();
	 obj.bite();
	 obj.eat();
	 obj.sleep();
	 obj.speak();

	}

}
