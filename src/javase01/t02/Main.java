package javase01.t02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        double eDouble = 0.0;

        System.out.println("Введите 'E':");

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            eDouble = Double.valueOf(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int iter = 1;
        double aN = findAn(iter);

        while (aN >= eDouble) {
            System.out.println("A" + iter + ": " + aN + " ");
            iter++;
            aN = findAn(iter);
        }
        System.out.println("A" + iter + ": " + aN + " - Искомый элемент.");
    }

    private static double findAn(int n) {
        return 1 / Math.pow(n + 1, 2);
    }
}
