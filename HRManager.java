// HRManager.java
public class HRManager extends Employee {

    public HRManager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public void work() {
        System.out.println(name + " is managing HR operations.");
    }

    public void addEmployee(String newEmployeeName) {
        System.out.println("Adding new employee: " + newEmployeeName);
    }

    public void scheduleInterview(String candidateName) {
        System.out.println("Scheduling interview for: " + candidateName);
    }

    public void requestSalaryIncrement(double amount) {
        baseSalary += amount;
        System.out.println(name + "'s salary increased by $" + amount);
    }

    @Override
    public void displayHierarchy() {
        System.out.println(name + " is the HR Manager.");
    }
}
