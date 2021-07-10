package behaviouralpatterns.strategy;

public class GasolineFillStrategy implements FillStrategy {

    /* class fields */
    private String gasolineType;

    /* constructor */
    public GasolineFillStrategy(String gasolineType){
        this.gasolineType = gasolineType;
    }

    /* getters and setters */
    public String getGasolineType() {
        return gasolineType;
    }

    public void setGasolineType(String gasolineType) {
        this.gasolineType = gasolineType;
    }

    /* overriding interface methods */
    public void fill(){
        System.out.println("Filling Gasoline only, type : " + this.gasolineType);
    }
}
