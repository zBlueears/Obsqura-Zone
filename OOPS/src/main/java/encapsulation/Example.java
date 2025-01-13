package encapsulation;

public class Example 
{
	private int age;
	private String name;
	
	public void setdetail(int age, String name)
	{
		this.age= age;
		this.name=name;
		
	}
	public void getdetail()
	{
		
		System.out.println("name: "+ name);
		System.out.println("Age :"+age);
	}

}
