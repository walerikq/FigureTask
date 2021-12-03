package ru.example.factory;

import ru.example.Circle;
import ru.example.Figure;
import ru.example.factory.FigureCreator;

public class CircleCreator extends FigureCreator {
    @Override
    public Figure createFigure() {
        return new Circle(Figure.inputFigure(2));
    }
}
