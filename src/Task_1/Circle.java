package Task_1;

public class Circle {
    private double radius;
    private String color;

    //Konstruktor
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    //Getter dari String Color
    public String getColor() {
        return color;
    }

    //Setter dari String Color
    public void setColor(String color) {
        this.color = color;
    }

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double r) {
        radius = r;
        color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return "Task_1.Circle[radius=" + "radius" + "color=" + color + "]";
    }
}