package creationalpatterns.factory;

public class SimpleCoffeeFactory {

    /* business methods */
    public Coffee creatCoffee(CoffeeType coffeeType){
        Coffee coffee = null;
        switch (coffeeType){
            case AMERICANO: coffee = new Americano();
                break;
            case CAPPUCCINO: coffee = new Cappuccino();
                break;
            case ESPRESSO: coffee = new Espresso();
                break;
            case LATTE: coffee = new Latte();
                break;
        }
        return coffee;
    }
}
