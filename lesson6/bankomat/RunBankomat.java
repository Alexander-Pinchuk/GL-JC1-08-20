package itacademy.lesson6.bankomat;


public class RunBankomat {
    public static void main(String[] args) {
        Bankomat bank = new Bankomat();
        bank.privetstvie("Welcome!");
        bank.proverkaPin(1234);
        bank.dialog();
        bank.vibor(2);
        bank.vvodSummi(250);
        bank.withdraw();
        bank.deposit();
        bank.ostatokBanknot();
    }
}
