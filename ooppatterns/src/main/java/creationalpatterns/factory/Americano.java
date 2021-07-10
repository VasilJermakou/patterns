package creationalpatterns.factory;

public class Americano implements Coffee{

    /* overriding interface methods */
    @Override
    public void grindCoffee() {
        System.out.println("grind americano coffee");
    }

    @Override
    public void makeCoffee() {
        System.out.println("make americano coffee");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("pour into cup americano coffee");
    }
}
