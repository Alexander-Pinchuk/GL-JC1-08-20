package itacademy.lesson7.tech;

public class Technics {
    boolean powered = false;
    public void turnOn(){
        if(powered){
            System.out.println("Already turned on");
        }
        else{
            powered = true;
            System.out.println("Turn on");
        }
    }
    public void turnOff(){
        if(powered){
            System.out.println("Already turned off");
        }
        else{
            powered = false;
            System.out.println("Turned off");
        }
    }
}
