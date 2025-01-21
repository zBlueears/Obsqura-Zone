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
		/*catch(ArithmeticException e)
		{
			System.out.println("The statement has Exception "+e);
		}*/
		finally
		{
			System.out.println("finally block is always excecuted");
		}
		System.out.println("Sum :"+s);		
	}

}
