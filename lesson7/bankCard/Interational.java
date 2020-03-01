package itacademy.lesson7.bankCard;

public class Interational extends CreditCard{
    String name = "Georgiy";
    String term = "10.12.18";
    @Override
    public void whereToUse() {
        super.whereToUse();
        System.out.println("Visa");
    }

    @Override
    public void name() {
        super.name();
        System.out.println("Name: " + name);
    }

    @Override
    public void usingTerm() {
        super.usingTerm();
        System.out.println("Using term: " + term);
    }
}
