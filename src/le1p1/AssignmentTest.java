
package le1p1;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssignmentTest {

    @Test
    public void testAssignmentConstructor() {
        Student s = new Student("Testy");
        Seat x = new Seat(40);
        Assignment a = new Assignment(s,x);
        assertEquals(s, a.getStudent());
        assertEquals(x, a.getSeat());
    }

}
