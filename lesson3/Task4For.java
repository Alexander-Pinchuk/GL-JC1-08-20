package itacademy.lesson3;

public class Task4For {
    public static void main(String[] args) {
        boolean simple;
        for(int i = 2; i<=10000; i++) {
            simple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple == true) {
                System.out.printf("Simple number: %d\n", i);
            }
        }
    }
}
