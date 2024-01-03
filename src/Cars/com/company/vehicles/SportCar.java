package Cars.com.company.vehicles;

import Cars.com.company.details.Engine;
import Cars.com.company.professions.Person;

public class SportCar extends Car {
    private int topSpeed;

    public SportCar(String carBrand, String carClass, int weight, Person driver, Engine motor, int topSpeed) {
        super(carBrand, carClass, weight, driver, motor);
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public String toString() {
        return super.toString() + "\nTop Speed - " + topSpeed + " km/h";
    }
}
