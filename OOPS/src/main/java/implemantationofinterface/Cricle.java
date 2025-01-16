package implemantationofinterface;

public class Cricle implements Shape
{
	public void draw() {
		System.out.println("Shape to be drawn is Circle");		
	}
	
	public static void main(String[] args) {
		Shape s= new Cricle();
		s.draw();
	}
	

}
