package db.srp.solution;

public class PaySlipPrinter {
    public void printPaySlip(Employee employee) {
        System.out.println("PaySlip");
        System.out.println("Name: " + employee.getName());
        System.out.println("Total: " + employee.getSalary());
    }
}
