package itacademy.lesson7.tech;

public class DishWasher extends BigTechnics{

    @Override
    public void write() {
        super.write();
        System.out.println("DichWasher is: ");
    }

    @Override
    public void washing() {
        super.washing();
        System.out.println("Dishwasher washing.");
    }
}
