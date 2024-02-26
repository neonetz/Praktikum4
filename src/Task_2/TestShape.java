package Task_2;

public class TestShape {
    public static void main(String[] args) {
        Shape c1 = new Shape();
        System.out.println("Shape :" + "Color = " + c1.getColor() + " Is Filled = " + c1.isFilled());
        System.out.println(c1);

        Shape c2 = new Shape("Red",false);
        System.out.println("Shape :" + "Color = " + c2.getColor() + " Is Filled = " + c2.isFilled());
        System.out.println(c2);
    }
}
