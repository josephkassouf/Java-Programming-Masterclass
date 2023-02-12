public class Animal {

    protected String type;
    private String animalSize;
    private double weight;

    public Animal(String type, String animalSize, double weight) {
        this.type = type;
        this.animalSize = animalSize;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", animalSize='" + animalSize + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move(String speed) {
        System.out.println(type + " moves " + speed);
    }

    public void makeNoise() {
        System.out.println(type + " makes some kind of noise");
    }
}
