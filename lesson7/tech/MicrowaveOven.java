package itacademy.lesson7.tech;

public class MicrowaveOven extends BigTechnics{

    @Override
    public void write() {
        super.write();
        System.out.println("Microwave Oven:");
    }

    @Override
    public void heating() {
        super.heating();
        System.out.println("Microwave heating");
    }
}
