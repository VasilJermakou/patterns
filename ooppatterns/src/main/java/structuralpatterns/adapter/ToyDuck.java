package structuralpatterns.adapter;

public class ToyDuck implements ToyBird{

    /* class field */
    private String model;

    /* constructors */
    public ToyDuck(){
        this.model = "WaltDisney";
    }

    public ToyDuck(String model){
        this.model = model;
    }

    /* getter and setter */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    /* overriding interface method */
    public void makeSound(){
        System.out.println("ToyDuck says: kria-kria");
    }

    /* object method */
    @Override
    public String toString() {
        return "ToyDuck{" +
                "model='" + model + '\'' +
                '}';
    }
}
