package Ejercicio17;

public class Copy {
    int copy_0_to_499 = 120;
    int copy_500_to_749 = 100;
    int copy_750_to_999 = 80;
    int copy_1000_to_more = 50;

    int numbers_copy;

    public int getNumbers_copy() {
        return numbers_copy;
    }

    public void setNumbers_copy(int numbers_copy) {
        this.numbers_copy = numbers_copy;
    }

    public void price(){
        if (getNumbers_copy()<500){
            int price = getNumbers_copy() * copy_0_to_499;
            System.out.println("Price per copy " +copy_0_to_499);
            System.out.println("Total price "+price);
        } else if ((getNumbers_copy()<750)&&(getNumbers_copy()>499)) {
            int price = getNumbers_copy() * copy_500_to_749;
            System.out.println("Price per copy " +copy_500_to_749);
            System.out.println("Total price "+price);
        } else if ((getNumbers_copy()<1000)&&(getNumbers_copy()>749)) {
            int price = getNumbers_copy() * copy_750_to_999;
            System.out.println("Price per copy " +copy_750_to_999);
            System.out.println("Total price "+price);
        } else if ((getNumbers_copy()>999)) {
            int price = getNumbers_copy() * copy_1000_to_more;
            System.out.println("Price per copy " +copy_1000_to_more);
            System.out.println("Total price "+price);
        }else {
            System.out.println("Invalid amount");
        }
    }

    @Override
    public String toString() {
        return "Copy{" +
                "copy_0_to_499=" + copy_0_to_499 +
                ", copy_500_to_749=" + copy_500_to_749 +
                ", copy_750_to_999=" + copy_750_to_999 +
                ", copy_1000_to_more=" + copy_1000_to_more +
                ", numbers_copy=" + numbers_copy +
                '}';
    }
}
