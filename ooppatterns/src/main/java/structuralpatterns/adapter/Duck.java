package structuralpatterns.adapter;

public class Duck implements Bird{

    /* class field */
    private String name;

    /* constructors */
    public Duck(){
        this.name = "Donald";
    }

    public Duck(String name){
        this.name = name;
    }

    /* getter and setter */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /* overriding interface methods */
    public void fly(){
        System.out.println("Duck " + this.name + " is flying");
    }

    public void makeSound(){
        System.out.println("Kria-kria");
    }

    /* object method */
    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                '}';
    }
}
