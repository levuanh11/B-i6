package Shape;

public class Main {
    public static void main(String[] args) {
        double side1 = 1.0;
        double side2 = 1.0;
        double side3 = 1.0;

        Triangle triangle = new Triangle("red",true,side1,side2,side3);
        System.out.println(triangle);
    }
}
