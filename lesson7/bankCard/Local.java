package itacademy.lesson7.bankCard;

public class Local extends CreditCard {
    String name = "Maxim";
    String term = " 10.09.21";

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

    @Override
    public void whereToUse() {
        super.whereToUse();
        System.out.println("BelCard");
    }
}
