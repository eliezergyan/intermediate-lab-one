package exercise1.factorymethod01;

public class CarFactory extends VehicleFactory{
    Vehicle createVehicle(){
        return new Car();
    }
}
