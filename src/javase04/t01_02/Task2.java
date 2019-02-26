package javase04.t01_02;

import java.io.*;
import java.util.stream.Collectors;

public class Task2 {
    static void findJavaKeyWordsByCharStream() {
        String text = "";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(Main.FILE_NAME))) {
            text =  bufferedReader.lines().collect(Collectors.joining());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Main.searching(text);
    }
}
