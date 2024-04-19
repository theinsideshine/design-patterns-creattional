package src.pattern.singleton;


public class AppConfig {
    private static AppConfig instance;

    private String appName;
    private String appVersion;

    private Environment environment;

    private AppConfig() {
        // Constructor privado para evitar instanciación directa
        appName = "Patrones de diseño";
        appVersion = "1.0";
        environment = Environment.PRODUCTION; // Valor por defecto
    }

    public static synchronized AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public String getAppName() {
        return appName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
