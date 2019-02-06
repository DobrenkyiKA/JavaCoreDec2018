package javase02.t01;

import javase02.t03.WritingAccessories;

import java.util.Objects;


public class Pen extends WritingAccessories {
    private int modelNumber;
    private String color;
    private String inkColor;

    private final String NAME = "Pen";
    private final double PRICE = 0.12;

    public Pen(String producer, String country, int modelNumber, String color, String inkColor) {
        super(producer, country);
        this.modelNumber = modelNumber;
        this.color = color;
        this.inkColor = inkColor;
    }

    @Override
    public void write() {
        System.out.println("I can write");
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public String getColor() {
        return color;
    }

    public String getInkColor() {
        return inkColor;
    }

    public String getNAME() {
        return NAME;
    }

    public double getPRICE() {
        return PRICE;
    }

    public void setInkColor(String inkColor) {
        this.inkColor = inkColor;
    }

    @Override
    public String getProducer() {
        return super.getProducer();
    }

    @Override
    public String getCountry() {
        return super.getCountry();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pen)) return false;
        if (!super.equals(o)) return false;
        Pen pen = (Pen) o;
        return getModelNumber() == pen.getModelNumber() &&
                getColor().equals(pen.getColor()) &&
                getInkColor().equals(pen.getInkColor()) &&
                getNAME().equals(pen.getNAME());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getModelNumber(), getColor(), getInkColor(), getNAME());
    }


    @Override
    public String toString() {
        return "Pen{" +
                "modelNumber=" + modelNumber +
                ", color='" + color + '\'' +
                ", inkColor='" + inkColor + '\'' +
                ", PRICE=" + PRICE +
                super.toString() +
                "} " ;
    }
}
