package Payment;


public class MainEmployeePayment {
    public MainEmployeePayment() {
    }

    public static void main(String[] args) {
        EmployeePayment employee = new EmployeePayment("E001", 1000.0, 20.0, 10, 50.0, 30.0, 100.0);
        System.out.println("Extra Hours Value: " + employee.calculateExtraHoursValue());
        System.out.println("Total Earned: " + employee.calculateEarned());
        System.out.println("Total Deducted: " + employee.calculateDeducted());
        System.out.println("Net Total: " + employee.calculateNet());
    }
}
