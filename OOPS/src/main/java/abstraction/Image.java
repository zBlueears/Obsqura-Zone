package abstraction;

public class Image extends Google
{
	public void search()
	{
		System.out.println("Google search engine is active for jpg or image files");
	}
	public void img()
	{
		System.out.println("Google images are available");
	}
	public static void main(String[] args) 
	{
		Image i= new Image();
		i.search();
		i.img();
	}

}
