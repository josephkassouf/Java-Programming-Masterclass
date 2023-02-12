public class Main {
    public static void main(String[] args) {

        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        System.out.println();
        GasPoweredCar bmw = new GasPoweredCar("2001 BMW M3", 15.4, 6);
        runRace(bmw);

        System.out.println();
        ElectricCar tesla = new ElectricCar("2022 Red Tesla Model 3", 568, 75);
        runRace(tesla);

        System.out.println();
        Car ferrariHybrid = new HybridCar("2022 Black Ferrari SF90 Stradale",16, 8, 8);
        runRace(ferrariHybrid);

    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
