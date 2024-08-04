package Person;

public class Person {
    private String gender;
    private int age;

    public Person(String gender, int age) {
        this.gender = gender;
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double calculateSupport() {
        if (this.gender.equalsIgnoreCase("female")) {
            if (this.age > 50) {
                return 120000.0;
            }

            if (this.age >= 30 && this.age <= 50) {
                return 100000.0;
            }
        } else if (this.gender.equalsIgnoreCase("male")) {
            return 40000.0;
        }

        return 0.0;
    }
}