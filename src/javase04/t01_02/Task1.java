package javase04.t01_02;

import java.io.FileInputStream;

public class Task1 {
    static void findJavaKeyWordsByByteStream() {
        String text = "";
        try (FileInputStream fileInputStream = new FileInputStream(Main.FILE_NAME)) {
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer, 0, buffer.length);
            text = new String(buffer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Main.searching(text);
    }
}
