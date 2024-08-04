package Student;

public class StudentGrades {
    private double physics;
    private double chemistry;
    private double biology;
    private double mathematics;
    private double computerScience;

    public StudentGrades(double physics, double chemistry, double biology, double mathematics, double computerScience) {
        this.physics = physics;
        this.chemistry = chemistry;
        this.biology = biology;
        this.mathematics = mathematics;
        this.computerScience = computerScience;
    }

    public double getPhysics() {
        return physics;
    }

    public void setPhysics(double physics) {
        this.physics = physics;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public double getBiology() {
        return biology;
    }

    public void setBiology(double biology) {
        this.biology = biology;
    }

    public double getMathematics() {
        return mathematics;
    }

    public void setMathematics(double mathematics) {
        this.mathematics = mathematics;
    }

    public double getComputerScience() {
        return computerScience;
    }

    public void setComputerScience(double computerScience) {
        this.computerScience = computerScience;
    }

    public double calculateAverage() {
        return (this.physics + this.chemistry + this.biology + this.mathematics + this.computerScience) / 5.0;
    }

    public String determineGrade(double average) {
        if (average < 6.0) {
            return "Poor";
        } else {
            return average <= 8.0 ? "Good" : "Very Good";
        }
    }
}
