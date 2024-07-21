package Ejercicio1;

import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        User u1 = new User();

        Scanner sc = new Scanner(System.in);

        u1.setEnteredUser(sc.nextLine());
        u1.setEnteredPassword(sc.nextLine());

        u1.validateStatus();
        u1.allowAccess();



    }
}
