package Animals;

public class Horse extends Animal {
    private String maneColor;

    public Horse(String name_animal, String food, String location, String maneColor) {
        super(name_animal, food, location);
        this.maneColor = maneColor;
    }


    public void makeNoise() {
        System.out.println("The horse is neighing");
    }


    public void eat() {
        System.out.println("The horse is eating " + food);
    }


    public void gallop() {
        System.out.println("The horse is galloping");
    }
}
