package javase03.t02;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Questions {

    private static ResourceBundle myResources;
    private static String language = "English";

    public static void main(String[] args) {
        myResources = ResourceBundle.getBundle("javase03.t02.Resourсes.MyResources", Locale.getDefault());
        System.out.println("Core Java Interview Questions.");
        menu();
    }

    private static void menu() {
        changeLocale();
        showQuestions();
    }

    private static void changeLocale() {
        System.out.println(myResources.getString("Locale"));
        System.out.println(myResources.getString("Rus"));
        System.out.println(myResources.getString("Eng"));

        language = request();
        if (language.equalsIgnoreCase("2")) {
            myResources = ResourceBundle.getBundle("javase03.t02.Resourсes.MyResources", Locale.ENGLISH);
        } else {
            myResources = ResourceBundle.getBundle("javase03.t02.Resourсes.MyResources", new Locale("rus", "RUS"));
        }
    }

    private static String request() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void showQuestions() {
        String s;
        while (true) {
            System.out.println(myResources.getString("jcq"));
            s = request();
            if (s.equalsIgnoreCase("exit") || s.equalsIgnoreCase("выход")) break;
            System.out.println(myResources.getString("NumberOfQuestion") + s);
            System.out.println(myResources.getString("q" + s));
            System.out.println(myResources.getString("petc"));
            request();
            System.out.println(myResources.getString("u" + s));
            System.out.println(myResources.getString("petc"));
            request();
        }
    }
}
