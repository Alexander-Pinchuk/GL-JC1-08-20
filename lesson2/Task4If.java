package itacademy.lesson2;

public class Task4If {
    public static void main(String[] args) {
        int day = 31;
        int month = 12;
        int year = 2004;
        int maxday = 0;

        switch (month){
            case 1:
                maxday = 31;
                break;
            case 2:
                if(year%400==0){
                    maxday = 29;
                }
                else if (year%100==0 ){
                    maxday = 28;
                }
                else if(year%4==0 ){
                    maxday = 29;
                }else
                    {
                    maxday = 28;
                }
                break;
            case 3:
                maxday = 31;
                break;
            case 4:
                maxday = 30;
                break;
            case 5:
                maxday = 31;
                break;
            case 6:
                maxday = 30;
                break;
            case 7:
                maxday = 31;
                break;
            case 8:
                maxday = 31;
                break;
            case 9:
                maxday = 30;
                break;
            case 10:
                maxday = 31;
                break;
            case 11:
                maxday = 30;
                break;
            case 12:
                maxday = 31;
                break;
            default:
                System.out.println("There is no such month. Change month number.");
        }

        if (day>maxday || month>12 || month<1){
            System.out.println("Enter the right date");
        }
        else {
            if (day < maxday) {
                day++;
            } else if (day == maxday) {
                day = 1;
                if (month < 12)
                    month++;
                else {
                    if (month == 12) {
                        month = 1;
                        year++;
                    }

                }
            }
            System.out.println(day + "." + month + "." + year);
        }
    }
}
