public class Time {

    private int hour;
    private int minute;
    private int second;
    boolean validTime = true;

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

    // return currentTime() to display the time
    // return nextSecond() for time to continuously increase by one second
    // return previousSecond() for time to continuously decrease by one second
    public String toString() {
        return previousSecond();
    }

    public String currentTime() {
        if (hour < 0 || hour > 24 || minute < 0 || minute > 59 || second < 0 || second > 59) {
            System.out.println("invalid time");
        } else {
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
            if (second >= 0 && second < 10) {
                System.out.print(":0" + second);
            } else if (second >= 10 && second <= 59) {
                System.out.print(":" + second);
            }
        }
        return "";
    }

    public String nextSecond() {

        while (validTime) {
            if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59) {
                for (second = second; second < 61; second++) {
                    if (second == 60) {
                        second = 0;
                        minute++;
                    }
                    if (minute == 60) {
                        minute = 0;
                        second = 0;
                        hour++;
                    }
                    if (hour == 24) {
                        hour = 0;
                        minute = 0;
                        second = 0;
                    }
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
                    if (second >= 0 && second < 10) {
                        System.out.print(":0" + second);
                    } else if (second >= 10 && second <= 59) {
                        System.out.print(":" + second);
                    }
                }

            } else if (hour < 0 || hour > 24 || minute < 0 || minute > 59 || second < 0 || second > 59) {
                validTime = false;
                System.out.println("invalid time");
            }
        }
        return ("");
    }

    public String previousSecond() {

        while (validTime) {
            if(hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59) {
                for (second = second; second > -2; second--) {
                    if (second == -1) {
                        second = 59;
                        minute--;
                    }
                    if (minute == -1) {
                        minute = 59;
                        second = 59;
                        hour--;
                    }
                    if (hour == -1) {
                        hour = 23;
                        minute = 59;
                        second = 59;
                    }

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
                    if (second >= 0 && second < 10) {
                        System.out.print(":0" + second);
                    } else if (second >= 10 && second <= 59) {
                        System.out.print(":" + second);
                    }
                }

                } else if (hour < 0 || hour > 24 || minute < 0 || minute > 59 || second < 0 || second > 59) {
                validTime = false;
                System.out.println("invalid time");
            }
        }
        return ("");
    }
}


