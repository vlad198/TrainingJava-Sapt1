package time;

public class Main {
    public static void main(String[] args) {
        Time time = new Time(23,59,59);
        System.out.println(time);

        System.out.println(time.nextSecond());
        System.out.println(time.previousSecond());
    }
}
