package Ejercicio7;

import java.util.Scanner;

public class ClaimMain {
    public static void main(String[] args) {
        Claim c1 = new Claim("juan", "porque si", "quiero dormir");


        c1.ValidateStatus();
        c1.message();
    }
}
