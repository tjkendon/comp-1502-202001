
package le1p2;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

// You can run this as JUnit test, and it will run all 3 test classes

@RunWith(Suite.class)
@SuiteClasses({ AuthorTest.class, BookTest.class, BorrowerTest.class })
public class AllTests {

}
