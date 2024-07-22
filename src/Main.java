
public class Main {
    public static void main(String[] args) {
        Student[] arrayStudent = new Student[0];
        Student student = new Student("Khánh", 20, 1);
        Student student2 = new Student("Chí Anh", 80, 2);
        Student student3 = new Student("Tâm", 50, 3);
        Course course1 = new Course("Java", 1, arrayStudent);
        course1.addStudent(student);
        course1.addStudent(student2);
        course1.addStudent(student3);
        course1.displayStudents();

    }
}