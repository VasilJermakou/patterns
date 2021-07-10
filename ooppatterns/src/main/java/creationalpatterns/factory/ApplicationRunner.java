package creationalpatterns.factory;

public class ApplicationRunner {
    public static void main(String[] args) {

        CoffeeShop starbucks = new CoffeeShop();
        Coffee coffee = starbucks.prepareCoffee(CoffeeType.CAPPUCCINO);

    }
}
