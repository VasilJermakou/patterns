package creationalpatterns.factory;

public class Cappuccino implements Coffee{

    /* overriding interface methods */
    @Override
    public void grindCoffee() {
        System.out.println("grind cappuccino coffee");
    }

    @Override
    public void makeCoffee() {
        System.out.println("make cappuccino coffee");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("pour into cup cappuccino coffee");
    }
}
