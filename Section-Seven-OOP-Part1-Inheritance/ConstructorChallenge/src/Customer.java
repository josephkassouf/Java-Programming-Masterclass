public class Customer {

    // Instance variables
    private String name;
    private double creditLimit;
    private String emailAddress;

    // Constructors

    public Customer() {
        this("nobody", "nobody@gmail.com");
    }

    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public Customer(String name, String emailAddress) {
        this(name, 1000, emailAddress);
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
