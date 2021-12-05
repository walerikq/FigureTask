package ru.figurePain;

import java.util.Scanner;

public class ScannerHelper {
    private final static Scanner READER = new Scanner(System.in);

    private ScannerHelper() {
    }

    public static double getDoubleFromInput(String text) {
        boolean ifInputErr = true;
        double number = 0;
        System.out.print(text);
        // цикл заставляет вводить только числа, не выводя ошибку InputMismatchException
        while (ifInputErr) {
            if (READER.hasNextDouble()) {
                number = READER.nextDouble();
                ifInputErr = false;
            } else {
                System.out.print("Вы должны ввести число, а не текст! " + text);
                READER.next();
            }
        }
        return number;
    }

    // метод ввода только целого числа
    public static int getIntFromInput(String text) {
        boolean ifInputErr = true;
        int number = 0;
        System.out.print(text);
        // цикл заставляет вводить только числа, не выводя ошибку InputMismatchException
        while (ifInputErr) {
            if (READER.hasNextInt()) {
                number = READER.nextInt();
                ifInputErr = false;
            } else {
                System.out.print("Вы должны ввести число, а не текст! " + text);
                READER.next();
            }
        }
        return number;
    }

    public static boolean isYes(String text) {
        System.out.print(text);
        String answer = READER.next().toLowerCase().trim().replaceAll("\\p{P}", "");
        return "y".equals(answer) || "yes".equals(answer) || "да".equals(answer) || "ok".equals(answer);
    }
}
