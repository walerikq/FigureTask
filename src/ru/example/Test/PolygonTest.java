package ru.example.Test;

import org.junit.Assert;
import org.junit.Test;
import ru.example.Point;
import ru.example.Triangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class PolygonTest {

    @Test
    public void calculateArea() {
        ArrayList<Point> trianglePoints = new ArrayList<>();
        Collections.addAll(trianglePoints, new Point(0, 0), new Point(0, 3), new Point(4, 3));
        Triangle r1 = new Triangle(trianglePoints);
        double res = r1.getArea();
        double v = 6;

//        Assert.assertEquals();
    }

    @Test
    public void calculatePerimetr() {
    }

    @Test
    public void calculateFigureCenter() {
    }
}