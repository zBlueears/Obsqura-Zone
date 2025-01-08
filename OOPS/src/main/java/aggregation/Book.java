package aggregation;

public class Book 
{
	String bName;
	String genre;
	String publisher;
	Author au;
	public Book(String bName, String genre, String publisher, Author au)
	{
		this.bName= bName;
		this.genre= genre;
		this.publisher= publisher;
		this.au= au;
	}
	public void show()
	{
		System.out.println("Book Name: "+bName);
		System.out.println("Genre :"+ genre);
		System.out.println("Publisher :"+ publisher);
		System.out.println("Author name :"+au.aName);
		System.out.println("Author place :"+ au.place);
	}

	public static void main(String[] args) 
	{
		Author author= new Author("Murakami", "Japanese");
		Book book= new Book("Norwegian Wood", "Fiction", "Penguin", author);
		book.show();
	}

}
