package Ejercicio13;

public class MajorMinor {
    int x;
    int y;
    int z;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void max (){
        int max = getX();

        if (getY() > max) {
            max = getY();
        }

        if (getZ()> max) {
            max = getZ();
        }
        System.out.println("The largest number is: " + max);
    }

    @Override
    public String toString() {
        return "MajorMinor{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
