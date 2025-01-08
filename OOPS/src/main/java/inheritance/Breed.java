package inheritance;

public class Breed extends Dog
{
	public void inform()
	{
		System.out.println("There are different breeds of "+type+" available");
		System.out.println("examples");
	}
	public static void main(String args[])
	{
		Breed ob= new Breed();
		ob.info();
		ob.infor();
		ob.inform();
		System.out.println(ob.b1+" "+ob.b2+" "+ob.b3);		
	}
}
