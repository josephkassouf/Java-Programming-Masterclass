public class Person {

    // Instance Variables
    private String firstName;
    private String lastName;
    private int age;

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String first) {
        this.firstName = first;
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
        if (age < 0 || age > 100) age = 0;
        this.age = age;
    }

    // Methods
    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) return "";
        if (lastName.isEmpty()) return firstName;
        if (firstName.isEmpty()) return lastName;

        return firstName + " " + lastName;
    }

}
