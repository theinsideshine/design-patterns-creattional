package src.pattern.abs.factory.cars.vehicles.impl;

import src.pattern.abs.factory.cars.vehicles.interfaces.Car;

public class HondaCar implements Car {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing Honda car...");
    }

    @Override
    public void design() {
        System.out.println("Designing Honda car...");
    }
}
