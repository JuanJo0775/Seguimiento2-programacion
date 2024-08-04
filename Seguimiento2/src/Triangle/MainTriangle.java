package Triangle;

import javax.swing.*;
import java.awt.*;

public class MainTriangle {
    public MainTriangle() {
    }

    public static void main(String[] args) {
        int angle1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first angle:"));
        int angle2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second angle:"));
        int angle3 = Integer.parseInt(JOptionPane.showInputDialog("Enter the third angle:"));
        Triangle triangleValidator = new Triangle(angle1, angle2, angle3);
        boolean isValid = triangleValidator.isValidTriangle();
        String message = isValid ? "The angles form a valid triangle." : "The angles do not form a valid triangle.";
        JOptionPane.showMessageDialog((Component)null, message);
    }
}