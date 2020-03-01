package itacademy.lesson6.time;

public class RunTime {
    public static void main(String[] args) {
        Time time1 = new Time(20,5,2);
        Time sek1 = new Time(942);
        time1.timeToSeconds();
        System.out.printf("Seconds: %s\n",sek1);
        System.out.println(sek1.toString().compareTo(time1.toString()));
        int x = sek1.toString().compareTo(time1.toString());
        conclusion(x);
    }

    public static void conclusion(int x){
        if(x >0){
            System.out.println("sek1 string bigger");
        }
        else if (x == 0){
            System.out.println("The strings are equals");
        }
        else{
            System.out.println("time1 string bigger");
        }
    }
}
