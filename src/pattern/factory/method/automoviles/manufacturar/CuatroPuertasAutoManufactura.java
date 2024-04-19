package src.pattern.factory.method.automoviles.manufacturar;

import src.pattern.factory.method.automoviles.autos.Auto;
import src.pattern.factory.method.automoviles.autos.impl.CuatroPuertasAuto;



public class CuatroPuertasAutoManufactura extends AutoManufactura {
    @Override
    public Auto crearAuto() {
        return new CuatroPuertasAuto();
    }
}
