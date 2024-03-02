package Task_2;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("Rectangle:");
        System.out.println("Width = " + r1.getWidth());
        System.out.println("Length = " + r1.getLength());
        System.out.println("Area = " + r1.getArea());
        System.out.println("Perimeter = " + r1.getPerimeter());
        System.out.println(r1);

        Rectangle r2 = new Rectangle("Blue", true, 4.0, 5.0);
        System.out.println("Rectangle:");
        System.out.println("Width = " + r2.getWidth());
        System.out.println("Length = " + r2.getLength());
        System.out.println("Area = " + r2.getArea());
        System.out.println("Perimeter = " + r2.getPerimeter());
        System.out.println(r2);
    }
}
