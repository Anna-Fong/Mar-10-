public class Main {
    public static void main(String[] args) {

        Time time = new Time(0, 0, 0);

        time.setHour(5);
        time.setMinute(2);
        time.setSecond(41);

        System.out.println(time);

    }
}


/*
System.out.println(time.getHour());
System.out.println(time.getMinute());
System.out.println(time.getSecond());
*/