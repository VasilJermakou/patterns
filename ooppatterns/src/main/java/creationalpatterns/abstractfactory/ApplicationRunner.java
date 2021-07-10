package creationalpatterns.abstractfactory;

import creationalpatterns.abstractfactory.animal.Animal;
import creationalpatterns.abstractfactory.animal.Cat;
import creationalpatterns.abstractfactory.animal.Dog;
import creationalpatterns.abstractfactory.color.Color;

public class ApplicationRunner {
    public static void main(String[] args) {

        AbstractFactory factory = FactoryProvider.getFactory("Animal");

        Dog rex = (Dog)factory.create("Dog");
        System.out.println(rex.makeSound());

        Cat kitty = (Cat)factory.create("Cat");
        System.out.println(kitty.makeSound());

        Animal snoopy = (Animal) factory.create("Dog");
        System.out.println(snoopy.makeSound());

        System.out.println("--------------------");

        factory = FactoryProvider.getFactory("Color");

        Color white = (Color) factory.create("White");
        System.out.println(white.getColor());

        Color red = (Color) factory.create("Red");
        System.out.println(red.getColor());

        System.out.println(white.getColor());
    }
}
