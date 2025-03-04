package ManagementSystem;

import java.util.Scanner;

public class BookManagementSystem extends Library  {

	public BookManagementSystem(int bookID, String title, String author, boolean isAvailable) {
//		super(bookID, title, author, isAvailable);
//		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Library l1=new Library();
		
		
		//menu driven interface to interact with the library system
		Scanner sc=new Scanner(System.in);
//		Scanner sc1=new Scanner(System.in);
		
		System.out.println("Please enter your option from following:");
		System.out.println("1. Add the book");
		System.out.println("2. Remove the book");
		System.out.println("3. Display the book");
		
		int option = sc.nextInt();
		String newBook=sc.next();
		
				
		//Allow users to add,replace and display books
		if(option == 1)
		{
		l1.addBook(newBook);	
		}else if(option == 2)
		{
		l1.replaceBook(2);		
		}else if(option == 3)
		{
		l1.displayBooks();		
		}
		
	}

}
