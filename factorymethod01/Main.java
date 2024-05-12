package factorymethod01;

public class Main {
    public static void main(String[] args){
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory motorcycleFactory = new MotorcycleFactory();
        VehicleFactory truckFactory = new TruckFactory();

        Vehicle car = carFactory.createVehicle();
        Vehicle truck = truckFactory.createVehicle();
        Vehicle motorcycle = motorcycleFactory.createVehicle();

        car.manufacture();
        truck.manufacture();
        motorcycle.manufacture();
    }
}
