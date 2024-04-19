package src.pattern.factory.method.automoviles.manufacturar;

import src.pattern.factory.method.automoviles.autos.Auto;

/*Clase abstracta: Se utiliza cuando deseas proporcionar una base común para varias clases relacionadas,
        donde algunas partes del comportamiento son comunes y otras deben ser implementadas por las subclases.*/
public abstract class AutoManufactura {
    public abstract Auto crearAuto();
}
