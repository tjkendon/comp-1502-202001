
package le1p1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class SeatingPlanTest {

    @Test
    public void testMergeEqualSize() {
        
        ArrayList<Student> section1 = new ArrayList<>();
        ArrayList<Student> section2 = new ArrayList<>();
        ArrayList<Student> merged = new ArrayList<>();
        
        Student s11 = new Student("S11");
        section1.add(s11);
        merged.add(s11);
        Student s21 = new Student("S21");
        section2.add(s21);
        merged.add(s21);
        Student s12 = new Student("S12");
        section1.add(s12);
        merged.add(s12);
        Student s22 = new Student("S22");
        section2.add(s22);
        merged.add(s22);
        
        assertEquals(merged, SeatingPlan.mergeStudents(section1, section2));
        
    }

    @Test
    public void testMergeS1Bigger() {
        
        ArrayList<Student> section1 = new ArrayList<>();
        ArrayList<Student> section2 = new ArrayList<>();
        ArrayList<Student> merged = new ArrayList<>();
        
        Student s11 = new Student("S11");
        section1.add(s11);
        merged.add(s11);
        Student s21 = new Student("S21");
        section2.add(s21);
        merged.add(s21);
        Student s12 = new Student("S12");
        section1.add(s12);
        merged.add(s12);
        Student s22 = new Student("S22");
        section2.add(s22);
        merged.add(s22);
        Student s13 = new Student("S13");
        section2.add(s13);
        merged.add(s13);
        Student s14 = new Student("S14");
        section2.add(s14);
        merged.add(s14);
        
        assertEquals(merged, SeatingPlan.mergeStudents(section1, section2));
        
    }

    @Test
    public void testMergeS2Bigger() {
        
        ArrayList<Student> section1 = new ArrayList<>();
        ArrayList<Student> section2 = new ArrayList<>();
        ArrayList<Student> merged = new ArrayList<>();
        
        Student s11 = new Student("S11");
        section1.add(s11);
        merged.add(s11);
        Student s21 = new Student("S21");
        section2.add(s21);
        merged.add(s21);
        Student s12 = new Student("S12");
        section1.add(s12);
        merged.add(s12);
        Student s22 = new Student("S22");
        section2.add(s22);
        merged.add(s22);
        Student s23 = new Student("S23");
        section2.add(s23);
        merged.add(s23);
        Student s24 = new Student("S24");
        section2.add(s24);
        merged.add(s24);
        
        assertEquals(merged, SeatingPlan.mergeStudents(section1, section2));
        
    }

    /*
     * TODO: Add your seating plan tests here 
     */
    
    @Test
    public void testSeatingPlanConstructor() {
      
        Student a = new Student("Alice");
        Student b = new Student("Bob");
        Student c = new Student("Carol");
        Student d = new Student("Dave");
        
        Seat one = new Seat(1);
        Seat two = new Seat(2);
        Seat three = new Seat(3);
        
        ArrayList<Student> section1 = new ArrayList<>();
        section1.add(a);
        section1.add(b);
        
        ArrayList<Student> section2 = new ArrayList<>();
        section2.add(c);
        section2.add(d);
        
        ArrayList<Seat> seats = new ArrayList<>();
        seats.add(one);
        seats.add(two);
        seats.add(three);
        
        SeatingPlan plan = new SeatingPlan(section1,
                section2,
                seats);
        
        assertEquals("New Seating Plan - section 1",
                section1, 
                plan.getSection1());
        assertEquals("New Seating Plan - section 2",
                section2, 
                plan.getSection2());
        assertEquals("New Seating Plan - seats",
                seats, 
                plan.getSeats());
        
    }
    
    
    
}
