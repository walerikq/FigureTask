package ru.figurePain.factory;

import ru.figurePain.Circle;
import ru.figurePain.Figure;
import ru.figurePain.Point;

import java.util.ArrayList;

public class CircleCreator extends FigureCreator {
    @Override
    public Figure createFigure(ArrayList<Point> points) {
        return new Circle(points);
    }
}
