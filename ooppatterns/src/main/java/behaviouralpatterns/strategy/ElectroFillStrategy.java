package behaviouralpatterns.strategy;

public class ElectroFillStrategy implements FillStrategy {

    /* class fields */
    private String voltageType;

    /* constructor */
    public ElectroFillStrategy(String voltageType){
        this.voltageType = voltageType;
    }

    /* getters and setters */
    public String getVoltageType() {
        return voltageType;
    }

    public void setVoltageType(String voltageType) {
        this.voltageType = voltageType;
    }

    /* overriding interface methods */
    public void fill(){
        System.out.println("Filling Electricity only, voltageType : " + this.voltageType);
    }
}
