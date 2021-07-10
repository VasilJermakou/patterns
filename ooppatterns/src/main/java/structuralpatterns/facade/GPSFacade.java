package structuralpatterns.facade;

public class GPSFacade {

    /* class fields */
    private GPSPower gpsPower;
    private GPSNotifier gpsNotifier;
    private RoadAdvisor roadAdvisor;

    /* constructor */
    public GPSFacade(GPSPower gpsPower, GPSNotifier gpsNotifier, RoadAdvisor roadAdvisor){
        this.gpsPower = gpsPower;
        this.gpsNotifier = gpsNotifier;
        this.roadAdvisor = roadAdvisor;
    }

    /* business method */
    public void activate(){
        this.gpsPower.powerOn();
        this.gpsNotifier.downloadRoadInfo();
        this.roadAdvisor.route();
    }

    public void deactivate(){
        this.gpsPower.powerOff();
    }
}
