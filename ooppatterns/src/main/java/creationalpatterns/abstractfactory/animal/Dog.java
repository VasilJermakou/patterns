package creationalpatterns.abstractfactory.animal;

import creationalpatterns.abstractfactory.animal.Animal;

public class Dog implements Animal {

    /* class fields */
    private String name;

    /* constructors */
    public Dog(){
        this.name = "Mylo";
    }

    public Dog(String name){
        this.name = name;
    }

    /* getters and setters */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /* overriding interface method */
    public String makeSound(){
        return "Bow-wow";
    }

    /* object methods */
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
