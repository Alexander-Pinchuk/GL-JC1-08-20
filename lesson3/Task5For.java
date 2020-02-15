package itacademy.lesson3;

public class Task5For {
    public static void main(String[] args) {
        int x = 9;
        boolean simple = true;
            for (int i = 2; i < x; i++) {
                if ((x % i) == 0) {
                    simple = false;
                    break;
                }
            }
        if(simple==true)
            System.out.println("simple");
        else
            System.out.println("composite");
    }
}
