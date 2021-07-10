package behaviouralpatterns.state;

public class ApplicationRunner {
    public static void main(String[] args) {

        Package myPackage = new Package();
        myPackage.printStatus();

        myPackage.nextState();
        myPackage.printStatus();

        myPackage.nextState();
        myPackage.printStatus();

    }
}
