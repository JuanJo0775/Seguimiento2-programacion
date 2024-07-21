package Ejercicio11;

import java.util.Scanner;

public class OddOrEvenMain {
    public static void main(String[] args) {
        OddOrEven o1 = new OddOrEven();
        Scanner sc = new Scanner(System.in);

        o1.setX(sc.nextInt());

        o1.number();
    }
}
