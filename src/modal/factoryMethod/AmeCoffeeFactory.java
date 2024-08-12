package modal.factoryMethod;

public class AmeCoffeeFactory extends CoffeeFactory{
    @Override
    Coffee createCoffee() {
        return new AmeCoffee();
    }
}
