package behaviouralpatterns.strategy;

public class ApplicationRunner {
    public static void main(String[] args) {

        Car f1 = new SportCar("Ferrari", new GasolineFillStrategy("95"));
        f1.fill();
        f1.start();
        f1.stop();

        System.out.println("---------------");

        Bus schoolBus = new Bus("Volvo", new GasolineFillStrategy("Disel"));
        schoolBus.fill();
        schoolBus.start();
        schoolBus.stop();

        System.out.println("---------------");

        schoolBus.setFillStrategy(new ElectroFillStrategy("220 V"));
        schoolBus.fill();
        schoolBus.start();
        schoolBus.stop();

    }
}
