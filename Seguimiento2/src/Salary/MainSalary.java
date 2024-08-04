package Salary;

import java.util.Scanner;

public class MainSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the employee's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the number of hours worked: ");
        int hoursWorked = scanner.nextInt();

        Salary employee = new Salary(name, hoursWorked);

        double salary = employee.calculateSalary();

        System.out.println("Mr./Ms. " + employee.getName() + ", the number of hours is " + employee.getHoursWorked() + " and your salary equals " + salary);
    }
}
