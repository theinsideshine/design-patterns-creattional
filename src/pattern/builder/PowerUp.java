package src.pattern.builder;

public class PowerUp {
    private String name;
    private String color;
    private String size;

    public PowerUp(String name, String color, String size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return color + " " + size + " " + name;
    }
}