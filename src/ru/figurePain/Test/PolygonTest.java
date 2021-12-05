package ru.figurePain.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.figurePain.Point;
import ru.figurePain.Polygon;

import java.util.ArrayList;
import java.util.Collections;


class PolygonTest {

    @Test
    void calculateArea() {
        ArrayList<Point> points = new ArrayList<>();
        Point a = new Point(0, 0);
        Point b = new Point(0, 3);
        Point c = new Point(4, 3);
        Point d = new Point(4, 0);
        Collections.addAll(points, a, b, c,d);
        Polygon polygon = new Polygon(points);
        double actual = polygon.getArea();
        Assertions.assertEquals(12, actual);
    }

    @Test
    void calculatePerimeter() {
        ArrayList<Point> points = new ArrayList<>();
        Point a = new Point(0, 0);
        Point b = new Point(0, 3);
        Point c = new Point(4, 3);
        Collections.addAll(points, a, b, c);
        Polygon polygon = new Polygon(points);
        double actual = polygon.getPerimetr();
        Assertions.assertEquals(12, actual);
    }

    @Test
    void calculateCenter() {
        ArrayList<Point> points = new ArrayList<>();
        Point a = new Point(0, 0);
        Point b = new Point(0, 3);
        Point c = new Point(4, 3);

        Collections.addAll(points, a, b, c);
        Polygon polygon = new Polygon(points);
        Point actual = polygon.getCenter();
        Assertions.assertEquals(new Point(1.3333333333333333, 2.0), actual);
    }
}