package itacademy.Lesson4;

import java.util.Arrays;

public class Task2Massiv {
    public static void main(String[] args) {
        double [][]a = {{3.5,2.2,5.9},{4.1,9.2,1.7},{3.3,5.9,6.6}};
        System.out.println(Arrays.deepToString(a));
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[i].length; j++){
                a[i][j] = (int)Math.round(a[i][j]);
            }
        }
        System.out.println(Arrays.deepToString(a));
    }
}
