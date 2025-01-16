package abstraction;

public class Child extends Sample
{
	public void show()
	{
		System.out.println("show():Implementation of Abstract Method");
	}
	public void display() 
	{
		System.out.println("display():Child class");
	}
	public static void main(String[] args) {
		Child c= new Child();		//abstract class cannot be instantiated
		c.show();
		c.print();
		c.display();
	}

}
