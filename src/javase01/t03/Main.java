package javase01.t03;

import java.util.Scanner;

import static java.lang.Math.tan;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начало отрезка 'a':");
        double a = scanner.nextDouble();
        System.out.println("Введите конец отрезка 'b':");
        double b = scanner.nextDouble();
        System.out.println("Введите шаг 'h':");
        double h = scanner.nextDouble();

        double step = a;
        int iter = (int) (Math.abs(b - a) / h);

        for(int i = 0; i <= iter; i++) {
            System.out.println("| " + step + " | " + fX(step) + " |");
            step = step + h;
        }
    }

    private static double fX(double x) {
        return tan(2 * x) - 3;
    }
}
