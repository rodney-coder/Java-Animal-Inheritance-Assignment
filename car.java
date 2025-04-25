// Car.java
public class Car extends Vehicle {
    private double fuelLevel; // in liters
    private double fuelConsumptionRate; // liters per km

    public Car(double fuelLevel, double fuelConsumptionRate) {
        super();
        this.speed = 100; // Car has higher speed
        this.fuelLevel = fuelLevel;
        this.fuelConsumptionRate = fuelConsumptionRate;
    }

    @Override
    public void drive() {
        System.out.println("Repairing a car.");
    }

    @Override
    public String checkEngineStatus() {
        return "Engine needs maintenance.";
    }

    public void checkFuelLevel() {
        if (fuelLevel < 5) {
            System.out.println("Warning: Low fuel level!");
        } else {
            System.out.println("Fuel level is sufficient.");
        }
    }

    public double calculateTripCost(double distance, double fuelPricePerLitre) {
        double fuelUsed = distance * fuelConsumptionRate;
        return fuelUsed * fuelPricePerLitre;
    }
}
