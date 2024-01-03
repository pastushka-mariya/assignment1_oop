package Cars.com.company.vehicles;

import Cars.com.company.details.Engine;
import Cars.com.company.professions.Person;

public class Lorry extends Car {
    private int carryingCapacity;

    public Lorry(String carBrand, String carClass, int weight, Person driver, Engine motor, int carryingCapacity) {
        super(carBrand, carClass, weight, driver, motor);
        this.carryingCapacity = carryingCapacity;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public String toString() {
        return super.toString() + "\nCarrying Capacity - " + carryingCapacity + "kg";
    }
}
