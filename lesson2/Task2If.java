package itacademy.lesson2;

public class Task2If {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int r = 4;
        double diag = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        if(2*r>=diag)
            System.out.println("Can close");
        else
            System.out.println("Can't close");
    }
}
