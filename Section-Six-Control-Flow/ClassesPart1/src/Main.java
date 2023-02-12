public class Main {
    public static void main(String[] args) {

        Car tesla = new Car();
        tesla.setMake("Tesla");
        tesla.setModel("Model X");
        tesla.setColor("Gray");
        tesla.setDoors(2);
        tesla.setConvertible(true);

        tesla.describeCar();
        System.out.println(tesla.getDoors() + "-Door " + tesla.getColor() + " " + tesla.getMake() + " " + tesla.getModel() + " " + (tesla.isConvertible() ? "Convertible" : ""));
        
    }
}
