package modal.factoryMethod;

public class Test {


    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        AmeCoffeeFactory ameCoffeeFactory = new AmeCoffeeFactory();
        LateeCoffeeFactory lateeCoffeeFactory = new LateeCoffeeFactory();
        Coffee coffee = coffeeStore.createCoffee(ameCoffeeFactory);
        coffee.show();
    }
}
