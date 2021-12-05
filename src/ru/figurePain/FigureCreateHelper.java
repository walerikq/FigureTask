package ru.figurePain;

import java.util.*;

public class FigureCreateHelper {

    public static List<Point> createPointsFromInput() {
        ArrayList<Point> points = new ArrayList<>();
        boolean itContinues = true;
        double x;
        double y;
        while (itContinues || points.size() < 2) {
            x = ScannerHelper.getDoubleFromInput("Введите x: ");
            y = ScannerHelper.getDoubleFromInput("Введите y: ");
            points.add(new Point(x, y));
            itContinues = ScannerHelper.isYes("Ввести еще координату? ");
            if (points.size() < 2 && !itContinues) {
                System.out.println("Нужно ввести минимум 2 координаты");
            }
        }
        return points;
    }
}