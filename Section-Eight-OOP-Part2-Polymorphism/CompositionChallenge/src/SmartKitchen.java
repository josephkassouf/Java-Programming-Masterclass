public class SmartKitchen {
    private CoffeeMaker coffeeMaker;
    private DishWasher dishWasher;
    private Refrigerator refrigerator;

    public SmartKitchen() {
        coffeeMaker = new CoffeeMaker();
        dishWasher = new DishWasher();
        refrigerator = new Refrigerator();
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public void setKitchenState(boolean coffeeFlag, boolean dishWasherFlag, boolean fridgeFlag) {

        coffeeMaker.setHasWorkToDo(coffeeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
        refrigerator.setHasWorkToDo(fridgeFlag);

    }

    public void doKitchenWork() {

        coffeeMaker.brewCoffee();
        dishWasher.doDishes();
        refrigerator.orderFood();

    }

    public void addWater() {
        System.out.println("Adding water...");
    }

    public void pourMilk() {
        System.out.println("Pouring milk...");
    }

    public void loadDishwasher() {
        System.out.println("Loading dishwasher...");
    }
}

class Refrigerator {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Ordering food...");
            hasWorkToDo = false;
        }
    }
}

class DishWasher {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Washing dishes...");
            hasWorkToDo = false;
        }
    }
}

class CoffeeMaker {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Brewing coffee...");
            hasWorkToDo = false;
        }

    }
}


