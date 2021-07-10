package creationalpatterns.abstractfactory;

import creationalpatterns.abstractfactory.animal.Animal;
import creationalpatterns.abstractfactory.animal.Cat;
import creationalpatterns.abstractfactory.animal.Dog;

public class AnimalFactory implements AbstractFactory<Animal>{

    /* overriding interface method */
    @Override
    public Animal create(String entityType) {
        if(entityType.equalsIgnoreCase("Dog"))
            return new Dog();
        else if(entityType.equalsIgnoreCase("Cat"))
            return new Cat();

        return null;
    }
}
