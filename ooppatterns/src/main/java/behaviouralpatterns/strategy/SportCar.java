package behaviouralpatterns.strategy;

public class SportCar implements Car{

    /* class fields */
    private String model;
    private FillStrategy fillStrategy;

    /* constructor */
    public SportCar(String model, FillStrategy fillStrategy){
        this.model = model;
        this.fillStrategy = fillStrategy;
    }

    /* getters and setters */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public FillStrategy getFillStrategy() {
        return fillStrategy;
    }

    public void setFillStrategy(FillStrategy fillStrategy) {
        this.fillStrategy = fillStrategy;
    }

    /* overriding interface methods */
    @Override
    public void fill() {
        this.fillStrategy.fill();
    }

    @Override
    public void start() {
        System.out.println(this.model + " start driving");
    }

    @Override
    public void stop() {
        System.out.println(this.model + " stops");
    }

    /* object method */
    @Override
    public String toString() {
        return "SportCar{" +
                "model='" + model + '\'' +
                ", fillStrategy=" + fillStrategy +
                '}';
    }
}
