
package le1p1;

public class Assignment {

    private Student assignedStudent;
    private Seat assignedSeat;

    
    
    /**
     * @param assignedStudent
     * @param assignedSeat
     */
    public Assignment(Student assignedStudent, Seat assignedSeat) {
        this.assignedStudent = assignedStudent;
        this.assignedSeat = assignedSeat;
    }

    /**
     * @return the assignedStudent
     */
    public Student getStudent() {
        return assignedStudent;
    }

    /**
     * @return the assignedSeat
     */
    public Seat getSeat() {
        return assignedSeat;
    }

}
