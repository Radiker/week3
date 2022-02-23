package entities;

public abstract class AbstractUser {
    private String firstName;
    private String lastName;
    private String middleName;
    private String phone;

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    private String getFirstName() {
        return this.firstName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }
    private String getLastName() {
        return this.lastName;
    }

    private void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    private String getMiddleName() {
        return this.middleName;
    }

    private void setPhone(String phone) {
        this.phone = phone;
    }
    private String getPhone() {
        return this.phone;
    }

    public AbstractUser(){
        this.firstName = "Иван";
        this.lastName = "Иванов";
        this.middleName = "Иванович";
        this.phone = "88001234567";
    }

    public AbstractUser(String firstName, String lastName, String middleName, String phone){
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.phone = phone;
    }
}
