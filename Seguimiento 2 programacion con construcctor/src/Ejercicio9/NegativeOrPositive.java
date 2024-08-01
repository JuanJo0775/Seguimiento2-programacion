package Ejercicio9;

public class NegativeOrPositive {
    public NegativeOrPositive(int x) {
        this.x = x;
    }
    public NegativeOrPositive(){}

    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }


    public void number() {
        if (getX() > 0) {
            System.out.println("The number " + this.x + " is positive");
        } else if (this.x < 0) {
            System.out.println("The number " + this.x + " is negative");
        } else {
            System.out.println("The number " + this.x + " is zero");
        }
    }

    @Override
    public String toString() {
        return "NegativeOrPositive{" +
                "x=" + x +
                '}';
    }
}
