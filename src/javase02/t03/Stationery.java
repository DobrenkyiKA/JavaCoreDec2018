package javase02.t03;

import java.util.Comparator;
import java.util.Objects;

public abstract class Stationery implements Comparable<Stationery> {
    private String producer;
    private String country;

    public Stationery(String producer, String country) {
        this.producer = producer;
        this.country = country;
    }

    public String getProducer() {
        return producer;
    }

    public String getCountry() {
        return country;
    }

    public abstract double getPRICE();
    public abstract String getNAME();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stationery)) return false;
        Stationery that = (Stationery) o;
        return getProducer().equals(that.getProducer()) &&
                getCountry().equals(that.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProducer(), getCountry());
    }

    @Override
    public String toString() {
        return
                ", producer='" + producer + '\'' +
                ", country='" + country + '\'';
    }

    @Override
    public int compareTo(Stationery o) {
        double d = this.getPRICE() - o.getPRICE();
        if (d < 0) return -1;
        if (d > 0) return 1;
        return 0;
    }

    public static Comparator<Stationery> NameComparator = Comparator.comparing(Stationery::getNAME);
    public static Comparator<Stationery> PriceAndNameComparator = (o1, o2) -> {
        int d = o1.compareTo(o2);
        return (d == 0) ? o1.getNAME().compareTo(o2.getNAME()) : d;
    };
}
