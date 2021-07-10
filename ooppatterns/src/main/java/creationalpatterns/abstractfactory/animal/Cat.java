package creationalpatterns.abstractfactory.animal;

import creationalpatterns.abstractfactory.animal.Animal;

public class Cat implements Animal {

    /* class fields */
    private String name;

    /* constructors */
    public Cat(){
        this.name = "Garfild";
    }

    public Cat(String name){
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
        return "Mew-mew";
    }

    /* object methods */
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
