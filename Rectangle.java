// Rectangle.java
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public boolean isSquare() {
        return width == height;
    }

    public void resize(double scaleFactor) {
        width *= scaleFactor;
        height *= scaleFactor;
    }
}
