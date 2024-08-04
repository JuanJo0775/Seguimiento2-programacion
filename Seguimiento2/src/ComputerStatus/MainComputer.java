package ComputerStatus;

import javax.swing.*;
import java.awt.*;

public class MainComputer {
    public MainComputer() {
    }

    public static void main(String[] args) {
        int beepResponse = JOptionPane.showConfirmDialog((Component)null, "Does the computer beep on startup?", "Beep Check", 0);
        boolean beeps = beepResponse == 0;
        int spinResponse = JOptionPane.showConfirmDialog((Component)null, "Does the hard drive spin?", "Hard Drive Check", 0);
        boolean hardDriveSpins = spinResponse == 0;
        ComputerStatus computerStatus = new ComputerStatus(beeps, hardDriveSpins);
        String status = computerStatus.determineStatus();
        JOptionPane.showMessageDialog((Component)null, status);
    }
}