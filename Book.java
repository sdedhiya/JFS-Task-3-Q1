package ManagementSystem;

public class Book {

	int bookID;
	String title, author;
	boolean isAvailable;
	
	public Book(int bookID, String title, String author, boolean isAvailable) {
		super();
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.isAvailable = isAvailable;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isAvailable() {
		return isAvailable;
	}


public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}


}
