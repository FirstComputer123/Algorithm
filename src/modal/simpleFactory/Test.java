package modal.simpleFactory;



public class Test {

    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        coffeeStore.setCoffeeFactory(new CoffeeFactory());
        Coffee amer = coffeeStore.orderCoffee("Amer");
        amer.show();
    }
}
