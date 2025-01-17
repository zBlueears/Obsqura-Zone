package exceptionhandling;

public class Sample
{
	public static void main(String[] args)
	{
		int a=20,b=20;
		int s=a+b;
		try 
		{
			int result = 5/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("The statement has Exception "+e);
		}
		System.out.println("Sum :"+s);		
	}

}
