package HomeWork.DZ6;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student();
        teacher.setName("Петр Васильевич");
        teacher.setSubject("Математика");
        student.setName("Леонид");

        teacher.evaluate(student);

    }
}
