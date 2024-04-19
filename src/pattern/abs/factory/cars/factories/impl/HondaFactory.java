package src.pattern.abs.factory.cars.factories.impl;

import src.pattern.abs.factory.cars.factories.interfaces.VehicleFactory;
import src.pattern.abs.factory.cars.vehicles.impl.HondaCar;
import src.pattern.abs.factory.cars.vehicles.impl.HondaMotorcycle;
import src.pattern.abs.factory.cars.vehicles.interfaces.Car;
import src.pattern.abs.factory.cars.vehicles.interfaces.Motorcycle;

/*
Fábricas Concretas(ToyotaFactory,HondaFactory):
        Estas clases implementan la interfaz VehicleFactory y proporcionan la implementación concreta
        de los métodos createCar()y createMotorcycle().Cada fábrica concreta está destinada a producir
        productos de una familia específica,en este caso,vehículos de Toyota o Honda.
 */


public class HondaFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new HondaCar();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new HondaMotorcycle();
    }
}
