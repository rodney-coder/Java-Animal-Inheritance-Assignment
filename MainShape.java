// MainShape.java
public class MainShape {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5.0, 5.0, "Blue");
        System.out.println("Area: " + r.getArea());
        System.out.println("Is square? " + r.isSquare());
        r.displayColor();
        r.resize(1.5);
        System.out.println("New area after resize: " + r.getArea());
    }
}
