package GameOf21;
import java.util.Scanner;

public class MaingameOf21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameOf21 game = new GameOf21();

        game.dealInitialCards();
        System.out.println("User's initial total: " + game.getUserTotal());

        System.out.print("Do you want to draw another card? (yes/no): ");
        String response = scanner.nextLine();

        while (response.equalsIgnoreCase("yes")) {
            game.addUserCard();
            System.out.println("User's new total: " + game.getUserTotal());
            if (game.getUserTotal() > 21) {
                break;
            }
            System.out.print("Do you want to draw another card? (yes/no): ");
            response = scanner.nextLine();
        }

        game.addComputerCard();
        System.out.println("Computer's total: " + game.getComputerTotal());

        System.out.println(game.determineWinner());
    }
}
