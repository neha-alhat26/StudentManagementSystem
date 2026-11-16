
import java.util.ArrayList;

public class StudentManager {

    // ArrayList to store student objects
    private ArrayList<Student> students = new ArrayList<>();

    // CREATE: Add a new student
    public void addStudent(Student student) {

        if (findStudentById(student.getStudentId()) != null) {
            System.out.println("Student ID already exists!");
            return;
        }

        students.add(student);
        System.out.println("Student added successfully!");
    }

    // READ: Display all students
    public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        for (Student student : students) {
            System.out.println("----------------------");
            System.out.println(student);
        }
    }

    // SEARCH: Find a student using ID
    public Student searchStudent(int studentId) {

        Student student = findStudentById(studentId);

        if (student != null) {
            System.out.println("Student found!");
            System.out.println(student);
        } else {
            System.out.println("Student not found!");
        }

        return student;
    }

    // UPDATE: Modify existing student details
    public void updateStudent(int studentId, String name,
            int age, String course,
            String email, double marks) {

        Student student = findStudentById(studentId);

        if (student == null) {
            System.out.println("Student not found!");
            return;
        }

        student.setName(name);
        student.setAge(age);
        student.setCourse(course);
        student.setEmail(email);
        student.setMarks(marks);

        System.out.println("Student updated successfully!");
    }

    // DELETE: Remove a student using ID
    public void deleteStudent(int studentId) {

        Student student = findStudentById(studentId);

        if (student == null) {
            System.out.println("Student not found!");
            return;
        }

        students.remove(student);
        System.out.println("Student deleted successfully!");
    }

    // HELPER METHOD: Find student by ID
    private Student findStudentById(int studentId) {

        for (Student student : students) {

            if (student.getStudentId() == studentId) {
                return student;
            }
        }

        return null;
    }
}
