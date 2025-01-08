package inheritance;

public class Tester extends Employee
{
	String t="Tester";
	public void pos()
	{
		System.out.println("The position of this role is "+ t);
	}
	public static void main(String args[])
	{
		Tester tester = new Tester();
		tester.details();
		tester.pos();
	}
	
}
