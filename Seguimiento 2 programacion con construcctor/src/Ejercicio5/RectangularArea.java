package Ejercicio5;

public class RectangularArea {
    public RectangularArea(int base, int height) {
        this.base = base;
        this.height = height;
    }
    public RectangularArea (){}

    int base;
    int height;

    public void validateData() {
        System.out.println(base);
        System.out.println(height);
    }

    public void area() {
        int total = this.base * this.height;
        System.out.println(total);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "RectangularArea{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
