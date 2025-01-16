package implemantationofinterface;

public class Child1 implements parent1,parent2
{
	public void show() 
	{
		System.out.println("The minimum value is "+MIN_VALUE);			
	}

	public void print() 
	{
		System.out.println("The maximum value is "+MAX_VALUE);
	}
	public static void main(String[] args) 
	{
		Child1 c= new Child1();
		c.show();
		c.print();
	}

}
