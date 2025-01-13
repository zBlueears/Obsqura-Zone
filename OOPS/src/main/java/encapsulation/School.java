package encapsulation;

public class School
{
	public static void main(String args[])
	{
		Student s=new Student();
		s.setName("Geethanjali Nair");
		s.setRollno(2423573);
		s.setMail("geethanjalinair02@gmail.com");
		System.out.println("Name :"+ s.getName());
		System.out.println("Rollno :"+s.getRollno());
		System.out.println("Mail ID :"+s.getMail());
	}

}
