package encapsulationandexception;

class Employee
{
  private int id=5;
	private String name="saniya";
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	
}

public class Encapsulatioprgm {

	public static void main(String[] args) {
           Employee obj=new Employee();
         //System.out.println("value of id "+obj.id);//id is a private variable.
          System.out.println("value of id "+ obj.getId());//to print value
          obj.setId(10);
          System.out.println("value of id after updation :"+obj.getId());//to change value
          System.out.println("value of name "+ obj.getName());
          obj.setName("sandra");
          System.out.println("value of name after updation "+ obj.getName());
	}

}
