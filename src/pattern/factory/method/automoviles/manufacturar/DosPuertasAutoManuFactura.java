package src.pattern.factory.method.automoviles.manufacturar;

import src.pattern.factory.method.automoviles.autos.Auto;
import src.pattern.factory.method.automoviles.autos.impl.DosPuertasAuto;

// TwoDoorCarManufacturer.java
public class DosPuertasAutoManuFactura extends AutoManufactura {
    @Override
    public Auto crearAuto() {
        return new DosPuertasAuto();
    }
}
