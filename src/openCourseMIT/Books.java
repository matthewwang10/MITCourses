package openCourseMIT;

public class Books {
	String title;
	boolean borrowed;
	
	public Books(String bookTitle) {
		this.title = bookTitle;
		this.borrowed = false;
	}
	
	public void borrowed() {
		this.borrowed = true;
	}
	
	public void returned() {
		this.borrowed = false;
	}
	
	public void isBorrowed() {
		if (this.borrowed) {
			System.out.println("this book is borrowed");
		}
		else {
			System.out.println("this book is not borrowed");
		} 
	}
	
	public void getTitle() {
		System.out.println(this.title);
	}
	
	public static void main(String[] args) {
		Books example = new Books("Pride and Prejudice");
		example.isBorrowed();
		example.getTitle();
	}
}
