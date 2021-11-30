package ru.example.factory;

import ru.example.Figure;
import ru.example.Point;
import ru.example.Triangle;
import ru.example.factory.FigureCreator;

import java.util.List;

public class TriangleCreator extends FigureCreator {
    @Override
    public Figure createFigure() {
        return new Triangle(Figure.inputFigure(3));
    }
}
