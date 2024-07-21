package Ejercicio9;

import java.util.Scanner;

public class NegativeOrPositiveMain {
    public static void main(String[] args) {
        NegativeOrPositive n1 = new NegativeOrPositive();
        Scanner sc = new Scanner(System.in);

        n1.setX(sc.nextInt());

        n1.number();
    }
}
