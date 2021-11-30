package ru.example;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.ArrayList;
import java.util.Scanner;

public class Circle extends Figure  {
    private double radius;

    public Circle(ArrayList<Point> points) {
        super(points);
    }

    public void calculatePerimetr(){
        this.perimetr =  2 * Math.PI * radius;
    }

    @Override
    public void calculateArea(){
        this.area = Math.PI * radius * radius;
    }

    @Override
    public void rotate(double angle) {
    }

    @Override
    public void move(Point vect) {
            points.set(0, new Point(points.get(0).getX() + vect.getX(),
                    points.get(0).getY() + vect.getY()));
            figureCenter = new Point(figureCenter.getX() + vect.getX(), figureCenter.getY() + vect.getY());
    }

    @Override
    public void scale(double scale) {
        radius *= scale;
    }

    @Override
    public String toString() {
        return "Окружность радиусом " + radius + " с центром в точке с координатами " + points + "\n" + "Характеристики: \n" + "Perimetr: " + perimetr + "\n" + "Area: " + area;
    }
}
