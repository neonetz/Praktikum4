package Task_2;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Circle:");
        System.out.println("Radius = " + c1.getRadius());
        System.out.println("Area = " + c1.getArea());
        System.out.println("Perimeter = " + c1.getPerimeter());
        System.out.println(c1);

        Circle c2 = new Circle("Red", false, 3.0);
        System.out.println("Circle:");
        System.out.println("Radius = " + c2.getRadius());
        System.out.println("Area = " + c2.getArea());
        System.out.println("Perimeter = " + c2.getPerimeter());
        System.out.println(c2);
    }
}
