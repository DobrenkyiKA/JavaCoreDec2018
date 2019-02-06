package javase02.t03;

public class Pencil extends WritingAccessories {
    private String color;

    private final String NAME = "Pencil";
    private final double PRICE = 0.4;


    public Pencil(String producer, String country, String color) {
        super(producer, country);
        this.color = color;
    }

    @Override
    public void write() {
        System.out.println("I can write");
    }

    public String getNAME() {
        return NAME;
    }

    @Override
    public double getPRICE() {
        return PRICE;
    }

    @Override
    public String toString() {
        return "Pencil{" +
                "color='" + color + '\'' +
                ", PRICE=" + PRICE + super.toString() +
                "} " ;
    }
}
