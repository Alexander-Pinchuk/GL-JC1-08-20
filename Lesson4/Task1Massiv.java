package itacademy.Lesson4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Task1Massiv {
    public static void main(String[] args) {
        int [] a = new int[7];
            for (int i = 0; i< a.length; i++){
            a[i] = (int)(Math.random()*10);
        }
       System.out.print(Arrays.toString(a));
            for (int i = a.length-1; i>0 ; i--) {
                for (int j = 0; j < i; j++) {
                    if (a[j] > a[j + 1]) {
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
        System.out.println();
        for(int k = 0 ; k<a.length; k++) {
            System.out.print(a[k] + " ");
        }
        System.out.println("\n" + Arrays.toString(a));
    }
}
