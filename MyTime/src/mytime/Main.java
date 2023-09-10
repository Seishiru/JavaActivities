package mytime;

public class Main {
    public static void main(String[] args) {
        MyTime time = new MyTime(17, 58, 50, true);

        System.out.println("Initial 12-hour format:");
        time.displayTime12();
        System.out.println("Initial 24-hour format:");
        time.displayTime24();

        time.tickBySecond();
        System.out.println("Time after ticking by one second:");
        time.displayTime12();

        time.tickByHour();
        System.out.println("Time after ticking by one hour:");
        time.displayTime12();
    }
}
