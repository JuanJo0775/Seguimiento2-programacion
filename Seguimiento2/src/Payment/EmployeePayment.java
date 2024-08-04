package Payment;

public class EmployeePayment {
    private String employeeCode;
    private double basicSalary;
    private double extrahours;
    private int numberOfHours;
    private double discount;
    private double loanDiscount;
    private double bonus;
    private double net;

    public EmployeePayment(String employeeCode, double basicSalary, double extrahours, int numberOfHours, double discount, double loanDiscount, double bonus) {
        this.employeeCode = employeeCode;
        this.basicSalary = basicSalary;
        this.extrahours = extrahours;
        this.numberOfHours = numberOfHours;
        this.discount = discount;
        this.loanDiscount = loanDiscount;
        this.bonus = bonus;
        this.net = 0.0;
    }

    public String getEmployeeCode() {
        return this.employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public double getBasicSalary() {
        return this.basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getExtrahours() {
        return this.extrahours;
    }

    public void setExtrahours(double extrahours) {
        this.extrahours = extrahours;
    }

    public int getNumberOfHours() {
        return this.numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public double getDiscount() {
        return this.discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getLoanDiscount() {
        return this.loanDiscount;
    }

    public void setLoanDiscount(double loanDiscount) {
        this.loanDiscount = loanDiscount;
    }

    public double getBonus() {
        return this.bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getNet() {
        return this.net;
    }

    public void setNet(double net) {
        this.net = net;
    }

    public double calculateExtraHoursValue() {
        return this.extrahours * (double)this.numberOfHours;
    }

    public double calculateEarned() {
        return this.basicSalary + this.calculateExtraHoursValue();
    }

    public double calculateDeducted() {
        return this.discount + this.loanDiscount;
    }

    public double calculateNet() {
        this.net = this.calculateEarned() - this.calculateDeducted() + this.bonus;
        return this.net;
    }
}
