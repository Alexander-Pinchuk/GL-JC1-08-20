package itacademy.lesson7.tech;

public class RunTech {
    public static void main(String[] args) {
        Washer washer = new Washer();
        DishWasher dishWasher = new DishWasher();
        MicrowaveOven microwaveOven = new MicrowaveOven();
        washer.write();
        washer.turnOn();
        washer.washing();
        System.out.println("------------");
        dishWasher.write();
        dishWasher.turnOff();
        dishWasher.washing();
        System.out.println("------------");
        microwaveOven.write();
        microwaveOven.turnOn();
        microwaveOven.heating();
    }
}
