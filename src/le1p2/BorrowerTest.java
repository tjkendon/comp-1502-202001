
package le1p2;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class BorrowerTest {

	@Test
	public void testBorrowerConstuctor() {
		String name = "Name Name NameName";
		int id = 4050;
		Borrower b = new Borrower(name, id);
		assertEquals("Creating new Borrower", name, b.getName());
		assertEquals("Creating new Borrower", id, b.getId());
		assertTrue("Creating new Borrower", b.getBooks().isEmpty());
		assertTrue("Creating new Borrower", b.getAuthors().isEmpty());
	}
	
	@Test
	public void testBorrowBook() {
		String name = "Name Name NameName";
		int id = 4050;
		Borrower b = new Borrower(name, id);
		
		String title = "Book Book Book";
		String isbn = "10001";
		Author author = new Author("Name NameName");
		Book book = new Book(title, isbn, author);
		ArrayList<Book> expectedBooks = new ArrayList<Book>();
		expectedBooks.add(book);
		
		b.borrowBook(book);
		
		assertEquals(expectedBooks, b.getBooks());
		
		
	}

	@Test
	public void testReturnBook() {
		String name = "Name Name NameName";
		int id = 4050;
		Borrower b = new Borrower(name, id);
		
		String title = "Book Book Book";
		String isbn = "10001";
		Author author = new Author("Name NameName");
		Book book = new Book(title, isbn, author);
		
		
		String title1 = "Book Book";
		String isbn2 = "10002";
		Book book2 = new Book(title1, isbn2, author);
		
		b.borrowBook(book);
		b.borrowBook(book2);
		b.returnBook(book);
		
		ArrayList<Book> expectedBooks = new ArrayList<Book>();
		// after borrowing and returning book book2 should be the only
		// one left
		expectedBooks.add(book2);
		
		
		assertEquals(expectedBooks, b.getBooks());
	}
	
	@Test
	public void testAuthorList() {
		String name = "Name Name NameName";
		int id = 4050;
		Borrower b = new Borrower(name, id);
		
		String title = "Book Book Book";
		String isbn = "10001";
		Author author = new Author("Name NameName");
		Book book = new Book(title, isbn, author);
				
		String title2 = "Book Book";
		String isbn2 = "10002";
		Book book2 = new Book(title2, isbn2, author);

		String title3 = "Book ";
		String isbn3 = "10003";
		Author author2 = new Author ("Namish Name");
		Book book3 = new Book(title3, isbn3, author2);
		
		b.borrowBook(book);
		b.borrowBook(book2);
		b.borrowBook(book3);
		
		ArrayList<Author> expectedAuthors = 
				new ArrayList<>();
		expectedAuthors.add(author);
		expectedAuthors.add(author2);
		
		assertEquals(expectedAuthors, b.getAuthors());
		
		
	}
	
	
	
}
