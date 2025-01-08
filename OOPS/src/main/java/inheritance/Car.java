package inheritance;

public class Car extends Vechicle
{
	String model="BMW";
	public void speed()
	{
		System.out.println("Speed of car is a max of 200km/hr");
		
	}
	public static void main(String[] args)
	{
		Car ob= new Car();
		System.out.println("The model of the car is "+ ob.model);
		ob.speed();
		ob.types();
		

	}

}
