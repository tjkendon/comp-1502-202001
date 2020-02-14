
package le1p1;

import java.util.ArrayList;

public class SeatingPlan {

    private ArrayList<Student> section1;
    private ArrayList<Student> section2;
    private ArrayList<Seat> seats;
    
    
    
    
    
    /**
     * @param section1
     * @param section2
     * @param seats
     */
    public SeatingPlan(ArrayList<Student> section1, ArrayList<Student> section2, ArrayList<Seat> seats) {
        super();
        this.section1 = section1;
        this.section2 = section2;
        this.seats = seats;
    }
    
    public static ArrayList<Student> mergeStudents(
            ArrayList<Student> section1,
            ArrayList<Student> section2) {
        
    	// as I discussed in tutorial, this probably should
    	// be built a different way
    	
    	ArrayList<Student> mergedStudents = new ArrayList<>();
        
        int i = 0;
        for (; i < section1.size(); i++) {
            mergedStudents.add(section1.get(i));
            if (i < section2.size()) {
                mergedStudents.add(section2.get(i));
            }
        }
        
        while (i < section2.size()) {
            mergedStudents.add(section2.get(i));
            i++;
        }
        
        return mergedStudents;
    }
    
    /**
     * @return the section1
     */
    public ArrayList<Student> getSection1() {
        return section1;
    }
    
    /**
     * @return the section2
     */
    public ArrayList<Student> getSection2() {
        return section2;
    }
    
    /**
     * @return the seats
     */
    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public ArrayList<Assignment> getAssignment() {
    	
    	ArrayList<Assignment> assignment = new ArrayList<>();
    	
    	ArrayList<Student> students = 
    			SeatingPlan.mergeStudents(section1, section2);
    	
    	for (int i = 0; i < seats.size(); i++) {
    		// using a counted for loop so I can access
    		// seats from the seat list and students from the 
    		// student list at the same time
    		
    		if (i < students.size()) {
    			// if we have a student to go in the seat,
    			// add them to the assignment
    			assignment.add(new Assignment(
    					students.get(i), 
    					seats.get(i)));
    		}
    		
    	}
    	
    	return assignment;
    	
    }

    public ArrayList<Student> getWaiting() {
    	ArrayList<Student> waitingStudents = new ArrayList<>();
    	
    	ArrayList<Student> students = 
    			SeatingPlan.mergeStudents(section1, section2);
    	
    	for (int i = seats.size(); i < students.size(); i++) {
    		// we can start with the size of seats, because we 
    		// sat at least that many students. If there were
    		// fewer students than seats, i will be greater than
    		// students.size() so the loop won't run, otherwise,
    		// we'll start with the first student who didn't
    		// get a seat.
    		
    		waitingStudents.add(students.get(i));
    	}
    	
    	return waitingStudents;
    	
    }

}
