package Animals;

public class Main {
    public static void main(String[] args) {

        Veterinary vet = new Veterinary();


        Animal dog = new Dog("Dog", "Bones", "Yard", "Labrador");
        Animal cat = new Cat("Cat", "Fish", "Living Room", "White");
        Animal horse = new Horse("Horse", "Hay", "Stable", "Brown");


        vet.treatAnimal(dog);
        vet.treatAnimal(cat);
        vet.treatAnimal(horse);
    }
}
