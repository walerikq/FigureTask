package ru.figurePain.factory;

import ru.figurePain.Figure;
import ru.figurePain.Point;
import ru.figurePain.Rectangle;

import java.util.ArrayList;

public class RectangleCreator extends FigureCreator {
    @Override
    public Figure createFigure(ArrayList<Point>points) {
        return new Rectangle(points);
    }
}
