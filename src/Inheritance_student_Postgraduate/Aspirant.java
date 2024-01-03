package Inheritance_student_Postgraduate;

public class Aspirant extends Student {
    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    public double getScholarship() {
        if (averageMark == 5) {
            return 200.0;
        } else {
            return 180.0;
        }
    }
}


