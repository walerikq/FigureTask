package ru.example;

import java.util.ArrayList;

public abstract class Polygon extends Figure {
    public Polygon (ArrayList<Point> points){
        super(points);
        this.calculateArea();
        this.calculatePerimetr();
        this. calculateFigureCenter();
    }

    //TODO

    public void calculateArea(){
        this.area = 0;
        for (int i = 0; i < points.size() - 1 ; i++) {
            this.area += 0.5 * Math.abs(points.get(i).getX() * points.get(i+1).getY() - points.get(i).getY() * points.get(i+1).getX());
        }
    }

    public void calculatePerimetr(){
        perimetr = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            perimetr += Math.sqrt(Math.pow(points.get(i + 1).getX() - points.get(i).getX(),2)
                    + Math.pow(points.get(i+1).getY() - points.get(i).getY(), 2));
        }
        perimetr += Math.sqrt(Math.pow(points.get(points.size() - 1).getX() - points.get(0).getX(),2)
                + Math.pow(points.get(points.size() - 1).getY() - points.get(0).getY(), 2));
    }

    public void calculateFigureCenter(){
        double sumX = 0;
        double sumY = 0;
        for(Point p:points){
            sumX += p.getX();
            sumY += p.getY();
        }
        this.figureCenter = new Point(sumX / points.size(), sumY / points.size());
    }

    @Override
    public void move(Point vect){
        for (int i = 0; i < points.size() ; i++) {
            points.set(i, new Point(points.get(i).getX() + vect.getX(),
                    points.get(i).getY() + vect.getY()));
        }
    }

    @Override
    public void rotate(double angle) {
        angle *=  Math.PI / 180;
        for (int i = 0; i < points.size(); i++) {
            double x = (points.get(i).getX() - figureCenter.getX()) * Math.cos(angle) - (points.get(i).getY() - figureCenter.getY()) * Math.sin(angle) + figureCenter.getX();
            double y = (points.get(i).getX() - figureCenter.getX()) * Math.sin(angle) + (points.get(i).getY() - figureCenter.getY()) * Math.cos(angle) + figureCenter.getY();
            points.set(i, new Point(x,y));
        }
    }

    @Override
    public void scale(double scale) {
        for (int i = 0; i < points.size(); i++) {
            double x = (points.get(i).getX() - figureCenter.getX()) * scale + figureCenter.getX();
            double y = (points.get(i).getY() - figureCenter.getY())* scale + figureCenter.getY();
            points.set(i,new Point(x,y));
        }
        calculateArea();
        calculatePerimetr();
    }
}
