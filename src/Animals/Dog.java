package Animals;

public class Dog extends Animal {
    private String breed;

    public Dog(String name_animal, String food, String location, String breed) {
        super(name_animal, food, location);
        this.breed = breed;
    }


    public void makeNoise() {
        System.out.println("The dog is barking");
    }


    public void eat() {
        System.out.println("The dog is eating " + food);
    }


    public void wagTail() {
        System.out.println("The dog is wagging its tail");
    }
}
