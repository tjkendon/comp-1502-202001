
package le1p2;

import static org.junit.Assert.*;

import org.junit.Test;

public class BookTest {

	@Test
	public void testBookConstructor() {
		String title = "Book Book Book";
		String isbn = "10001";
		Author author = new Author("Name NameName");
		Book book = new Book(title, isbn, author);
		assertEquals("Creating new Book", title, book.getTitle());
		assertEquals("Creating new Book", isbn, book.getIsbn());
		assertEquals("Creating new Book", author, book.getAuthor());
	}

}
