package itacademy.lesson10;

import java.util.*;

public class Race {
    public static void main(String[] args){
        final Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numberOfCars = 0;

        try {
        System.out.print("Enter number of cars: ");
        numberOfCars = sc.nextInt();
        }
        catch (InputMismatchException e) {
             System.out.println("Wrong enter. Try again");
        }

        ArrayList<Integer> startDistance = new ArrayList<Integer>();
        for (int i = 0; i<numberOfCars; i++){
            startDistance.add(random.nextInt(200));
            System.out.printf("Start position of %d racer is: %d%n",i+1,startDistance.get(i));
        }
        System.out.println("");
        ArrayList<Integer> speed = new ArrayList<Integer>();
        for (int i = 0; i<numberOfCars; i++){
            speed.add(random.nextInt(100));
            System.out.printf("Speed of %d racer is: %d%n",i+1,speed.get(i));
        }
        System.out.println("");
        for(int i = 0; i<numberOfCars; i++){
            for (int j = 0; j<numberOfCars; j++){
                int t = 1;
                while ((startDistance.get(i)+(speed.get(i)*t))<(startDistance.get(j)+(speed.get(j)*t))){
                    t++;
                    if ((startDistance.get(i)+speed.get(i)*t)>(startDistance.get(j)+speed.get(j)*t)){
                        System.out.printf("Racer %d overtook %d racer at ", i+1, j+1);
                        System.out.println("Distance: " + (startDistance.get(i) + speed.get(i)*t));
                    }
               }
            }
        }
    }
}
