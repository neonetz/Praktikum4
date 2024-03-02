package Task_2;

public class TestSquare {
    public static void main(String[] args) {
        Square square1 = new Square(5.0);
        System.out.println("Square 1:");
        System.out.println("Area: " + square1.getArea());
        System.out.println("Perimeter: " + square1.getPerimeter());
        System.out.println(square1.toString());

        Square square2 = new Square("blue", false, 3.0);
        System.out.println("\nSquare 2:");
        System.out.println("Area: " + square2.getArea());
        System.out.println("Perimeter: " + square2.getPerimeter());
        System.out.println(square2.toString());
    }
}
