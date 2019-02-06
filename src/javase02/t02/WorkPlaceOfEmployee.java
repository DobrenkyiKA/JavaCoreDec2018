package javase02.t02;


import javase02.t03.NoviceSet;
import javase02.t03.Stationery;

import java.io.*;
import java.util.*;

public class WorkPlaceOfEmployee {
    private static List<Employee> workPlacesOfAllEmployee = new LinkedList<>();
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        workPlacesOfAllEmployee.add(new Employee("Jorg", "Brown", "accountant"));
        workPlacesOfAllEmployee.add(new Employee("Borg", "Dark", "doctor"));
        workPlacesOfAllEmployee.add(new Employee("Korg", "Black", "driver"));
        workPlacesOfAllEmployee.add(new Employee("Porg", "White", "teacher"));

        for (Employee e : workPlacesOfAllEmployee) {
            e.getSetOfStationeryForCurrentEmployee().putAll(NoviceSet.noviceSet);
        }

        menu();
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static HashMap getMapForIdOfEmployee(int iD) {
        for (Employee e : workPlacesOfAllEmployee) {
            if (e.getId() == iD) return e.getSetOfStationeryForCurrentEmployee();
        }
        return new HashMap();
    }

    private static void showEmployeeStationeryList(int iD) {
        HashMap<Stationery, Integer> hashMap = getMapForIdOfEmployee(iD);
        hashMap.forEach((key, value) -> System.out.println(key.toString() + "   AMOUNT: " + value));
        System.out.print("\nCost of all stationery: ");

        System.out.println(hashMap.entrySet().stream()
                .mapToDouble(s -> s.getKey().getPRICE() * s.getValue())
                .sum());
        System.out.println("\nPress 'Enter' for continue");
        enterInt();
        menu();
    }

    private static void showAllEmployees() {
        System.out.println("\nEmployees list: ");
        for (Employee e : workPlacesOfAllEmployee) {
            System.out.println(e);
        }
    }

    private static void menu() {
        System.out.println("\nStationery accounting program at the employee's workplace.");
        showAllEmployees();
        System.out.println("\nChoose ID of employee, input number and press 'Enter' or input '0' to exit");
        int i = enterInt();
        if (i != 0) showEmployeeStationeryList(i);
    }

    private static int enterInt() {
        try {
            String str = bufferedReader.readLine();
            if (!str.isEmpty())
            return Integer.parseInt(str);
        } catch (IOException e) {
            return 0;
        } return 0;
    }
}
