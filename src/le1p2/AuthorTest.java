
package le1p2;

import static org.junit.Assert.*;

import org.junit.Test;

public class AuthorTest {

	@Test
	public void testAuthorConstructor() {
		String aName = "NameName NameName";
		Author author = new Author(aName);
		assertEquals("Creating new author", aName, author.getName());
	}

}
