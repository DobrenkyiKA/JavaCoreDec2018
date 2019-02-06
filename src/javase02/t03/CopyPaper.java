package javase02.t03;

public class CopyPaper extends FormatPapper {
    private String format;
    private String color;
    private int thickness;

    private final String NAME = "CopyPaper";
    private final double PRICE = 3.50;


    CopyPaper(String producer, String country, String format, String color, int thickness) {
        super(producer, country);
        this.format = format;
        this.color = color;
        this.thickness = thickness;
    }

    public String getNAME() {
        return NAME;
    }

    public double getPRICE() {
        return PRICE;
    }

    @Override
    public String toString() {
        return "CopyPaper{" +
                "format='" + format + '\'' +
                ", color='" + color + '\'' +
                ", thickness=" + thickness +
                ", PRICE=" + PRICE + super.toString() +
                "} " ;
    }
}


