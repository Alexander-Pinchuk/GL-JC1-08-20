package itacademy.lesson2;

public class Task5If {
    public static void main(String[] args) {
        int a = 4, b = 3;      //  first house
        int c = 2, d = 5;      //  second house
        int e = 9, f = 5;      //  site dimensions
        int max1 = 0, max2 = 0;
        int min1 = 0, min2 = 0;
        int max = 0, min = 0;

        if(a>b){
               max1 = a;
               min1 = b;
           }
           else {
               max1 = b;
               min1 = a;
           }
           if(c>d){
               max2 = c;
               min2 = d;
           }
           else{
               max2 = d;
               min2 = c;
           }

       max = max1 + max2;
       min = min1 + min2;

       if ((e>=max & f >= min) || f>= max & e>= min){
           System.out.println("Site contain the houses");
       }
       else
           System.out.println("Not contain");
    }
}
