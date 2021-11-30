package ru.example.factory;

import ru.example.Figure;
import ru.example.Rectangle;
import ru.example.factory.FigureCreator;

public class RectangleCreator extends FigureCreator {
    @Override
    public Figure createFigure() {
        return new Rectangle(Figure.inputFigure(4));
    }
}
