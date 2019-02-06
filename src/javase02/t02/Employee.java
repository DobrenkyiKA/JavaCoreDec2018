package javase02.t02;

import javase02.t03.Stationery;
import java.util.HashMap;

public class Employee {
    private static Integer count = 0;
    private Integer iD;
    private String firstName;
    private String lastName;
    private String position;

    private HashMap<Stationery, Integer> setOfStationeryForCurrentEmployee = new HashMap<>();

    private Employee() {
        count++;
    }

    Employee(String firstName, String lastName, String position) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.iD = count;
    }

    Integer getId() {
        return iD;
    }

    HashMap<Stationery, Integer> getSetOfStationeryForCurrentEmployee() {
        return setOfStationeryForCurrentEmployee;
    }

    @Override
    public String toString() {
        return "Id=" + iD +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
