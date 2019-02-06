package javase02.t03;

public class Stickers extends FormatPapper {
    private String format;
    private String color;

    private final String NAME = "Stickers";
    private final double PRICE = 0.44;

    Stickers(String producer, String country, String format, String color) {
        super(producer, country);
        this.format = format;
        this.color = color;
    }

    public String getNAME() {
        return NAME;
    }

    public double getPRICE() {
        return PRICE;
    }

    @Override
    public String toString() {
        return "Stickers{" +
                "format='" + format + '\'' +
                ", color='" + color + '\'' +
                ", PRICE=" + PRICE +
                super.toString() +
                "} " ;
    }
}
