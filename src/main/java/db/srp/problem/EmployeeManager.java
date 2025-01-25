package db.srp.problem;

public class EmployeeManager {

    public Employee getEmployee(int id) {
        // Do some DB operation
        return new Employee("Ezzat Mohamed", 2200d);
    }

    public void printPaySlip(Employee employee) {
        System.out.println("Payslip");
        System.out.println("Name: " + employee.getName());
        System.out.println("Total: " + employee.getSalary());
    }
}
