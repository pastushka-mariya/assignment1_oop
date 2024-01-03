package Animals;

public class Animal {
    protected String food;
    protected String location;
    protected String name_animal;

    public Animal(String name_animal, String food, String location) {
        this.name_animal = name_animal;
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Such an animal is sleeping");
    }

    public void eat() {
        System.out.println("The animal is eating " + food);
    }

    public void sleep() {
        System.out.println("The animal is sleeping");
    }
}
