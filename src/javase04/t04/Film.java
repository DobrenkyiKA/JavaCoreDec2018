package javase04.t04;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

public class Film implements Serializable {
    String name;
    List<Actor> actorArrayList;

    public Film(String name, List<Actor> actorArrayList) {
        this.name = name;
        this.actorArrayList = actorArrayList;
    }

    @Override
    public String toString() {
        String s = actorArrayList.stream().map(a -> a.toString()).collect(Collectors.joining());
        return "\n\nФильм{" +
                "Название: '" + name + '\'' +
                ", Главные роли: " + s +
                '}';
    }
}
