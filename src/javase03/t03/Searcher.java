package javase03.t03;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Searcher {
    StringBuilder text = new StringBuilder();

    public void scanFile(String s) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileReader(s));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNext()) {
            text.append(scanner.nextLine());
        }
    }

    public boolean isImagesInRightOrder() {
        ArrayList<Integer> arr = new ArrayList<>();

        for (String s : text.toString().split(" ")) {

            int i = s.indexOf("pic");
            Pattern p = Pattern.compile(".*pic\\d+?.*");
            Matcher m = p.matcher(s);

            if (i >= 0 && m.matches()) {

                String substr = s.substring(i + 3, i + 5);

                if (substr.contains(".")) {
                    arr.add(Integer.parseInt(s.charAt(i+3) + ""));
                } else {
                    arr.add(Integer.parseInt(substr));
                }
            }
        }
        for (int j = 1; j < arr.size(); j++) {
            if (arr.get(j - 1) > arr.get(j)) return false;
        }
        return true;
    }
}
