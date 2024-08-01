package Ejercicio21;

import java.util.Scanner;

public class SandwichOrder {

    private static final int SMALL_SANDWICH_PRICE = 6000;
    private static final int LARGE_SANDWICH_PRICE = 12000;

    private static final int BACON_PRICE = 3000;
    private static final int TURKEY_PRICE = 3000;
    private static final int CHEESE_PRICE = 2500;
    private static final int JALAPENO_PRICE = 0; // Gratis

    private String size;
    private boolean addBacon;
    private boolean addJalapeno;
    private boolean addTurkey;
    private boolean addCheese;

    // Constructor
    public SandwichOrder(String size, boolean addBacon, boolean addJalapeno, boolean addTurkey, boolean addCheese) {
        this.size = size;
        this.addBacon = addBacon;
        this.addJalapeno = addJalapeno;
        this.addTurkey = addTurkey;
        this.addCheese = addCheese;
    }

    public SandwichOrder() {
    }

    public int calculateTotalCost() {
        int totalCost = 0;


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


}
