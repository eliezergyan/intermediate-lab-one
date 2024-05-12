package factorymethod01;

public class TruckFactory extends VehicleFactory{
    Vehicle createVehicle(){
        return new Truck();
    }
}
