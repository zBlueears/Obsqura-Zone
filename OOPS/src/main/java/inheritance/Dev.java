package inheritance;

public class Dev extends Employee
{
	String d="Developer";
	public void role()
	{
		System.out.println("The position of this role is "+ d);
	}
	public static void main(String args[])
	{
		Dev dev= new Dev();
		dev.details();
		dev.role();
	}

}
