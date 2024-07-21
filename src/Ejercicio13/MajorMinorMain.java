package Ejercicio13;

import java.util.Scanner;

public class MajorMinorMain {
    public static void main(String[] args) {
        MajorMinor m1 = new MajorMinor();
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert numbers");
        m1.setX(sc.nextInt());
        m1.setY(sc.nextInt());
        m1.setZ(sc.nextInt());

        m1.max();
    }
}
