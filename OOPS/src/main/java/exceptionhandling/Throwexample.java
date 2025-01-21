package exceptionhandling;

public class Throwexample 
{
	public static void test(String n) throws StringIndexOutOfBoundsException
	{
		throw new StringIndexOutOfBoundsException(n.charAt(4));
	}
	public static void main(String[] args) 
	{
		try
		{
			Throwexample.test("hi");
		}
		catch(StringIndexOutOfBoundsException s) 
		{
			System.out.println("String out of bounds "+s);			
		}
		System.out.println("Rest of the code");
		
	}

}
