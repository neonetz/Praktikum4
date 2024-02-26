package Task_1;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
        super(); // call superclass no-arg constructor Task_1.Circle()
        height = 1.0;
    }
    // Constructor with default radius, color but given height
    public Cylinder(double height) {

        super(); // call superclass no-arg constructor Task_1.Circle()
        this.height = height;
    }
    // Constructor with default color, but given radius, height
    public Cylinder(double radius, double height) {
        super(radius); // call superclass constructor Task_1.Circle(r)
        this.height = height;
    }

    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }

    // A public method for computing the volume of cylinder
    // use superclass method getArea() to get the base area
    public double getVolume() {
        return getArea()*height;
    }

    @Override
    public double getArea(){
        return super.getArea()*2+2*Math.PI*getRadius()*height;
    }

    @Override
    public String toString() { // in Task_1.Cylinder class
        return "Task_1.Cylinder: subclass of " + super.toString() // use Task_1.Circle's toString()
                + " height=" + height;
    }

}


