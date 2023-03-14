package chapter10_ObjectOrientedThinking.exercises;

public class Exercises10_9_TheCourseClass {
    public static void main(String[] args) {
        Course math101 = new Course("math101");

        math101.addStudent("Mark");
        math101.addStudent("Tom");
        math101.addStudent("Joan");

        math101.dropStudent("Tom");

        System.out.println("\nThe student in the  course " +
                math101.getCourseName() + ":");
        String[] students = math101.getStudents();
        for (int i = 0; i < math101.getNumberOfStudents(); i++) {
            System.out.print(students[i] + " ");
        }
        System.out.println();
    }
}

class Course {
    private String courseName;
    private String[] students = new String[1];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {

        if (numberOfStudents == students.length) {
            String[] a = new String[students.length + 1];
            for (int i = 0; i < numberOfStudents; i++) {
                a[i] = students[i];
            }
            students = a;
        }
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
        return courseName;
    }

    public void dropStudent(String student) {
        int index = findStudent(student);
        if (index >= 0) {
            dropStudent(index);
        } else {
            System.out.println(student + " is not in the course: " + courseName);
        }
    }

    private void dropStudent(int index) {
        String[] s = new String[students.length - 1];
        for (int i = 0, j = 0; i < s.length; i++, j++) {
            if (i == index) {
                j++;
            }
            s[i] = students[j];
        }
        this.students = s;
        numberOfStudents--;
    }

    public void clear() {
        students = new String[1];
        numberOfStudents = 0;
    }

    private int findStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                return i;
            }
        }
        return -1;
    }
}

