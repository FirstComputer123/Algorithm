package modal.factoryMethod;

public abstract class CoffeeFactory {

    abstract Coffee createCoffee();

    public void addMilk(){
        System.out.println("add milk");
    }

}
