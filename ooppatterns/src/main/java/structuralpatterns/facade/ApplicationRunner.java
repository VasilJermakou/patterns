package structuralpatterns.facade;

public class ApplicationRunner {
    public static void main(String[] args) {

        GPSPower gpsPower = new GPSPower();
        GPSNotifier gpsNotifier = new GPSNotifier();
        RoadAdvisor roadAdvisor = new RoadAdvisor();

        GPSFacade gpsFacade = new GPSFacade(gpsPower, gpsNotifier, roadAdvisor);

        gpsFacade.activate();
        gpsFacade.deactivate();
    }
}
