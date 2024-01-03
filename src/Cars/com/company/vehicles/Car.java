package Cars.com.company.vehicles;

import Cars.com.company.details.Engine;
import Cars.com.company.professions.Person;

public class Car {
    protected String carBrand;
    protected String carClass;
    protected int weight;
    protected Person driver;
    protected Engine motor;

    public Car(String carBrand, String carClass, int weight, Person driver, Engine motor) {
        this.carBrand = carBrand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.motor = motor;
    }

    public void start() {
        System.out.println("Let's go");
    }

    public void stop() {
        System.out.println("Let's stop");
    }

    public void turnRight() {
        System.out.println("Turn right");
    }

    public void turnLeft() {
        System.out.println("Turn left");
    }

    public String toString() {
        return "Car: " + carBrand + " " + carClass + ", Weight - " + weight + "kg\n" +
                driver.toString() + "\n" +
                motor.toString();
    }
}
