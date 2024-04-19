package src.pattern.abs.factory.cars.factories.impl;

import src.pattern.abs.factory.cars.factories.interfaces.VehicleFactory;
import src.pattern.abs.factory.cars.vehicles.impl.ToyotaCar;
import src.pattern.abs.factory.cars.vehicles.impl.ToyotaMotorcycle;
import src.pattern.abs.factory.cars.vehicles.interfaces.Car;
import src.pattern.abs.factory.cars.vehicles.interfaces.Motorcycle;

public class ToyotaFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new ToyotaCar();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new ToyotaMotorcycle();
    }
}
