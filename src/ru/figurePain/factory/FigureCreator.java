package ru.figurePain.factory;

import ru.figurePain.Figure;
import ru.figurePain.Point;

import java.util.ArrayList;

public abstract class FigureCreator {
    public abstract Figure createFigure(ArrayList<Point> points);
}