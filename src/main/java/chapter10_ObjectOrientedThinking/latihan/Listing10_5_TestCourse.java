package chapter10_ObjectOrientedThinking.latihan;

public class Listing10_5_TestCourse {
    public Listing10_5_TestCourse(String dataStructures) {
    }

    public static void main(String[] args) {
        Listing10_5_TestCourse course1 = new Listing10_5_TestCourse("Data Structures");
        Listing10_5_TestCourse course2 = new Listing10_5_TestCourse("Database Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve smith");

        System.out.println("Number of student in course1: "
        + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getStudents(); i++)
            System.out.print(students[i] + ", ");

        System.out.println();
        System.out.print("Number of students in course2: "
        + course2.getNumberOfStudents());
    }

    private String[] getStudents() {
    }

    private String getNumberOfStudents() {
        return null;
    }

    private void addStudent(String peterJones) {

    }
}
