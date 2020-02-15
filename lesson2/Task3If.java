package itacademy.lesson2;

public class Task3If {
    public static void main(String[] args) {
        int x = 21;
        switch(x%10){                           // Вариант через switch
            case 1:
                System.out.println(x + " рубль");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println(x + " рубля");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 0:
                System.out.println(x + " рублей");
                break;
        }

        if(x%10==1)                                 // Вариант через if
            System.out.println(x + " рубль");
        else if (x%10 == 2 | x%10 == 3 | x%10 == 4)
            System.out.println(x + " рубля");
        else if (x%10 == 5 | x%10 ==6 | x%10 == 7| x%10 == 8| x%10 == 9| x%10 ==0)
            System.out.println(x + " рублей");
    }
}
