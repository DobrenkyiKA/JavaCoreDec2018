package javase03.t01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class CrazyLogger {
    public  StringBuilder logger = new StringBuilder();
    public  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-YYYY : hh-mm");


    public void log(String message) {
        String localDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now()).format(formatter);
        logger.append("\n" + localDateTime + " " + message);
    }

    public void searching(String string) {
        String[] strings = logger.toString().split("\n");
        ArrayList<String> foundedStr = new ArrayList<>();
        for (String string1 : strings) {
            if (string1.contains(string)) {
                foundedStr.add(string1);
            }
        }
        foundedStr.forEach(System.out::println);
    }
}
