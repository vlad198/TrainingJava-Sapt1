package circle;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c);

        Circle c1 = new Circle(2);
        System.out.println(c1);

        Circle c2 = new Circle(3,"green");
        System.out.println(c2);

        c.setColor("black");
        c.setRadius(10);

        System.out.println(c);
        System.out.println("c2 -> Area : " + c2.getArea());
    }
}
