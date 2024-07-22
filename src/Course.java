import java.util.Arrays;

public class Course {
    public Student[] arrayStudent = new Student[0];
    private String courseName;
    private int courseCode;

    private Student[] students;

    public Course(String courseName, int courseCode, Student[] students) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.students = students;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public void addStudent(Student student) {
        arrayStudent = Arrays.copyOf(arrayStudent, arrayStudent.length + 1);
        arrayStudent[arrayStudent.length - 1] = student;
    }

    public void displayStudents() {
        for (int x = 0; x < arrayStudent.length; x++) {
            System.out.println(arrayStudent[x].toString());
        }
    }
}
