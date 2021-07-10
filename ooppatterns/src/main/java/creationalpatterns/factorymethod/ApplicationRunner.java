package creationalpatterns.factorymethod;

public class ApplicationRunner {
    public static void main(String[] args) {

        Vehicle car = VehicleCreator.createVehicle(VehicleType.CAR);
        car.printMainPurposeOfUse();

        Vehicle bus = VehicleCreator.createVehicle(VehicleType.BUS);
        bus.printMainPurposeOfUse();

        Vehicle truck = VehicleCreator.createVehicle(VehicleType.TRUCK);
        truck.printMainPurposeOfUse();

    }
}
