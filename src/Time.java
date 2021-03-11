public class Time {

    private int hour;
    private int minute;
    private int second;
    public int nextsecond;
    public int nextminute;
    public int nexthour;
    private int singleHour;
    private int singleMinute;
    private int singleSecond;


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
        return nextSecond();
    }

    public String nextSecond() {

        for (second = 0; second < 61; second++) {
            if (hour >= 0 && hour < 10) {
                System.out.print("\n0" + hour);
            } else if (hour >= 10 && hour <= 23) {
                System.out.print("\n" + hour);
            }
            if (minute >= 0 && minute < 10) {
                System.out.print(":0" + minute);
            } else if (minute >= 10 && minute <= 59) {
                System.out.print(":" + minute);
            }
            if (second == 60) {
                second = 0;
                minute++;
            }
            if (second >= 0 && second < 10) {
                System.out.print(":0" + second);
            } else if (second >= 10 && second <= 59) {
                System.out.print(":" + second);
            }
            else {
                System.out.print(":invalid number");
            }

        } return nextSecond();
    }
}







//for (minute = 0; minute < 61; ) {
  //      if (minute == 60) {
    //    minute = 0;
      //  hour++;