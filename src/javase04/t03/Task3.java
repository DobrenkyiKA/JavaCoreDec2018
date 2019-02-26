package javase04.t03;

import java.io.*;

public class Task3 {
    private static final String INPUT_FILE_NAME = "E:\\epam\\projects\\JavaCoreDec2018\\src\\javase04\\t03\\input_utf8";
    private static final String OUTPUT_FILE_NAME = "E:\\epam\\projects\\JavaCoreDec2018\\src\\javase04\\t03\\output_utf16";

    public static void main(String[] args) {
        covertCharacterSetFromUTF8ToUTF16();
    }

    private static void covertCharacterSetFromUTF8ToUTF16() {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(INPUT_FILE_NAME), "UTF8"));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(OUTPUT_FILE_NAME), "UTF16"))) {
            bufferedReader.transferTo(bufferedWriter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
