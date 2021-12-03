package ru.example;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.ArrayList;
import java.util.Scanner;

public class Circle extends Figure  {
    private double radius;

    public Circle(ArrayList<Point> points) {
        super(points);
        calculateFigureCenter();
        calculatePerimetr();
        calculateArea();
        calculateRadius();
    }

    public void calculatePerimetr(){
        this.perimetr =  2 * Math.PI * radius;
    }

    public void calculateFigureCenter(){
//         this.figureCenter = new Point(getPoints().get(0).getX(),getPoints().get(0).getY());

        this.figureCenter = new Point((this.getPoints().get(1).getX() + this.getPoints().get(1).getX())/2,
                this.getPoints().get(0).getY());

    }

    public void calculateRadius(){
        this.radius = getPoints().get(1).getX();
//        this.radius = new Point((this.getPoints().get().getX()))
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
            points.set(1, new Point(points.get(1).getX() + vect.getX(),
                    points.get(1).getY() + vect.getY()));
            figureCenter = new Point(figureCenter.getX() + vect.getX(), figureCenter.getY() + vect.getY());
//            calculateFigureCenter();
    }

    @Override
    public void scale(double scale) {
        radius *= scale;
        calculateArea();
        calculatePerimetr();
    }

    @Override
    public String toString() {
        return "Окружность радиусом " + radius + " с центром в точке с координатами " + points + "\n" + "Характеристики: \n" + "Длинна окружности: " + perimetr + "\n" + "Площадь круга: " + area;
    }
}
