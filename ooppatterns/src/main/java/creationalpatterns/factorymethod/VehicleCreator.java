package creationalpatterns.factorymethod;

public class VehicleCreator {

    /* static methods */
    public static Vehicle createVehicle(VehicleType vehicleType){
        Vehicle vehicle = null;
        switch (vehicleType){
            case CAR: vehicle = new Car();
                break;
            case BUS: vehicle = new Bus();
                break;
            case TRUCK: vehicle = new Truck();
                break;
        }
        return vehicle;
    }
}
