package chapter10_ObjectOrientedThinking.exercises;

public class Exercises10_1_TheTimeClass {
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(555550000);

        System.out.println(time1.getHour() + ":" + time1.getMinute() +
                ":" + time1.getSecond());
        System.out.println(time2.getHour() + ":" + time1.getMinute() +
                ":" + time1.getSecond());
    }
}

class Time {

    private long hour;
    private long minute;
    private long second;

    Time() {
        this(0);
    }

    Time(long elapsedTime) {
        setTime(elapsedTime);
    }

    public Time(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public void setTime(long elapseTime) {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        second = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        minute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        hour = totalHours % 24;

        if (elapseTime > 0) {
            totalSeconds = elapseTime / 1000;
            second += totalSeconds % 60;
            totalMinutes = totalSeconds / 60;
            minute += totalMinutes % 60;
            totalHours = totalMinutes / 60;
            hour += totalHours % 24;
        }
    }
}
