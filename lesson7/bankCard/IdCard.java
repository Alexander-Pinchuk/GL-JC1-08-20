package itacademy.lesson7.bankCard;

public class IdCard extends InfoCard{
    String name = "Kolya";
    int number = 123456789;

    @Override
    public void name() {
        super.name();
        System.out.printf("Name is: %s\n",name);
    }

    public void id_number(){
        System.out.println("ID Card number: " + number);
    }
}
