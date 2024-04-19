package src.pattern.abs.factory.cars.vehicles.impl;

import src.pattern.abs.factory.cars.vehicles.interfaces.Motorcycle;

public class HondaMotorcycle implements Motorcycle {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing Honda motorcycle...");
    }

    @Override
    public void customize() {
        System.out.println("Customizing Honda motorcycle...");
    }
}
