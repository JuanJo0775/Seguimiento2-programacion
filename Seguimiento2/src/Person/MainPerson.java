package Person;

import javax.swing.*;
import java.awt.*;

public class MainPerson {
    public MainPerson() {
    }

    public static void main(String[] args) {
        String gender = JOptionPane.showInputDialog("Enter the gender (male/female):");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter the age:"));
        Person person = new Person(gender, age);
        double supportAmount = person.calculateSupport();
        JOptionPane.showMessageDialog((Component)null, "Monthly support amount: $" + supportAmount);
    }
}
