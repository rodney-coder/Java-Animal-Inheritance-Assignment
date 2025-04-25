// MainEmployee.java
public class MainEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 5000);
        emp.work();
        emp.addOvertime(5);
        System.out.println("Total salary: $" + emp.getSalary());
        emp.displayHierarchy();

        HRManager hr = new HRManager("Jane Smith", 7000);
        hr.work();
        hr.addEmployee("Michael Okoro");
        hr.scheduleInterview("Grace Uche");
        hr.requestSalaryIncrement(500);
        System.out.println("Total salary after increment: $" + hr.getSalary());
        hr.displayHierarchy();
    }
}
