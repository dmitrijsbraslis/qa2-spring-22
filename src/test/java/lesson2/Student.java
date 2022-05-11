package lesson2;

public class Student {
    //--------------------ATTRIBUTES------------------
    private String firstName; // Student -> firstName
    private String lastName;
    private int age;
    private String personalCode;

    //--------------------GETTERS/SETTERS-------------
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) { //setFirstName -> firstName
        this.firstName = firstName; // this = этот метод
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }
}
