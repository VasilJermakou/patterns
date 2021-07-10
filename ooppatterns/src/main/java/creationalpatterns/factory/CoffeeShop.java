package creationalpatterns.factory;

public class CoffeeShop {

    /* class fields */
    private SimpleCoffeeFactory coffeeFactory;

    /* constructor */
    public CoffeeShop(){
        this.coffeeFactory = new SimpleCoffeeFactory();
    }

    /* business methods */
    public Coffee prepareCoffee(CoffeeType coffeeType){
        Coffee coffee = this.coffeeFactory.creatCoffee(coffeeType);
        System.out.println("Here your " + coffeeType);
        System.out.println("Have a good day and visit us again :)");
        return coffee;
    }
}
