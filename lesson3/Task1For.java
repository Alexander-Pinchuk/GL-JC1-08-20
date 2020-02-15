package itacademy.lesson3;

public class Task1For {
    public static void main(String[] args) {
        int x = 7;
        for(int i = 2; i<x; i++){
            if(x%i==0){
                System.out.printf("Number %d is composite", x);
                return;
            }
        }
        System.out.printf("%d is simple",x);
    }
}
