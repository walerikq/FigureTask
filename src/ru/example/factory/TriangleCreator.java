package ru.example.factory;

import ru.example.Figure;
import ru.example.Triangle;
import ru.example.factory.FigureCreator;

public class TriangleCreator extends FigureCreator {
    @Override
    public Figure createFigure() {
        return new Triangle(Figure.inputFigure(3));
    }
}
