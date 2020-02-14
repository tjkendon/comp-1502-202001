
package le1p2;

import java.util.ArrayList;

public class Borrower {
	
	private String name;
	private int id;
	private ArrayList<Book> books;
	
	public Borrower(String name, int id) {
		this.name = name;
		this.id = id;
		this.books = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}
	
	public void borrowBook(Book borrowedBook) {
		this.books.add(borrowedBook);
	}
	
	public void returnBook(Book book) {
		this.books.remove(book);
	}
	
	public ArrayList<Author> getAuthors() {
		ArrayList<Author> authors = 
				new ArrayList<>();
		
		for (Book b : books) {
			if (!authors.contains(b.getAuthor())) {
				authors.add(b.getAuthor());
			}
		}
		
		return authors;
	}
	
	public String borrowedBookString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.name).append("\n");
		for (Book b : books) {
			builder.append("\t")
			.append(b.getTitle())
			.append("\n");
		}
		return builder.toString();
	}
	
	public String borrowedAuthorString() {
		StringBuilder builder = new StringBuilder();
		ArrayList<Author> authors = 
				this.getAuthors();
		builder.append(this.name).append("\n");
		for (Author a : authors) {
			builder.append("\t")
			.append(a.getName())
			.append("\n");
		}
		return builder.toString();
	}
			

	
	
	
	
	

}
