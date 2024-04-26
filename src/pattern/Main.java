package src.pattern;

import src.pattern.abs.factory.games.objetcslevel.ObjectLevel;
import src.pattern.abs.factory.games.obstacules.Obstacule;
import src.pattern.builder.PowerUp;
import src.pattern.builder.PowerUpBuilder;
import src.pattern.factory.method.games.enemigs.Enemig;
import src.pattern.prototype.Usuario;
import src.pattern.singleton.*;



public class Main {
    public static void main(String[] args) {

        /*System.out.println("Use abstract factory");
        // Crear una fábrica Toyota
        VehicleFactory toyotaFactory = new ToyotaFactory();

        // Crear un automóvil Toyota
        Car toyotaCar = toyotaFactory.createCar();
        toyotaCar.manufacture();
        toyotaCar.design();

        // Crear una motocicleta Toyota
        Motorcycle toyotaMotorcycle = toyotaFactory.createMotorcycle();
        toyotaMotorcycle.manufacture();
        toyotaMotorcycle.customize();

        // Crear una fábrica Honda
        VehicleFactory hondaFactory = new HondaFactory();

        // Crear un automóvil Honda
        Car hondaCar = hondaFactory.createCar();
        hondaCar.manufacture();
        hondaCar.design();

        // Crear una motocicleta Honda
        Motorcycle hondaMotorcycle = hondaFactory.createMotorcycle();
        hondaMotorcycle.manufacture();
        hondaMotorcycle.customize();

        System.out.println("Use factory method");

        // Crear un fabricante de autos de dos puertas
        AutoManufactura dosPuertasAutoManuFactura = new DosPuertasAutoManuFactura();
        // Crear un auto de dos puertas
        Auto dosPuertasAuto = dosPuertasAutoManuFactura.crearAuto();
        dosPuertasAuto.ensamblaje();

        // Crear un fabricante de autos de cuatro puertas
        AutoManufactura cuatroPuertasAutoManuFactura = new CuatroPuertasAutoManufactura();
        // Crear un auto de cuatro puertas
        Auto cuatroPuertasAuto = cuatroPuertasAutoManuFactura.crearAuto();
        cuatroPuertasAuto.ensamblaje();*/


        AppConfig appConfig = AppConfig.getInstance();

        // Usar AppConfig
        System.out.println("Nombre de la aplicación: " + appConfig.getAppName());
        System.out.println("Versión de la aplicación: " + appConfig.getAppVersion());

        // Establecer el entorno de la aplicación
        appConfig.setEnvironment(Environment.DEVELOPMENT);

        // Obtener y usar el entorno de la aplicación
        System.out.println("Entorno de la aplicación: " +  appConfig.getEnvironment());

        /*System.out.println("Use factory method");

        // Crear una fábrica de enemigos aleatorios
        EnemigFactory randomFactory = new RandomEnemigFactory();
        // Crear un enemigo aleatorio
        Enemig randomEnemy = randomFactory.createEnemig();
        printEnemy(randomEnemy,"randomFactory");

        // Crear una fábrica de enemigos dificiles aleatorios
        EnemigFactory randomDifficultFactory = new RandomDifficultEnemigFactory();
        // Crear un enemigo aleatorio
        Enemig randomDifficultEnemy = randomDifficultFactory.createEnemig();
        printEnemy(randomDifficultEnemy,"randomDifficultFactory");

        // Crear una fábrica de enemigos Gomba
        EnemigFactory gombaFactory = new GombaFactory();
        // Crear un enemigo aleatorio
        Enemig gombaEnemy = gombaFactory.createEnemig();
        printEnemy(gombaEnemy,"gombaFactory");


        System.out.println("Use abstract factory wiht factory method");

        //Crear nivel uno

        LevelFactory levelOnefactory = new LevelOneFactory();
        EnemigFactory gomba2Factory = levelOnefactory.createEnemigFactory(); // Obtener la fábrica de enemigos
        Enemig gombaLevelFactory = gomba2Factory.createEnemig(); // Crear un enemigo usando la fábrica

        ObjectLevel coinLevelFactory = levelOnefactory.createObject();
        Obstacule brickLevelFactory =levelOnefactory.createObstacule();

        printEnemyLevel(gombaLevelFactory,"level1-Gomba");
        printObjectLevel(coinLevelFactory,"level1");
        printObstaculeLevel(brickLevelFactory,"level1");


        //Crear nivel dos

        LevelFactory levelTwofactory = new LevelTwoFactory();
        // Crear una fábrica de enemigos aleatorios
        EnemigFactory randomLevelFactory = levelTwofactory.createRandomEnemigFactory();
        // Crear un enemigo aleatorio
        Enemig random1Enemy = randomLevelFactory.createEnemig();
        ObjectLevel liveLevelFactory = levelTwofactory.createObject();
        Obstacule cubeLevelFactory =levelTwofactory.createObstacule();

        printEnemyLevel(random1Enemy,"level2-randomEnemig");
        printObjectLevel(liveLevelFactory,"level2");
        printObstaculeLevel(cubeLevelFactory,"level2");*/



       /* System.out.println("Use Builder Pattern");

        PowerUpBuilder builder = new PowerUpBuilder("Super Mushroom");
        PowerUp mushroom = builder.setColor("Red").setSize("Medium").build();
        System.out.println(mushroom); // Output: Red Medium Super Mushroom

        builder = new PowerUpBuilder("Fire Flower");
        PowerUp flower = builder.setColor("Orange").setSize("Small").build();
        System.out.println(flower); // Output: Orange Small Fire Flower

        builder = new PowerUpBuilder("POP");
        PowerUp pop = builder.setSize("Large").build();
        System.out.println(pop); // Output: Orange Small Fire Flower*/


        System.out.println("Use Prototype Pattern");

        Usuario usuario1 = new Usuario();
        usuario1.setEstadoCivil("Soltero");
        usuario1.setNombre("German");
        usuario1.setApellido("Paez");
        usuario1.setEdad(20);
        System.out.println(usuario1);


        Usuario usuario2 = usuario1.clone();

        System.out.println(usuario2);
        usuario2.setEstadoCivil("Casado");
        System.out.println(usuario2);

    }



    private static void printEnemyLevel(Enemig enemig, String level) {
        System.out.println("Nivel: "+level);
        System.out.println("Enemigo:");
        enemig.name();
    }

    private static void printObjectLevel(ObjectLevel object, String level) {
        System.out.println("Nivel: "+level);
        System.out.println("Objeto:");
        object.name();
    }

    private static void printObstaculeLevel(Obstacule obstacule, String level) {
        System.out.println("Nivel: "+level);
        System.out.println("Obstaculo:");
        obstacule.name();
    }

    public static void printEnemy(Enemig enemy,String sourceFactory) {
        System.out.println("Fabrica: "+sourceFactory);
        System.out.println("Enemigo:");
        enemy.name();
        enemy.power();
        enemy.higher();
        enemy.lives();
        enemy.speed();
        System.out.println();
    }




}
