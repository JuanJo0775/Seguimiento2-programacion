package Ejercicio21;

import java.util.Scanner;

public class SandwichOrder {

        private static final int SMALL_SANDWICH_PRICE = 6000;
        private static final int LARGE_SANDWICH_PRICE = 12000;


        private static final int BACON_PRICE = 3000;
        private static final int TURKEY_PRICE = 3000;
        private static final int CHEESE_PRICE = 2500;
        private static final int JALAPENO_PRICE = 0; // Gratis


        public int calculateTotalCost(String size, boolean addBacon, boolean addJalapeno, boolean addTurkey, boolean addCheese) {
            int totalCost = 0;

            // Determinar el precio base según el tamaño
            if (size.equalsIgnoreCase("pequeño")) {
                totalCost += SMALL_SANDWICH_PRICE;
            } else if (size.equalsIgnoreCase("grande")) {
                totalCost += LARGE_SANDWICH_PRICE;
            } else {
                throw new IllegalArgumentException("Tamaño no válido. Debe ser 'pequeño' o 'grande'.");
            }


            if (addBacon) {
                totalCost += BACON_PRICE;
            }
            if (addJalapeno) {
                totalCost += JALAPENO_PRICE;
            }
            if (addTurkey) {
                totalCost += TURKEY_PRICE;
            }
            if (addCheese) {
                totalCost += CHEESE_PRICE;
            }

            return totalCost;
        }


        public void takeOrder() {
            Scanner scanner = new Scanner(System.in);


            System.out.println("Ingrese el tamaño del sándwich (pequeño o grande):");
            String size = scanner.nextLine();


            System.out.println("¿Desea agregar tocineta? (si/no):");
            boolean addBacon = scanner.nextLine().equalsIgnoreCase("si");

            System.out.println("¿Desea agregar jalapeño? (si/no):");
            boolean addJalapeno = scanner.nextLine().equalsIgnoreCase("si");

            System.out.println("¿Desea agregar pavo? (si/no):");
            boolean addTurkey = scanner.nextLine().equalsIgnoreCase("si");

            System.out.println("¿Desea agregar queso? (si/no):");
            boolean addCheese = scanner.nextLine().equalsIgnoreCase("si");


            int totalCost = calculateTotalCost(size, addBacon, addJalapeno, addTurkey, addCheese);
            System.out.println("El costo total de su pedido es: $" + totalCost);

            scanner.close();
        }
    }


