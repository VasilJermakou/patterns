package creationalpatterns.factory;

public class Latte implements Coffee{

    /* overriding interface methods */
    @Override
    public void grindCoffee() {
        System.out.println("grind latte coffee");
    }

    @Override
    public void makeCoffee() {
        System.out.println("make latte coffee");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("pour into cup latte coffee");
    }

}
