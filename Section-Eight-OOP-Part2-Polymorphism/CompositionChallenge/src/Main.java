public class Main {
    public static void main(String[] args) {

        SmartKitchen smartKitchen = new SmartKitchen();

//        smartKitchen.getCoffeeMaker().setHasWorkToDo(true);
//        smartKitchen.getDishWasher().setHasWorkToDo(true);
//        smartKitchen.getRefrigerator().setHasWorkToDo(true);

//        smartKitchen.addWater();
//        smartKitchen.pourMilk();
//        smartKitchen.loadDishwasher();
        smartKitchen.setKitchenState(true, true, true);
        smartKitchen.doKitchenWork();

    }
}
