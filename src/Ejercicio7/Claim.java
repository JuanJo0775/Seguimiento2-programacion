package Ejercicio7;

public class Claim {
    int ClaimNumber = 000;
    String Name;
    String Subject;
    String Description;
    String Status = "In process";

    public void ValidateStatus (){
        System.out.println(ClaimNumber);
        System.out.println("Subject: " + Subject);
        System.out.println("Descripion: " + Description);
        System.out.println(Status);
    }

    public void message (){
        System.out.println("Your claim will be reviewed. Thank you.");
    }

    public int getClaimNumber() {
        return ClaimNumber;
    }

    public void setClaimNumber(int claimNumber) {
        ClaimNumber = claimNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSubject() {
        return Subject;
    }

    public void setAsubject(String subject) {
        Subject = subject;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getStatus() {
        return Status;
    }

    public void setState(String state) {
        Status = state;
    }

    @Override
    public String toString() {
        return "Claim{" +
                "ClaimNumber=" + ClaimNumber +
                ", Name='" + Name + '\'' +
                ", Subject='" + Subject + '\'' +
                ", Description='" + Description + '\'' +
                ", Status='" + Status + '\'' +
                '}';
    }
}
