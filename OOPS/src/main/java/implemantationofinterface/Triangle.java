package implemantationofinterface;

public class Triangle implements Shape
{

	@Override
	public void draw() 
	{
		System.out.println("The Shape to be drawn is Triangle");
	}
	public static void main(String args[])
	{
		Shape s= new Triangle();
		s.draw();
	}
	

}
