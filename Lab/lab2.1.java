package lab2;

public class lab21 {

    public static void main(String[] args) {
        String inputStudentId = "68543210017-8";
        String inputName = "Worasit Boonyapreedee";

        Student student1 = new Student(inputStudentId, inputName);

        System.out.println(student1.getStudentId());
        System.out.println(student1.getName());
    }
}

class Student {
    private String studentId;
    private String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
}
