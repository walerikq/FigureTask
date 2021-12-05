package ru.figurePain.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.figurePain.Circle;
import ru.figurePain.Point;

import java.util.ArrayList;
import java.util.Collections;


class CircleTest {

    @Test
    void calculateRadius() {
        ArrayList<Point> points = new ArrayList<>();
        Point a = new Point(0, 0);
        Point b = new Point(0, 5);
        Collections.addAll(points, a, b);
        Circle circle = new Circle(points);
        double actual = circle.getRadius();
        Assertions.assertEquals(5.0, actual);
    }

    @Test
    void calculateArea() {
        ArrayList<Point> points = new ArrayList<>();
        Point a = new Point(0, 0);
        Point b = new Point(3, 4);
        Collections.addAll(points, a, b);
        Circle circle = new Circle(points);
        double actual = circle.getArea();
        Assertions.assertEquals(78.5, actual);
    }

    @Test
    void calculatePerimeter() {
        ArrayList<Point> points = new ArrayList<>();
        Point a = new Point(0, 0);
        Point b = new Point(0, 3);
        Collections.addAll(points, a, b);
        Circle circle = new Circle(points);
        double actual = circle.getPerimetr();
        Assertions.assertEquals(18.84955592153876, actual);
    }
}