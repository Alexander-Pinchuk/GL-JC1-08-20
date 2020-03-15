package itacademy.lesson10iNotDone;

import java.util.*;

public class CherniYaschik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of numbers: ");
        int n = sc.nextInt();
        ArrayList<Integer> spisok = new ArrayList<Integer>();
        Random random = new Random();
        for(int i = 0; i<n; i++){
            spisok.add(random.nextInt(1000));
        }
        Collections.sort(spisok);
        System.out.println(spisok);
        int x = 0;
        try {
            System.out.println("Enter the index number: ");
            x = sc.nextInt();
        } catch (IndexOutOfBoundsException e){
            System.out.printf("Write the correct number. Between 0 and %d%n ", (n-1));
        }
        System.out.println(spisok.get(x));

    }
}