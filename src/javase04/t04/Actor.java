package javase04.t04;

import java.io.Serializable;

public class Actor implements Serializable {
    String firstName;
    String lastName;

    public Actor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "\nАктер{" +
                "Имя: '" + firstName + '\'' +
                ", Фамилия: '" + lastName + '\'' +
                '}';
    }
}
