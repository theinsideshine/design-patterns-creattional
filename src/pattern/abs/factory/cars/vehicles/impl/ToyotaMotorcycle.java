package src.pattern.abs.factory.cars.vehicles.impl;

import src.pattern.abs.factory.cars.vehicles.interfaces.Motorcycle;

public class ToyotaMotorcycle implements Motorcycle {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing Toyota motorcycle...");
    }

    @Override
    public void customize() {
        System.out.println("Customizing Toyota motorcycle...");
    }
}
