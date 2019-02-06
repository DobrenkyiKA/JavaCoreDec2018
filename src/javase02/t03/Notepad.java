package javase02.t03;

public class Notepad extends FormatPapper {
    private int amountPages;

    private final String NAME = "Notepad";
    private final double PRICE = 1.25;

    Notepad(String producer, String country, int amountPages) {
        super(producer, country);
        this.amountPages = amountPages;
    }

    public String getNAME() {
        return NAME;
    }

    public double getPRICE() {
        return PRICE;
    }

    @Override
    public String toString() {
        return "Notepad{" +
                "amountPages=" + amountPages +
                ", PRICE=" + PRICE + super.toString() +
                "} " ;
    }
}
