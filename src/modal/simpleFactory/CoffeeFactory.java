package modal.simpleFactory;

public class CoffeeFactory {

    Coffee createCoffee(String type){
        if ("Amer".equals(type)){
            return new AmeCoffee();
        } else if ("latee".equals(type)){
            return new LateeCoffee();
        } else {
            System.out.println("don't have this coffee");
        }
        return null;
    }

}
