
package aggregation;

public class Student {
    private int studentID;
    private String firstName;
    private String lastName;
    private char gender;
    
    public Student(int stdentID,String firstName,String lastName,
            char gender){
            this.studentID = studentID;
            this.firstName = firstName;
            this.lastName= lastName;
            this.gender = gender;
    
}
    public void displaystudentDetails() {
        System.out.printf("StudentID: %s%n",studentID);
        System.out.printf("StudentID",studentID);
        System.out.printf("StudentID",studentID);
        System.out.printf("StudentID",studentID);
    }
