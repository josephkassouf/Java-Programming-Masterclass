public class Main {
    public static void main(String[] args) {

        Employee joe = new Employee("Joe", "02/03/1999", "11/11/2018");
        System.out.println(joe);
        System.out.println("Age = " + joe.getAge());
        System.out.println("Pay = " + joe.collectPay());

        Employee tim = new Employee("Tim", "11/11/1958", "11/12/2000");
        System.out.println(tim);

        SalariedEmployee billy = new SalariedEmployee("Billy", "02/03/1999", "12/11/2019", 35000);
        System.out.println(billy);
        System.out.println("Billy's paycheck = $" + billy.collectPay());
        billy.retire();
        System.out.println("Billy's pension check = $" + billy.collectPay());

    }
}





