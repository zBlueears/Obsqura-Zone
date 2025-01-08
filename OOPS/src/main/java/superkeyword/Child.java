package superkeyword;

public class Child extends Parent
{
	String color="white";
	public Child(String x)
	{
		super("Maven");
		System.out.println("Child constructor");
		System.out.println("The string in child constructor "+x);
	}
	public void show() 
	{
		System.out.println("Child class method");
		System.out.println("The color in this method "+ color);
		System.out.println("The color in parent method "+ super.color);
		super.show();
			
	}
	public static void main(String[] args) 
	{
		Child c= new Child("Java");
		c.show();
	}

}
