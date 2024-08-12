package modal.simpleFactory;

public class CoffeeStore {

   private CoffeeFactory coffeeFactory;


    public CoffeeFactory getCoffeeFactory() {
        return coffeeFactory;
    }

    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee(String type){
        return coffeeFactory.createCoffee(type);
    }
}
