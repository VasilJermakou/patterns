package behaviouralpatterns.state;

public class Package {

    /* class fields */
    private PackageState state = new OrderState();

    /* constructor */
    public Package(){}

    /* getters and setters */
    public PackageState getState() {
        return state;
    }

    public void setState(PackageState state) {
        this.state = state;
    }

    /* business methods */
    public void nextState(){
        this.state.next(this);
    }

    public void previousState(){
        this.state.prev(this);
    }

    public void printStatus(){
        this.state.printStatus();
    }
}
