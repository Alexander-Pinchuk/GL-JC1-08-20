package itacademy.lesson6.time;

public class Time{
    private int seconds;
    private int minutes;
    private int hours;
    private int secondsAll;

    public void timeToSeconds(){
        secondsAll = seconds + minutes*60 + hours*3600;
        System.out.printf("Seconds in time: %d\n",secondsAll);
    }

        @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(secondsAll);
        return str.toString();
    }


    public Time(int secondsAll) {
        this.secondsAll = secondsAll;
    }

    public Time(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getSecondsAll() {
        return secondsAll;
    }
}
