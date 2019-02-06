package javase02.t03;

public abstract class WritingAccessories extends Stationery implements Write{

    public WritingAccessories(String producer, String country) {
        super(producer, country);
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
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
