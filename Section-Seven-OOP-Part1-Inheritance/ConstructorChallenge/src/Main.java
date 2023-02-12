public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Joe", 2000, "Joe@gmail.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmailAddress());

        Customer customer2 = new Customer("Joe", "Pickle@email.com");
        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getEmailAddress());

        Customer customer3 = new Customer();
        System.out.println(customer3.getName());
        System.out.println(customer3.getEmailAddress());
    }
}
