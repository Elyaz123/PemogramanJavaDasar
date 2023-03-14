package chapter11_InheritanceAndPolymorphism.exercises;
import java.util.GregorianCalendar;

public class Exercises11_2_EmployeeClass {
    public static void main(String[] args) {
        Person person = new Person("John", "12 Bell street",
                "3473339999", "john12@aol.com");

        Student student = new Student("Mary", "100 Town Ave", "5149993333",
                "mary100@aol.com", Student.FRESHMAN);

        Employee employee = new Employee("Mike", "34 West street", "6189999999",
                "mike80@aol.com", 910, 60000);

        Faculty faculty = new Faculty("Sue", "28 Well street", "4133333333",
                "sue28@aol.com", 101, 50000, "4pm to 6pm", "Professor");

        Staff staff = new Staff("Tom", "90 Country road", "2030000000",
                "tomcat@aol.com", 12, 65000, "Executive Assistant");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}

class Student
        extends Person {
    private int status;
    public final static int FRESHMAN = 1;
    public final static int SOPHOMORE = 3;
    public final static int JUNIOR = 2;
    public final static int SENIOR = 4;

    public Student(String name, String address,
                   String phone, String email, int status) {
        super(name, address, phone, email);
        this.status = status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatus() {
        switch (status) {
            case 1 : return "freshman";
            case 2 : return "sophomore";
            case 3 : return "junior";
            case 4 : return "senior";
            default : return "Unknown";
        }
    }

    public String toString() {
        return super.toString() + "\nStatus: " + getStatus();
    }
}
class Person {
    private String name;
    private String address;
    private String phone;
    private String email;

    Person() {
        this("Unknown","Unknown","Unknown","Unknown");
    }

    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "\nName: " + name + "\nAddress: " + address +
                "\nPhone number: " + phone + "\nEmail address: " + email;
    }
}
class Staff
        extends Employee {

    private String title;

    public Staff(String name, String address, String phone,
                 String email, int office, double salary, String title) {
        super(name, address, phone, email, office, salary);
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return super.toString() + "\nTitle: " + title;
    }

    class Employee
            extends Person {
        private int office;
        private double salary;
        private MyDate dateHired;

        public Employee(String name, String address, String phone,
                        String email, int office, double salary) {
            super(name, address, phone, email);
            this.office = office;
            this.salary = salary;
            this.dateHired = new MyDate();
        }
        public int getOffice() {
            return office;
        }

        public String getSalary() {
            return String.format("%.2f", salary);
        }

        public String getDateHired() {
            return dateHired.getMonth() + "/" + dateHired.getDay()
                    + "/" + dateHired.getYear();
        }

        public void setOffice(int office) {
            this.office = office;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public void setDateHired() {
            dateHired = new MyDate();
        }

        public String toString() {
            return super.toString() + "\nOffice: " + office +
                    "\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired();
        }
    }
}


class MyDate {
    // Data Fields
    private int year;
    private int month;
    private int day;

    MyDate() {
        GregorianCalendar calander = new GregorianCalendar();
        year = calander.get(GregorianCalendar.YEAR);
        month = calander.get(GregorianCalendar.MONTH);
        day = calander.get(GregorianCalendar.DAY_OF_MONTH);
    }

    MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public String getMonth() {
        String m = String.valueOf(month + 1);
        return (month < 10 ? "0" + m : m);
    }

    public String getDay() {
        String d = String.valueOf(day);
        return (day < 10 ? "0" + d : d);
    }

    public void setDate(long elapsedTime) {
        GregorianCalendar calander = new GregorianCalendar();
        calander.setTimeInMillis(elapsedTime);
        year = calander.get(GregorianCalendar.YEAR);
        month = calander.get(GregorianCalendar.MONTH);
        day = calander.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
class Faculty
        extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phone, String email,
                   int office, double salary, String officeHours, String rank) {
        super(name, address, phone, email, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String toString() {
        return super.toString() + "\nOffice hours: " + officeHours +
                "\nRank: " + rank;
    }
}

class Employee
        extends Person {
    private int office;
    private double salary;
    private MyDate dateHired;

    public Employee(String name, String address, String phone,
                    String email, int office, double salary) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = new MyDate();
    }

    public int getOffice() {
        return office;
    }

    public String getSalary() {
        return String.format("%.2f", salary);
    }

    public String getDateHired() {
        return dateHired.getMonth() + "/" + dateHired.getDay()
                + "/" + dateHired.getYear();
    }

    public void setOffice(int office) {
        this.office = office;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDateHired() {
        dateHired = new MyDate();
    }

    public String toString() {
        return super.toString() + "\nOffice: " + office +
                "\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired();
    }
}