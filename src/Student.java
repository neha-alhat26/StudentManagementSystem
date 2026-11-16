
public class Student {

    // Student attributes
    private int studentId;
    private String name;
    private int age;
    private String course;
    private String email;
    private double marks;

    // Constructor
    public Student(int studentId, String name, int age,
            String course, String email, double marks) {

        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.course = course;
        this.email = email;
        this.marks = marks;
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public String getEmail() {
        return email;
    }

    public double getMarks() {
        return marks;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Display student details
    @Override
    public String toString() {
        return "Student ID: " + studentId
                + "\nName: " + name
                + "\nAge: " + age
                + "\nCourse: " + course
                + "\nEmail: " + email
                + "\nMarks: " + marks;
    }
}
