package ManagementSystem;

import java.util.*;

public class Library {
	
	private List<Book> books = new ArrayList<>();

    public void addBook(String newBook) {
        books.addAll(newBook);
        System.out.println("Book added successfully.");
    }

    public void removeBook(int bookID) {
        books.removeIf(book -> book.bookID == bookID);
        System.out.println("Book removed successfully.");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            books.forEach(System.out::println);
        }
    }
}

