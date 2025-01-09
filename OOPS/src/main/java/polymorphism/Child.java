package polymorphism;

public class Child extends Parent 
{
	public void print(String n)
	{
		super.print("Hello World");
		System.out.println("Child class method");
		System.out.println(n);
	}

	public static void main(String[] args) 
	{
		Child c= new Child();
		c.print("The end");

	}

}
