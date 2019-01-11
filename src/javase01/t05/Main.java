package javase01.t05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        int matrisSize = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите размер матрицы:");
            matrisSize = Integer.valueOf(bufferedReader.readLine());
        } catch (IOException e){}
        drawMatrix(matrisSize);

    }

    private static void drawMatrix(int size) {
        int [][] array = new int[size][size];

        for(int i = 0; i < array.length; i++) {
            System.out.println();
            for(int j = 0; j < array.length; j++)
            if (i == j || i + j == array.length - 1) System.out.print((array[i][j] = 1) + " ");
            else System.out.print(0 + " ");
        }
    }
}
