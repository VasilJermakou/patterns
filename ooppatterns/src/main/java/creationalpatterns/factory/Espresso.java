package creationalpatterns.factory;

public class Espresso implements Coffee{

    /* overriding interface methods */
    @Override
    public void grindCoffee() {
        System.out.println("grind espresso coffee");
    }

    @Override
    public void makeCoffee() {
        System.out.println("make espresso coffee");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("pour into cup espresso coffee");
    }
}
