public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAniamlStuff(animal, "slow");

        Dog dog = new Dog();
        doAniamlStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doAniamlStuff(yorkie, "fast");

        Dog retriever = new Dog("Labrador Retriever", 65, "Floppy", "Swimmer");
        doAniamlStuff( retriever, "slow");

        Dog wolf = new Dog("wolf", 40);
        doAniamlStuff(wolf, "slow");

        Fish goldie = new Fish("Goldfish", 0.25, 2, 3);
        doAniamlStuff(goldie, "fast");

    }

    public static void doAniamlStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("____");
    }

}

