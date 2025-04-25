// MainVehicle.java
public class MainVehicle {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.drive();
        System.out.println(v.checkEngineStatus());

        Car c = new Car(4.0, 0.08);
        c.drive();
        c.checkFuelLevel();
        System.out.println(c.checkEngineStatus());
        System.out.println("Trip cost for 100 km at $1.5/litre: $" + c.calculateTripCost(100, 1.5));
    }
}
