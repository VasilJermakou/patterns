package creationalpatterns.factorymethod;

public class Truck implements Vehicle{

    /* class fields */
    private String model;

    /* constructors */
    public Truck(){
        this.model = "Man";
    }

    public Truck(String model){
        this.model = model;
    }

    /* getters and setters */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    /* override interface method */
    public void printMainPurposeOfUse(){
        System.out.println("Main purpose of use - transportation of goods");
    }

    /* object method */
    @Override
    public String toString() {
        return "Truck{" +
                "model='" + model + '\'' +
                '}';
    }
}
