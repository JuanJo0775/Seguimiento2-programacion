package Ejercicio15;

public class Gym {
    public Gym(int time) {
        this.time = time;
    }
    public Gym(){

    }

    int days15 = 18000;
    int days30 = 35000;
    int months3 = 86000;

    int time;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void monthly(){
        if ( this.time == 15){
            System.out.println("Must pay "+days15);
        } else if (this.time == 30) {
            System.out.println("Must pay "+days30);
        } else if (this.time == 3) {
            System.out.println("Must pay "+months3);
        }else {
            System.out.println("Not a valid time period");
        }
    }

    @Override
    public String toString() {
        return "Gym{" +
                "days15=" + days15 +
                ", days30=" + days30 +
                ", months3=" + months3 +
                ", time=" + time +
                '}';
    }
}
