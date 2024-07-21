package Ejercicio7;

import java.util.Scanner;

public class ClaimMain {
    public static void main(String[] args) {
        Claim c1 = new Claim();
        Scanner sc = new Scanner(System.in);

        c1.setName(sc.nextLine());
        c1.setAsubject(sc.nextLine());
        c1.setDescription(sc.nextLine());

        c1.ValidateStatus();
        c1.message();
    }
}
