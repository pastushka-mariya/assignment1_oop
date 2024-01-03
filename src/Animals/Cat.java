package Animals;

public class Cat extends Animal {
    private String furColor;

    public Cat(String name_animal, String food, String location, String furColor) {
        super(name_animal, food, location);
        this.furColor = furColor;
    }


    public void makeNoise() {
        System.out.println("The cat is meowing");
    }


    public void eat() {
        System.out.println("The cat is eating " + food);
    }

    public void purr() {
        System.out.println("The cat is purring");
    }
}
