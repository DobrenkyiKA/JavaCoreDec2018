package javase02.t05;

import java.util.HashMap;
import java.util.Map;

public class Student<T> {
    private String firstName;
    private String lastName;
    private Faculties faculty;

    private Map<Subjects, T[]> map = new HashMap<>();

    public Student(String firstName, String lastName, Faculties faculty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.faculty = faculty;
    }

    public Faculties getFaculty() {
        return faculty;
    }

    public Map<Subjects, T[]> getMap() {
        return map;
    }

    @Override
    public String toString() {
        return  firstName + " " + lastName + " " + "faculty: " + faculty;
    }
}
