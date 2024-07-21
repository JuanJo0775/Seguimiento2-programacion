package Ejercicio11;

public class OddOrEven {


        public int x;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }


        public void number() {
            if (getX() %2 == 0) {
                System.out.println("The number " + getX() + " is even");
            } else if (getX() %2 != 0) {
                System.out.println("The number " + getX() + " is odd");
            }
        }

    @Override
    public String toString() {
        return "OddOrEven{" +
                "x=" + x +
                '}';
    }
}
