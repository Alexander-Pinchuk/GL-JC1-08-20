package itacademy.lesson6.bankomat;

public class Bankomat{

    private int kol_vo20 = 22, kol_vo50 = 8, kol_vo100 = 12;
    private int pin = 1234;
    private int sum;


    public void privetstvie(String privet){
         System.out.println(privet);
         System.out.println();
     }

     public void proverkaPin(int pin){
        if (this.pin == pin){
            System.out.print("Pin введен верно\n\n");
        }
        else {
            System.out.print("Введите заново\n\n");
        }
     }

     public void dialog(){
         System.out.print("Желаете:\n1. Снять деньги\n2. Пополнить баланс\n\n");
     }

    public void vibor(int choise){              //Не работает выбор
        if(choise==1){
            System.out.print("Снятие наличных\nВведите сумму кратно купюрам\n");
            dostupnieKupuri();
            withdraw();
        }
        else if(choise==2){
            System.out.print("Пополнение счета\nВведите сумму кратно купюрам\n\n");
            dostupnieKupuri();
            deposit();
        }
    }

    public void dostupnieKupuri(){
        System.out.println("Доступные купюры:\t20\t50\t100");
    }

    public void vvodSummi(int sum) {
        this.sum=sum;
        System.out.println("Сумма : " + sum);
    }

    public void ostatokBanknot(){
        System.out.printf("\nOstatok:\n20 banknotes: %d\n50 banknotes: %d\n100 banknotes: %d\n",kol_vo20,kol_vo50,kol_vo100);
    }

    public void deposit(){
        while ((sum-100)>=0) {
            sum = sum - 100;
            kol_vo100++;
        }
        while ((sum-50)>=0) {
            sum = sum - 50;
            kol_vo50++;
        }

        while ((sum-20)>=0) {
            sum = sum-20;
            kol_vo20++;
        }
    }

    public void withdraw(){
        while ((sum-100)>=0) {
                sum = sum - 100;
                kol_vo100--;
        }
        while ((sum-50)>=0) {
                sum = sum - 50;
                kol_vo50--;
        }

        while ((sum-20)>=0) {
                sum = sum-20;
                kol_vo20--;
        }
    }
 }