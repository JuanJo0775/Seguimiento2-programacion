package Ejercicio11;

public class OddOrEven {
    public OddOrEven(int x) {
        this.x = x;
    }
    public OddOrEven(){}

    public int x;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }


        public void number() {
            if (this.x %2 == 0) {
                System.out.println("The number " + this.x + " is even");
            } else if (this.x %2 != 0) {
                System.out.println("The number " + this.x + " is odd");
            }
        }

    @Override
    public String toString() {
        return "OddOrEven{" +
                "x=" + x +
                '}';
    }
}
