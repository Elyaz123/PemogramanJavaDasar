package chapter10_ObjectOrientedThinking.latihan;

public class Listing10_6_Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public  Listing10_6_Course(String courseName) {
        this.courseName = courseName;
    }
    public void addStudents(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    public String[] getStudents() {
        return students;
    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public String getCourseName() {
        return  courseName;
    }
    public void dropStudent( String student) {
    }
}
