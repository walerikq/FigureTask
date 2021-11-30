package ru.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Triangle extends Polygon  {

    public Triangle(ArrayList<Point> points) {
        super(points);
    }

//TODO вынести в класс полигон
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return points.equals(triangle.points);
    }

//TODO вынести в класс полигон
    @Override
    public int hashCode() {
        return Objects.hash(points);
    }

/** Переместить метод стринг в класс полигон */
    @Override
    public String toString() {
        return "Треугольник с вершинами в точках: " + points + "\nХарактеристики: " + "\nПериметр: " + perimetr + "\nПлощадь: " + area + "\n" + figureCenter;
    }



}
