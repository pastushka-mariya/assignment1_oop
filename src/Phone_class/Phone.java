package Phone_class;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public static void main(String[] args) {
        Phone phone1 = new Phone("87087534100", "Sumsung A51", 150.5);
        Phone phone2 = new Phone("87064255044", "iPhone XSMax");
        Phone phone3 = new Phone();

        System.out.println("Phone 1 - Number: " + phone1.getNumber() + ", Model: " + phone1.getModel() + ", Weight: " + phone1.getWeight());
        System.out.println("Phone 2 - Number: " + phone2.getNumber() + ", Model: " + phone2.getModel() + ", Weight: " + phone2.getWeight());
        System.out.println("Phone 3 - Number: " + phone3.getNumber() + ", Model: " + phone3.getModel() + ", Weight: " + phone3.getWeight());

        phone1.receiveCall("Ablanova Dariya");
        phone2.receiveCall("Alpieva Leila", "87763270136");
        phone3.receiveCall("Unknown Caller");

        Phone phone4 = new Phone("7777777777", "Google Pixel");
        System.out.println("Phone 4 - Number: " + phone4.getNumber() + ", Model: " + phone4.getModel() + ", Weight: " + phone4.getWeight());

        phone4.receiveCall("Nurken", "87479202147");

        phone1.sendMessage("111-2222", "333-4444", "555-6666");
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String callerName) {
        System.out.println(callerName + " is ringing");
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model, 0.0);
    }

    public Phone() {
        this("", "", 0.0);
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println(callerName + " is calling from number " + callerNumber);
    }

    public void sendMessage(String... phoneNumbers) {
        System.out.print("Sending message to: ");
        for (String number : phoneNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

