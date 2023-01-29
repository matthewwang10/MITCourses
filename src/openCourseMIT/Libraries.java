package openCourseMIT;

import java.util.ArrayList;
import java.util.List;

public class Libraries {
	String address;
	List<Books> booklist;
	
	public Libraries(String location) {
		this.address = location;
		this.booklist = new ArrayList<Books>();
	}
	
	public void addBooks(String bookTitle) {
		Books book = new Books(bookTitle);
		this.booklist.add(book);
	}
	
	public void openingHours() {
		System.out.println("All libraries are open daily from 9 AM to 5 PM");
	}
	
	public void printAddress() {
		System.out.println(this.address);
	}
	
	public void borrowBook(String bookTitle) {
		for (Books book: this.booklist) {
			if (book.title.equals(bookTitle)) {
				if (book.borrowed) {
					System.out.println("This book is already borrowed");
				}
				else {
					System.out.println("Borrowed " + bookTitle);
					book.borrowed = true;
				}
				break;
			}
		}
	}
	
	public void printAvailableBooks() {
		for (Books book: this.booklist) {
			if (!book.borrowed) {
				System.out.println(book.title);
			}
		}
	}
	
	public void returnBook(String bookTitle) {
		for (Books book: this.booklist) {
			if (book.title.equals(bookTitle)) {
				System.out.println("Returned " + bookTitle);
				book.borrowed = false;
				
				break;
			}
			
		}
	}
	
	public static void main(String[] args) {
		Libraries firstLibrary = new Libraries("10 Main Street");
		Libraries secondLibrary = new Libraries("228 Liberty Street");
		firstLibrary.addBooks("The Da Vinci Code");
		firstLibrary.addBooks("Le Petit Prince");
		firstLibrary.addBooks("A Tale of Two Cities");
		firstLibrary.addBooks("The Lord of the Rings");
		firstLibrary.borrowBook("The Lord of the Rings");
		firstLibrary.borrowBook("The Lord of the Rings");
		firstLibrary.printAvailableBooks();
		firstLibrary.returnBook("The Lord of the Rings");
		firstLibrary.printAvailableBooks();
	}
	
}
