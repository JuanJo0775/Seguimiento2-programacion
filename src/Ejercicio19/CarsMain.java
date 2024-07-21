package Ejercicio19;

import java.util.Scanner;

public class CarsMain {
    public static void main(String[] args) {
        Cars c1 = new Cars();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the model number of your car:");
        c1.setModelNumber(sc.nextInt());
        c1.checkCarModel();
    }
}
