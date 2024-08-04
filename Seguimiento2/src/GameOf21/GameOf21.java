package GameOf21;

import java.util.Random;

public class GameOf21 {
    private int userTotal;
    private int computerTotal;
    private Random rand;

    public GameOf21() {
        userTotal = 0;
        computerTotal = 0;
        rand = new Random();
    }

    public int getUserTotal() {
        return userTotal;
    }

    public void setUserTotal(int userTotal) {
        this.userTotal = userTotal;
    }

    public int getComputerTotal() {
        return computerTotal;
    }

    public void setComputerTotal(int computerTotal) {
        this.computerTotal = computerTotal;
    }

    public void dealInitialCards() {
        userTotal += drawCard();
        userTotal += drawCard();
        computerTotal += drawCard();
        computerTotal += drawCard();
    }

    public void addUserCard() {
        userTotal += drawCard();
    }

    public void addComputerCard() {
        computerTotal += drawCard();
    }

    public int drawCard() {
        return rand.nextInt(10) + 1;
    }

    public String determineWinner() {
        if (userTotal > 21 && computerTotal > 21) {
            return "No winner, both exceeded 21!";
        } else if (userTotal > 21) {
            return "Computer wins!";
        } else if (computerTotal > 21) {
            return "User wins!";
        } else if (userTotal > computerTotal) {
            return "User wins!";
        } else if (computerTotal > userTotal) {
            return "Computer wins!";
        } else {
            return "It's a tie!";
        }
    }
}
