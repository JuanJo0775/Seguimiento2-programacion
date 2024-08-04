package Student;

import javax.swing.*;
import java.awt.*;

public class MainStudentsGrades {
    public MainStudentsGrades() {
    }

    public static void main(String[] args) {
        double physics = Double.parseDouble(JOptionPane.showInputDialog("Enter the grade for Physics (0-10):"));
        double chemistry = Double.parseDouble(JOptionPane.showInputDialog("Enter the grade for Chemistry (0-10):"));
        double biology = Double.parseDouble(JOptionPane.showInputDialog("Enter the grade for Biology (0-10):"));
        double mathematics = Double.parseDouble(JOptionPane.showInputDialog("Enter the grade for Mathematics (0-10):"));
        double computerScience = Double.parseDouble(JOptionPane.showInputDialog("Enter the grade for Computer Science (0-10):"));
        StudentGrades student = new StudentGrades(physics, chemistry, biology, mathematics, computerScience);
        double average = student.calculateAverage();
        String grade = student.determineGrade(average);
        JOptionPane.showMessageDialog((Component)null, "Average: " + average + "\nGrade: " + grade);
    }
}