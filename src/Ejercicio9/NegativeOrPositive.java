package Ejercicio9;

public class NegativeOrPositive {

    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }


    public void number() {
        if (getX() > 0) {
            System.out.println("The number " + getX() + " is positive");
        } else if (getX() < 0) {
            System.out.println("The number " + getX() + " is negative");
        } else {
            System.out.println("The number " + getX() + " is zero");
        }
    }

    @Override
    public String toString() {
        return "NegativeOrPositive{" +
                "x=" + x +
                '}';
    }
}
