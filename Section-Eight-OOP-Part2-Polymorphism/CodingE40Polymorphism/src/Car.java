public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    public String brake() {
        return getClass().getSimpleName() + " -> braking()";
    }
}

class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " " + getName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " " + getName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " " + getName() + " -> braking()";
    }
}

class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " " + getName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " " + getName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " " + getName() + " -> braking()";
    }
}

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " " + getName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " " + getName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " " + getName() + " -> braking()";
    }
}
