package exceptionhandling;

public class Test
{
	public void check(int age) throws LicenseException
	{
		if(age<18)
		{
			throw new LicenseException("not eligible for license");
		}
	}
	public static void main(String[] args) 
	{
		Test t= new Test();
		try
		{
			t.check(17);
		}
		catch(LicenseException e)
		{
			System.out.println(e);
		}		
	}

}
