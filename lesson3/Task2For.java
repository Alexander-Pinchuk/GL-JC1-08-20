package itacademy.lesson3;

public class Task2For {
    public static void main(String[] args) {
        int x = 20023143;
        int s = 0;
        while(x != 0){
            x/=1000;
            s++;
        }
        x = 20023143;
        for(int i = s-1; i>=0; i--){
            int a=x/(int)(Math.pow(1000,i));
            if(i < s-1)
                System.out.printf("%03d ",a%1000);
            else
                System.out.printf("%d ", a%1000);
        }
    }

}