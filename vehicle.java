// Vehicle.java
public class Vehicle {
    protected int speed;

    public Vehicle() {
        this.speed = 60;
    }

    public void drive() {
        System.out.println("Driving a vehicle.");
    }

    public String checkEngineStatus() {
        return "Engine status: OK.";
    }
}
