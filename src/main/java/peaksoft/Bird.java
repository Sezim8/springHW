package peaksoft;

public class Bird implements Animal {
    private String kind;
    private String color;
    private String name;

    public Bird(String kind, String color, String name) {
        this.kind = kind;
        this.color = color;
        this.name = name;
    }

    public Bird() {
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void animalPlus() {
        System.out.println("bird +++");

    }

    @Override
    public void animalMinus() {
        System.out.println("bird ---");

    }

    @Override
    public String toString() {
        return "Bird{" +
                "kind='" + kind + '\'' +
                ", color='" + color + '\'' +
                ", Bird name='" + name + '\'' +
                '}';
    }
}
