package aggregation;

public class Student 
{
	String name;
	int rollNo;
	Address  add;
	public Student(String name, int rollNo, Address add)
	{
		this.name= name;
		this.rollNo= rollNo;
		this.add =add;
	}
	public void display()
	{
		System.out.println("The name of the Student is "+ name);
		System.out.println("The Roll number "+rollNo);;
		System.out.println("House name "+ add.hName);
		System.out.println("City "+ add.city);
		System.out.println("House number "+ add.hNumber);
		System.out.println("Pincode "+ add.pin);
	}
	public static void main (String args[])
	{
		Address a= new Address("Kannoth H", "Kochi", 115, 606103);
		Student s= new Student("Parvathy K", 2423573, a);
		s.display();
	}
}

	

	