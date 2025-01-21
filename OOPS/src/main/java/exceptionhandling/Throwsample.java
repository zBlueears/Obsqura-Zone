package exceptionhandling;

public class Throwsample
{
	public static void sum(int a, int b)
	{
		int sum=a+b;
		if(sum<50)
		{
			throw new ArithmeticException("Exception occured");
		}
		else
		{
			System.out.println("Sum is greater than 50");
		}
	}
	public static void main(String[] args)
	{
		try
		{
			Throwsample.sum(25, 10);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Sum out of bounds: "+e);
		}
		System.out.println("Rest of the code");		
	}

}
