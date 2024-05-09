package exercise1.factorymethod01;

public class MotorcycleFactory extends VehicleFactory{
    Vehicle createVehicle(){
        return new Motorcycle();
    }
}
