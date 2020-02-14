
package le1p1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SeatTest {

    @Test
    public void testSeatConstruction() {
        Seat s = new Seat(40);
        assertEquals(40, s.getNumber());
    }

}
