package abstraction;

public class Video extends Google
{
	public void search()
	{
		System.out.println("Google search engine is available for mp4 files");
	}
	public void vid()
	{
		System.out.println("Mp4 files are also known as Video files");
	}
	public static void main(String[] args) {
		Video v= new Video();
		v.search();
		v.vid();
	}
	

}
