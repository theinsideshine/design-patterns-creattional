package src.pattern.builder;

public class PowerUpBuilder {
    private String name;
    private String color;
    private String size;

    public PowerUpBuilder(String name) {
        this.name = name;
    }

    public PowerUpBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public PowerUpBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public PowerUp build() {
        return new PowerUp(name, color, size);
    }
}
