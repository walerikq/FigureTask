package ru.figurePain;

import java.util.ArrayList;

public class Circle extends Figure {
    private double radius;

    public Circle(ArrayList<Point> points) {
        super(points);
        calculateRadius();


    }

    public void calculatePerimetr() {
        this.perimetr = 2 * Math.PI * getRadius();
    }

    public void calculateFigureCenter() {
        this.figureCenter = points.get(0);

//        this.figureCenter = new Point((this.getPoints().get(1).getX() + this.getPoints().get(1).getX())/2,
//                this.getPoints().get(0).getY());

    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetr() {
        return perimetr;
    }

    public void calculateRadius() {
        double X = points.get(1).getX() - points.get(0).getX();
        double Y = points.get(1).getY() - points.get(0).getY();
        radius = Math.sqrt(X * X + Y * Y);
    }

    @Override
    public void calculateArea() {
        this.area = Math.PI * getRadius() * getRadius();
    }

    @Override
    public void rotate(double angle) {
    }

    @Override
    public void move(Point vect) {
        for (int i = 0; i < points.size(); i++) {
            points.set(i, new Point(points.get(i).getX() + vect.getX(),
                    points.get(i).getY() + vect.getY()));
        }
    }

    @Override
    public void scale(double scale) {

        points.set(1, new Point(points.get(1).getX() * scale,
                points.get(1).getY() * scale));
        calculateRadius();
        calculateArea();
        calculatePerimetr();
    }

    @Override
    public String toString() {
        return "Окружность радиусом " + radius + " с центром в точке с координатами " + points + "\n" +
                "Характеристики: \n" + "Длинна окружности: " + getPerimetr() + "\n" + "Площадь круга: " + getArea();
    }
}
