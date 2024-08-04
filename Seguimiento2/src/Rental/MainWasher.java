package Rental;

import java.util.Scanner;

public class MainWasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the type of washer (1 for large, 2 for small): ");
        int type = scanner.nextInt();

        System.out.print("Enter the number of rental hours: ");
        int hours = scanner.nextInt();

        System.out.print("Enter the number of washers rented: ");
        int quantity = scanner.nextInt();

        Washer washer = new Washer(type, hours);

        double totalCost = washer.calculateCost() * quantity;
        if (quantity > 3) {
            totalCost *= 0.97;
        }

        System.out.println("The total cost to pay is: " + totalCost);
    }
}

