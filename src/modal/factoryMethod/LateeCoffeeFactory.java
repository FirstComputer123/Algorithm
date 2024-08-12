package modal.factoryMethod;

public class LateeCoffeeFactory extends CoffeeFactory{
    @Override
    Coffee createCoffee() {
        return new LateeCoffee();
    }
}
