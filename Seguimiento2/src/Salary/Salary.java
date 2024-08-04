package Salary;

public class Salary {
    private String name;
    private int hoursWorked;

    public Salary(String name, int hoursWorked) {
        this.name = name;
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        int rate = (hoursWorked <= 10) ? 30000 : 33000;
        return rate * hoursWorked;
    }
}
