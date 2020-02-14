

package le1p1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Student> section1 = generateStudents("Jordan", 7);
        ArrayList<Student> section2 = generateStudents("Jamie", 9);
        
        ArrayList<Seat> seats = generateSeats(10);

        SeatingPlan plan = new SeatingPlan(section1, section2, seats);

        System.out.println("Assignment:");
        System.out.println(plan.getAssignment());
        System.out.println("Waiting:");
        System.out.println(plan.getWaiting());

        

    }

    public static ArrayList<Student> generateStudents(
            String name,
            int size) {
        ArrayList<Student> students = new ArrayList<Student>();
        for (int i = 0; i < size; i++) {
            students.add(new Student(name + i));
        }
        return students;
    }
    
    public static ArrayList<Seat> generateSeats(int numberOfSeats) {
        ArrayList<Seat> seats = new ArrayList<Seat>();
       for (int i = 0; i < numberOfSeats; i++) {
           seats.add(new Seat(i));
       }
        return seats;
    }

}
