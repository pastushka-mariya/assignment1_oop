package Cars.com.company.professions;

public class Person {
    protected String fullName;
    protected int drivingExperience;

    public Person(String fullName, int drivingExperience) {
        this.fullName = fullName;
        this.drivingExperience = drivingExperience;
    }

    public String toString() {
        return "Driver: " + fullName + ", Driving Experience: " + drivingExperience + " years";
    }
}
