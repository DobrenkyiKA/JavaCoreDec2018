package javase04.t01_02;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<String, Integer> javaKeys = new HashMap<>();
    static final String FILE_NAME = "E:\\epam\\projects\\JavaCoreDec2018\\src\\javase04\\t01_02\\test";

    public static void main(String[] args) {

        initializeMap();
        System.out.println("\nЧтение из файла с помощью БАЙТОВОГО потока и поиск ключевых слов в тексте:");
        Task1.findJavaKeyWordsByByteStream();
        printResult();

        initializeMap();
        System.out.println("\nЧтение из файла с помощью СИМВОЛЬНОГО потока и поиск ключевых слов в тексте:");
        Task2.findJavaKeyWordsByCharStream();
        printResult();
    }

    static void printResult() {
        javaKeys.entrySet().stream()
                .filter(a -> a.getValue() > 0)
                .forEach(a -> System.out.println("Ключевое слово: " + a.getKey() + "\t\t Количество: " + a.getValue()));
    }

    static void searching(String text) {
        for (String s : javaKeys.keySet()) {
            int index = 0;
            int g;
            while ((g = text.indexOf(s, index)) > -1) {
                javaKeys.merge(s, 0, (a,b) -> a + 1);
                index = g + 1;
            }
        }
    }

    static void initializeMap() {
        javaKeys.clear();
            javaKeys.put("byte", 0);            javaKeys.put("short", 0);
            javaKeys.put("int", 0);             javaKeys.put("long", 0);
            javaKeys.put("char", 0);            javaKeys.put("float", 0);
            javaKeys.put("double", 0);          javaKeys.put("boolean", 0);
            javaKeys.put("if", 0);              javaKeys.put("else", 0);
            javaKeys.put("switch", 0);          javaKeys.put("case", 0);
            javaKeys.put("default", 0);         javaKeys.put("while", 0);
            javaKeys.put("do", 0);              javaKeys.put("break", 0);
            javaKeys.put("continue", 0);        javaKeys.put("for", 0);
            javaKeys.put("try", 0);             javaKeys.put("catch", 0);
            javaKeys.put("finally", 0);         javaKeys.put("throw", 0);
            javaKeys.put("throws", 0);          javaKeys.put("private", 0);
            javaKeys.put("protected", 0);       javaKeys.put("public", 0);
            javaKeys.put("import", 0);          javaKeys.put("package", 0);
            javaKeys.put("class", 0);           javaKeys.put("interface", 0);
            javaKeys.put("extends", 0);         javaKeys.put("implements", 0);
            javaKeys.put("static", 0);          javaKeys.put("final", 0);
            javaKeys.put("void", 0);            javaKeys.put("abstract", 0);
            javaKeys.put("native", 0);          javaKeys.put("new", 0);
            javaKeys.put("return", 0);          javaKeys.put("this", 0);
            javaKeys.put("super", 0);           javaKeys.put("synchronized", 0);
            javaKeys.put("volatile", 0);        javaKeys.put("const", 0);
            javaKeys.put("goto", 0);            javaKeys.put("instanceof", 0);
            javaKeys.put("enum", 0);            javaKeys.put("assert", 0);
            javaKeys.put("transient", 0);       javaKeys.put("strictfp", 0);
    }
}
