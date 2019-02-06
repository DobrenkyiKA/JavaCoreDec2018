package javase02.t03;

public class Steppler extends Stationery {
    private final String NAME = "Steppler";
    private final double PRICE = 2.86;


    Steppler(String producer, String country) {
        super(producer, country);
    }

    public String getNAME() {
        return NAME;
    }

    public double getPRICE() {
        return PRICE;
    }

    @Override
    public String toString() {
        return "Steppler{" +
                "PRICE=" + PRICE + super.toString() +
                "} " ;
    }
}
