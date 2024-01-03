package Inheritance_student_Postgraduate;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Leila", "Alpieva", "IT-2309", 4.5);
        Aspirant aspirant = new Aspirant("Dias", "Muratov", "CS-2315", 5.0);

        Student[] students = {student, aspirant};

        for (Student s : students) {
            System.out.println(s.firstName + " " + s.lastName + ": Scholarship amount - $" + s.getScholarship());
        }
    }
}
