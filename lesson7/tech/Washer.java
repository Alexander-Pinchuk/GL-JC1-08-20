package itacademy.lesson7.tech;

public class Washer extends BigTechnics{
    @Override
    public void write() {
        super.write();
        System.out.println("Washer is:");
    }

    @Override
    public void washing() {
        super.washing();
        System.out.println("Washer washing");
    }
}
