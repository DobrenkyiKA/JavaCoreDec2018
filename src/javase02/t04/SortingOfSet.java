package javase02.t04;

import javase02.t03.NoviceSet;
import javase02.t03.Stationery;

public class SortingOfSet {
    public static void main(String[] args) {
        System.out.println("\nName sort:");
        sortOfName();
        System.out.println("\nPrice sort:");
        sortOfPrice();
        System.out.println("\nPrice and Name sort:");
        sortOfPriceAndName();
    }

    private static void sortOfPrice() {
        NoviceSet.noviceSet.keySet().stream().sorted(Stationery::compareTo).forEach(System.out::println);
    }

    private static void sortOfName() {
        NoviceSet.noviceSet.keySet().stream().sorted(Stationery.NameComparator).forEach(System.out::println);
    }

    private static void sortOfPriceAndName() {
        NoviceSet.noviceSet.keySet().stream().sorted(Stationery.PriceAndNameComparator).forEach(System.out::println);
    }
}
