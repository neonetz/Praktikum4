package Task_2;

public class Square extends Rectangle{
    public Square(double side) {
        super(side, side); // Call superclass Rectangle(double, double)
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }
    public double getSide(){
        return super.getLength();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side= " + getSide() + " , which is a subclass of " + super.toString();
    }



}

