package itacademy.Lesson4;

import java.util.Arrays;

public class Task3Massiv {
    public static void main(String[] args) {
        int [][] a = {{3,2,9},
                      {5,12,25},
                      {7,63,4}};
        System.out.println(Arrays.deepToString(a));
        int max = a[0][0];
        int x = 0;
        int y = 0;
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[i].length; j++){
                if(a[i][j] > max){
                    max = a[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.printf("Максимальный элемент массива = %d с индексом [%d][%d]\n", max, x, y);

        for(int i = 0; i<a.length; i++) {                       //Необязательный блок кода
            for (int j = 0; j < a[i].length; j++) {
                if(i==x | j ==y){
                    a[i][j]=0;
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //System.out.println(Arrays.deepToString(a));

        int new_x = 0;
        int new_y = 0;
        for (int i =0;i<a.length;i++){
            if (i != x){
                for (int j=0;j<a.length;j++){
                    if (j!=y){
                        System.out.print(a[i][j]+" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
