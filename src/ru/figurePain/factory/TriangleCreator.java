package ru.figurePain.factory;

import ru.figurePain.Figure;
import ru.figurePain.Point;
import ru.figurePain.Triangle;

import java.util.ArrayList;

public class TriangleCreator extends FigureCreator {
    @Override
    public Figure createFigure(ArrayList<Point>points) {
        return new Triangle(points);
    }
}
