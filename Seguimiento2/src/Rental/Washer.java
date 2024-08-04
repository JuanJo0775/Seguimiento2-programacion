package Rental;

public class Washer {
    private int type;
    private int hours;

    public Washer(int type, int hours) {
        this.type = type;
        this.hours = hours;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double calculateCost() {
        int rate = (type == 1) ? 4000 : 3000;
        return rate * hours;
    }
}
