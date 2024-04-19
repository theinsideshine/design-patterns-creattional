package src.pattern.abs.factory.cars.vehicles.impl;
import src.pattern.abs.factory.cars.vehicles.interfaces.Car;


/*
Productos Concretos (ToyotaCar, ToyotaMotorcycle, HondaCar, HondaMotorcycle):
        Estas son las implementaciones concretas de los productos definidos por las interfaces abstractas.
        Por ejemplo, ToyotaCar implementa Car, ToyotaMotorcycle implementa Motorcycle, y así sucesivamente
        .*/



public class ToyotaCar implements Car {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing Toyota car...");
    }

    @Override
    public void design() {
        System.out.println("Designing Toyota car...");
    }
}
