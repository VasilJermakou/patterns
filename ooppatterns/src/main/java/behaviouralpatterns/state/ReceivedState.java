package behaviouralpatterns.state;

public class ReceivedState implements PackageState{

    /* overriding interface methods */
    @Override
    public void next(Package pkg) {
        System.out.println("This package is already received by a client.");
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package delivered to post office and received.");
    }
}
