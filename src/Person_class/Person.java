package Person_class;

public class Person {
    private String fullName;
    private int age;

    public void talk() {
        System.out.println(fullName + " is talking");
    }

    public void move() {
        System.out.println(fullName + " is moving");
    }

    public Person() {
        this.fullName = "Unknown";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Dias", 17);

        person1.talk();
        person1.move();

        person2.talk();
        person2.move();
    }
}

