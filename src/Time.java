public class Time {

    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int theHour) {
        hour = theHour;
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int theMinute) {
        minute = theMinute;
    }

    public int getMinute() {
        return minute;
    }

    public void setSecond(int theSecond) {
        second = theSecond;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void getTime(int hour, int minute, int second) {
        return;
    }

    public String toString() {
//hour
        for(hour >= 0 && hour <=23
                && minute >= 0 && minute <= 59
                && second >= 0 && second <= 59) 
        {
            if (hour >= 0 && hour <= 9) {
                System.out.print("\n0" + hour + " ");
            } else if (hour <= 0 || hour >= 24) {
                System.out.print("\nInvalid hour");
            } else {
                System.out.print("\n" + hour + " ");
            }
//minute
            if (minute >= 0 && minute <= 9) {
                System.out.print("0" + minute + " ");
            } else if (minute <= 0 || minute >= 60) {
                System.out.print("Invalid minute");
            } else {
                System.out.print(minute + " ");
            }
//second
            if (second >= 0 && second <= 9) {
                System.out.print("0" + second + " ");
            } else if (second <= 0 || second >= 60) {
                System.out.print("Invalid second");
            } else {
                System.out.print(second + " ");
            }
            break;
        }
        return toString();
    }

    public String nextSecond() {
        while (second < 60) {
            second++;
        }
        while (second == 60) {
            second = 0;
            minute++;
        }
        while (minute == 60) {
            minute = 0;
            hour++;
        }
        while (hour == 24) {
            hour = 0;
        }
        System.out.println(nextSecond());
        return hour + " " + minute + " " + second;
    }
}





