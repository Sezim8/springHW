package peaksoft;

public class Lion implements Animal {
    private String kind;
    private  String color;
    private  String name;

    public Lion(String kind, String color, String name) {
        this.kind = kind;
        this.color = color;
        this.name = name;
    }

    public Lion() {
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
        System.out.println("lion ++++ ");
    }

    @Override
    public void animalMinus() {
        System.out.println("lion ---- ");

    }

    @Override
    public String toString() {
        return "Lion{" +
                "kind='" + kind + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
