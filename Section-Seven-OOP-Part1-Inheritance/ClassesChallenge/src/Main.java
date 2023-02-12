public class Main {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("12345678", 333.33, "Joe", "123@gmail.com", "9022133667");
        String output = account1.getCustomerName() + " " + account1.getEmail() + " " + account1.getPhoneNumber() +
                " " + account1.getAccountNumber() + " $" + account1.getBalance();
//        System.out.println(output);
//        account1.depositing(100000);
//        account1.withdrawal(30000);

        BankAccount account2 = new BankAccount();
        String output2 = account2.getCustomerName() + " " + account2.getEmail() + " " + account2.getPhoneNumber() +
                " " + account2.getAccountNumber() + " $" + account2.getBalance();
//        System.out.println(output2);

        BankAccount account3 = new BankAccount("Timmy", "Tim@gmail.com", "12345");
        System.out.println("AccountNo: " + account3.getAccountNumber() + "; name " + account3.getCustomerName());

    }

}
