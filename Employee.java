// Employee.java
public class Employee {
    protected String name;
    protected double baseSalary;
    protected int overtimeHours;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.overtimeHours = 0;
    }

    public void work() {
        System.out.println(name + " is working.");
    }

    public double getSalary() {
        return baseSalary + (overtimeHours * 20); // Assume $20/hour for overtime
    }

    public void addOvertime(int hours) {
        overtimeHours += hours;
    }

    public void displayHierarchy() {
        System.out.println(name + " is a regular employee.");
    }
}
