package javase02.t05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    private static List<Student> arrayList = new ArrayList<>();


    public static void main(String[] args) {

        arrayList.add(new Student("Anton", "White", Faculties.BUSINESS));
        arrayList.add(new Student("Vasya", "Black", Faculties.ECONOMICS));
        arrayList.add(new Student("Petya", "Yellow", Faculties.GOVERMENT));
        arrayList.add(new Student("Anatoliy", "Blue", Faculties.INTERNATIONAL_RELATIONS));
        arrayList.add(new Student("Ivan", "Green", Faculties.LANGUAGES));
        arrayList.add(new Student("Pasha", "Cyine", Faculties.LAW));
        arrayList.add(new Student("Ilya", "Red", Faculties.BUSINESS));
        arrayList.add(new Student("Evgen", "Dark", Faculties.ECONOMICS));
        arrayList.add(new Student("Polycarp", "Violet", Faculties.GOVERMENT));
        arrayList.add(new Student("Dima", "Light", Faculties.INTERNATIONAL_RELATIONS));
        arrayList.add(new Student("Borya", "Brown", Faculties.LANGUAGES));
        arrayList.add(new Student("Leha", "Grey", Faculties.LAW));
        arrayList.add(new Student("Andry", "Fast", Faculties.BUSINESS));
        arrayList.add(new Student("Pol", "Down", Faculties.ECONOMICS));

        for (Student student : arrayList) {
            Subjects[] arr = student.getFaculty().sub();
            for (Subjects subjects : arr) {
                if (subjects.getCode().equals("double")) {
                    double[] estimates = new double[10];
                    for (int i = 0; i < estimates.length; i++) {
                        estimates[i] = Math.random() * 10;
                    }
                    student.getMap().put(subjects, estimates);

                } else {
                    int[] estimates = new int[10];
                    for (int i = 0; i < estimates.length; i++) {
                        estimates[i] = (int) (Math.random() * 10);
                    }
                    student.getMap().put(subjects, estimates);
                }
            }
        }

        menu();
    }

    private static void showAllStudents() {
        System.out.println("\nAll students:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("№ " + i + " " + arrayList.get(i).toString());
        }
    }
    private static void showAllSubjects() {
        System.out.println("\nList of all subjects:");
        Subjects[] sub = Subjects.values();
        for (int i = 0; i < sub.length; i++) {
            System.out.println("№ " + i + " Subject: " + sub[i].toString());
        }
    }
    private static void showStudentsAtCurrentSubject(String subject) {
        System.out.println("\nStudents that have " + subject + " subject:");
        for (Student student : arrayList) {
            Subjects[] sub = student.getFaculty().sub();
            for (int i = 0; i < sub.length; i++) {
                if (sub[i].toString().equalsIgnoreCase(subject)) System.out.println("№ " + arrayList.indexOf(student) + " " + student);
            }
        }
    }
    private static String request() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    private static void menu() {
        showAllStudents();
        showAllSubjects();
        System.out.println("\nEnter name of subject to show all students learn this subject");
        showStudentsAtCurrentSubject(request());
        System.out.println("\nEnter number of student for show his estimates");
        showEstimatesOfCurrentStudent(request());
    }
    private static void showEstimatesOfCurrentStudent(String number) {
        for (Object o : arrayList.get(Integer.parseInt(number)).getMap().keySet().toArray()) {
            System.out.print("\n" + o.toString());
            Subjects subjects = (Subjects) o;
            if(subjects.getCode().equals("double")) {
                double[] arr = (double[]) arrayList.get(Integer.parseInt(number)).getMap().get(o);
                for (double v : arr) {
                    System.out.print(" " + v);
                }
            } else  {
                int[] arr = (int[]) arrayList.get(Integer.parseInt(number)).getMap().get(o);
                for (int v : arr) {
                    System.out.print(" " + v);
                }
            }
        }
    }
}
