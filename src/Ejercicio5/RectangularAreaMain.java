package Ejercicio5;

import java.util.Scanner;

public class RectangularAreaMain {
    public static void main(String[] args) {
        RectangularArea n1 = new RectangularArea();
        Scanner sc = new Scanner(System.in);
        n1.setHeight(sc.nextInt());
        n1.setBase(sc.nextInt());

        n1.validateData();
        n1.area();

    }
}
