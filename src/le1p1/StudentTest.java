
package le1p1;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {

    @Test
    public void testStudentConstructor() {
        Student s = new Student("Testy");
        assertEquals("Testy", s.getName());
    }

}
