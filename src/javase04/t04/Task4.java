package javase04.t04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    private static List<Film> filmsBeforeSerialization;
    private static List<Film> filmsAfterSerialization;

    private static final String STORAGE_FILE = "E:\\epam\\projects\\JavaCoreDec2018\\src\\javase04\\t04\\storageForSerializedObjects";

    public static void main(String[] args) {
        init();
        System.out.println("До сериализации: ");
        System.out.println(filmsBeforeSerialization);
        serialization();
        deserialization();
        System.out.println("\nПосле десериализации: ");
        System.out.println(filmsAfterSerialization);
    }

    private static void init() {
        filmsBeforeSerialization = new ArrayList<>();
        filmsBeforeSerialization.add(new Film("Dune", Arrays.asList(new Actor("Vasya", "Pupkin"), new Actor("Anton", "Gorodetckyi"))));
        filmsBeforeSerialization.add(new Film("Mune", Arrays.asList(new Actor("Liza", "Pupkina"), new Actor("Anton", "Gorodetckyi"))));
        filmsBeforeSerialization.add(new Film("Badune", Arrays.asList(new Actor("Shaitan", "Vaitan"), new Actor("Poly", "Vyn"))));
    }

    private static void serialization() {
        try(    FileOutputStream fileOutputStream = new FileOutputStream(STORAGE_FILE);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(filmsBeforeSerialization);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void deserialization() {
        try(FileInputStream fileInputStream = new FileInputStream(STORAGE_FILE);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            filmsAfterSerialization = (List<Film>) objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
