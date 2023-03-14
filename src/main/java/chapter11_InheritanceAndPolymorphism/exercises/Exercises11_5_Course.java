package chapter11_InheritanceAndPolymorphism.exercises;

import java.util.ArrayList;

class Course {

    private String courseName;
    private ArrayList<String> students;

    // Constructor
    /** Create a Course object */
    public Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<String>();
    }

    // Methods
    /** Add a student to the list */
    public void addStudent(String student) {
        students.add(student);
    }

    /** Return students in an array */
    public String[] getStudents() {
        String[] a = new String[students.size()];
        return students.toArray(a);
    }

    /** Return number of students */
    public int getNumberOfStudents() {
        return students.size();
    }

    /** Return course name */
    public String getCourseName() {
        return courseName;
    }

    /** Drop a student for list */
    public void dropStudent(String student) {
        students.remove(student);
    }
}
 public class Exercises11_5_Course
{
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1: "
                + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + ", ");

        System.out.println();
        System.out.print("Number of students in course2: "
                + course2.getNumberOfStudents());
    }
}
