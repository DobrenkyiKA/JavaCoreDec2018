package javase02.t01;


import java.util.Objects;

public class Pen {
    private String type;
    private String producer;
    private String model;
    private String color;
    private String inkColor;

    public Pen(String type, String producer, String model, String color, String inkColor) {
        this.type = type;
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.inkColor = inkColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return Objects.equals(type, pen.type) &&
                Objects.equals(producer, pen.producer) &&
                Objects.equals(model, pen.model) &&
                Objects.equals(color, pen.color) &&
                Objects.equals(inkColor, pen.inkColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, producer, model, color, inkColor);
    }

    @Override
    public String toString() {
        return "Pen{" +
                "type='" + type + '\'' +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", inkColor='" + inkColor + '\'' +
                '}';
    }
}
