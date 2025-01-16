package implemantationofinterface;

public class Child implements Sample
{

	@Override
	public void show(int NUM) {
		System.out.println("Interface method");
		System.out.println("Interface Variable "+ NUM);
		// TODO Auto-generated method stub
		
	}
	public void sum(int NUM, int NUM1) 
	{
		int s=NUM+NUM1;
		System.out.println("Sum: "+s);		
	}


	public static void main(String args[])
	{
		Sample s= new Child();
		s.sum(NUM, NUM1);
		s.show(NUM);
	}
	
}