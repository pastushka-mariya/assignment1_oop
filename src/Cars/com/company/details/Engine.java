package Cars.com.company.details;

public class Engine {
    protected int power;
    protected String manufacturer;

    public Engine(int power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }

    public String toString() {
        return "Engine: Power - " + power + "hp, Manufacturer - " + manufacturer;
    }
}
