package activities;

abstract class Book{ //Abstract method 
	String title;
	abstract void setTitle(String s);

//Concrete Method 
String getTitle()
{
	return title;
}
}
class MyBook extends Book
{
	public void setTitle(String s) {
	title = s;
	}
}



public class Activity5 {

	public static void main(String[] args) {
		// Initialize title of the book
		String title = "Jungle Book";
		//Create object for new book 
		Book newNovel = new MyBook();
		//Set title
		newNovel.setTitle(title);

		//Print
		System.out.println("the title is :"+newNovel.getTitle());
	}

}