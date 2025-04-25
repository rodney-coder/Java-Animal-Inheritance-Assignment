// Shape.java
public class Shape {
    protected String color;

    public Shape() {
        this.color = "Undefined";
    }

    public double getArea() {
        return 0.0;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void displayColor() {
        System.out.println("Color: " + color);
    }
}
