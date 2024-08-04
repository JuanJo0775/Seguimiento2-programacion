package Operator;


public class Operator {
    private String name;
    private double fixedCharge;
    private double internationalMinuteRate;
    private double dataPackageRate;

    public Operator(String name, double fixedCharge, double internationalMinuteRate, double dataPackageRate) {
        this.name = name;
        this.fixedCharge = fixedCharge;
        this.internationalMinuteRate = internationalMinuteRate;
        this.dataPackageRate = dataPackageRate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFixedCharge() {
        return fixedCharge;
    }

    public void setFixedCharge(double fixedCharge) {
        this.fixedCharge = fixedCharge;
    }

    public double getInternationalMinuteRate() {
        return internationalMinuteRate;
    }

    public void setInternationalMinuteRate(double internationalMinuteRate) {
        this.internationalMinuteRate = internationalMinuteRate;
    }

    public double getDataPackageRate() {
        return dataPackageRate;
    }

    public void setDataPackageRate(double dataPackageRate) {
        this.dataPackageRate = dataPackageRate;
    }

    public double calculateTotalCost(int internationalMinutes) {
        return this.fixedCharge + this.internationalMinuteRate * (double)internationalMinutes + this.dataPackageRate;
    }

    public String getName() {
        return this.name;
    }
}
