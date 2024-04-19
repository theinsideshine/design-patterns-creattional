package src.pattern.abs.factory.cars.factories.interfaces;

import src.pattern.abs.factory.cars.vehicles.interfaces.Car;
import src.pattern.abs.factory.cars.vehicles.interfaces.Motorcycle;


/*
Fábrica Abstracta (VehicleFactory):
        La interfaz VehicleFactory define métodos abstractos para crear diferentes tipos de productos.
        En este caso, createCar() y createMotorcycle() son métodos que deben ser implementados por las
        fábricas concretas para producir objetos de los tipos adecuados.
        */

public interface VehicleFactory {
    Car createCar();
    Motorcycle createMotorcycle();
}
