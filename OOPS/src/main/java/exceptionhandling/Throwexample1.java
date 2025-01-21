package exceptionhandling;

import java.io.IOException;

public class Throwexample1 
{
	public static void test(String n) throws IOException
	{
		throw new IOException("IOException");
	}
	public static void main(String[] args) throws IOException
	{
		Throwexample1.test("Hi");
	}

}
