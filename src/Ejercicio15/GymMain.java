package Ejercicio15;

import java.util.Scanner;

public class GymMain {
    public static void main(String[] args) {
        Gym g1 = new Gym();
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a period of time");
        System.out.println("15 days");
        System.out.println("30 days");
        System.out.println("3 months");

        g1.setTime(sc.nextInt());
        g1.monthly();
    }


}
