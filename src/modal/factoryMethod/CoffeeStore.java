package modal.factoryMethod;

public class CoffeeStore {

    public Coffee createCoffee(CoffeeFactory coffeeFactory){
        return coffeeFactory.createCoffee();
    }

}
