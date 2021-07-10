package creationalpatterns.factorymethod;

public class Bus implements Vehicle{

    /* class fields */
    private String model;

    /* constructors */
    public Bus(){
        this.model = "Volvo";
    }

    public Bus(String model){
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
        System.out.println("Main purpose of use - to deliver large group of passenger");
    }

    /* object method */
    @Override
    public String toString() {
        return "Bus{" +
                "model='" + model + '\'' +
                '}';
    }
}
