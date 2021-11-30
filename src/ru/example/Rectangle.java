package ru.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rectangle extends Polygon  {

    public Rectangle(ArrayList<Point> points){
        super(points);
    }

    @Override
    public String toString() {
        return "Прямоугольник с вершинами в точках: " + points + "\nХарактеристики: " + "\nПериметр: " + perimetr + "\nПлощадь: " + area + "\n" + figureCenter;
    }
}
