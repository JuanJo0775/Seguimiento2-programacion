package Ejercicio1;

public class User {

    String BaseUser = "Juan";
    String EnteredUser;
    String BasePassword = "1234";
    String EnteredPassword;
    Boolean SystemStatus = false;

    public String getBaseUser() {
        return BaseUser;
    }

    public void setBaseUser(String baseUser) {
        BaseUser = baseUser;
    }

    public String getEnteredUser() {
        return EnteredUser;
    }

    public void setEnteredUser(String enteredUser) {
        EnteredUser = enteredUser;
    }

    public String getBasePassword() {
        return BasePassword;
    }

    public void setBasePassword(String basePassword) {
        BasePassword = basePassword;
    }

    public String getEnteredPassword() {
        return EnteredPassword;
    }

    public void setEnteredPassword(String enteredPassword) {
        EnteredPassword = enteredPassword;
    }

    public Boolean getSystemStatus() {
        return SystemStatus;
    }

    public void setSystemStatus(Boolean systemStatus) {
        SystemStatus = systemStatus;
    }

    public String validateStatus() {
        if ((getBaseUser().equals(getEnteredUser())) && (getBasePassword().equals(getEnteredPassword()))) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
        return "";
    }

    public Boolean allowAccess() {
        if (validateStatus().equals("Login successful")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "BaseUser='" + BaseUser + '\'' +
                ", EnteredUser='" + EnteredUser + '\'' +
                ", BasePassword='" + BasePassword + '\'' +
                ", EnteredPassword='" + EnteredPassword + '\'' +
                ", SystemStatus=" + SystemStatus +
                '}';
    }
}
