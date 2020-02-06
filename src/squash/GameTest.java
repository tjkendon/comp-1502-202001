package squash;

// import the junit tools
import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest {

	// annotation to say this is a test method
	@Test
	public void test() {
		// fail always makes the test fail for Junit
		// fail("Not yet implemented");
		
		// lets us test if things are true, error message first to help debug
		//assertTrue("expected 77 to be equal to 68", 77 == 68);
		
		// checks two things are equal, error message first for debug again,
		// second arg is the *expected* value, third argument is *actual*
		//assertEquals("checking if 5 is 10", 5, 10);
		
		// assertEquals for doubles, give it a percision (delta)
		assertEquals("checking if .3 is .3", 0.1+0.1+0.1, 0.3, 0.01);
		//System.out.println(0.1 + 0.1 + 0.1);
		
	}
	
	@Test
	// test that the new game is set up properly
	public void testNewGame() {
		// 4 steps for tests
		// 1. determine our expected output (0 for p1, 0 for p2, no winner)
		// 2. set up our test (not much to do here)
		// 3. run our test ( create our new game)
		// 4. assert expect meets the actual 
		
		// 1.
		int expectedP1Score = 0;
		int expectedP2Score = 0;
		
		
		// 2.
		
		// 3.
		Game actualGame = new Game();
		
		// 4.
		assertEquals(expectedP1Score, actualGame.getPlayerOneScore());
		assertEquals(expectedP2Score, actualGame.getPlayerTwoScore());
		assertFalse(actualGame.isWon());
		
	}

}
