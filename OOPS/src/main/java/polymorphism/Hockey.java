package polymorphism;

public class Hockey extends Sports
{
	public void play()
	{
		System.out.println("Hockey, its name is derived from the french word hoquet");
	}
	public static void main(String args[])
	{
		Sports s;
		s= new Sports();
		s.play();
		s=new Cricket();
		s.play();
		s= new Football();
		s.play();
		s= new Hockey();
		s.play();		
	}

}
