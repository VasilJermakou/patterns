package creationalpatterns.factorymethod;

public class Car implements Vehicle{

    /* class fields */
    private String model;

    /* constructors */
    public Car(){
        this.model = "Skoda";
    }

    public Car(String model){
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
        System.out.println("Main purpose of use - to be a family car");
    }

    /* object method */
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}
