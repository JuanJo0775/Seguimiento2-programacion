package Operator;

import javax.swing.*;
import java.awt.*;

public class MainOperator {
    public MainOperator() {
    }

    public static void main(String[] args) {
        Operator tigo = new Operator("Tigo", 45000.0, 200.0, 12000.0);
        Operator claro = new Operator("Claro", 30000.0, 100.0, 18000.0);
        Operator movistar = new Operator("Movistar", 40000.0, 250.0, 8000.0);
        String[] options = new String[]{"Tigo", "Claro", "Movistar"};
        String operatorName = (String) JOptionPane.showInputDialog((Component)null, "Choose your operator:", "Operator Selection", 3, (Icon)null, options, options[0]);
        int internationalMinutes = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of international minutes consumed:"));
        Operator selectedOperator;
        switch (operatorName) {
            case "Claro":
                selectedOperator = claro;
            case "Movistar":
                selectedOperator = movistar;
            default:
                selectedOperator = tigo;
        }

        double totalCost = selectedOperator.calculateTotalCost(internationalMinutes);
        String message = String.format("Operator: %s\nInternational Minutes: %d\nTotal Cost: $%.2f", selectedOperator.getName(), internationalMinutes, totalCost);
        JOptionPane.showMessageDialog((Component)null, message);
    }
}
