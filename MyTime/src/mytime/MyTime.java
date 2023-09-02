package mytime;

public class MyTime {

    private int hours;
    private int minutes;
    private int seconds;
    private boolean meridean;

    public MyTime(int hours, int minutes, int seconds, boolean meridean) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.meridean = meridean;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean getMeridean() {
        return meridean;
    }

    public void advanceTime(int seconds) {
        int totalSeconds = this.seconds + seconds;
        this.seconds = totalSeconds % 60;

        int totalMinutes = this.minutes + totalSeconds / 60;
        this.minutes = totalMinutes % 60;

        int totalHours = this.hours + totalMinutes / 60;
        this.hours = totalHours % 12;

        if (totalHours >= 12) {
            this.meridean = !this.meridean;
        }
    }

    public void tickBySecond() {
        advanceTime(60);
    }

    public void tickByMinute() {
        advanceTime(3600);
    }

    public void tickByHour() {
        advanceTime(3600);
    }

    public void displayTime12() {
        String merideanStr = meridean ? "PM" : "AM";
        System.out.printf("%02d:%02d:%02d %s%n", hours, minutes, seconds, merideanStr);
    }

    public void displayTime24() {
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }
}
