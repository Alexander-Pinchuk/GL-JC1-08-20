package itacademy.lesson7.bankCard;

public class RunCard {
    public static void main(String[] args) {
        Interational interational = new Interational();
        Local local = new Local();
        IdCard idCard = new IdCard();
        interational.name();
        interational.usingTerm();
        interational.whereToUse();
        System.out.println("---------------");
        local.name();
        local.usingTerm();
        local.whereToUse();
        System.out.println("---------------");
        idCard.name();
        idCard.birthsday();
        idCard.id_number();
        idCard.usingTerm();




    }
}
