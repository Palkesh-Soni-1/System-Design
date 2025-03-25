package Model;

public class Player {
    public String name;
    public String color;

    public Player(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return name + "(" + color + ")";
    }
}
