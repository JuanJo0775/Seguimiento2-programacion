package Ejercicio17;

import java.util.Scanner;

public class CopyMian {
    public static void main(String[] args) {
        Copy c1 = new Copy();
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert the number of copies");

        c1.setNumbers_copy(sc.nextInt());
        c1.price();
    }
}
