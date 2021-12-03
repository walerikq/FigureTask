package ru.example;

import ru.example.Interfaces.IMovable;
import ru.example.Interfaces.IRotateble;
import ru.example.Interfaces.IScalable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
//Реализация Json
//   @JsonAutoDetect
//   @JsaonTypeInfo(use=JsonTypeInfo.Id.Name, property = "type")
//   @JsonSubTypes({
//   @JsonSubTypes.Type(value = Circle.class, name = "Circle"),
//   @JsonSubTypes.Type(value = Triangle.class, name = "Triangle"),
//   @JsonSubTypes.Type(value = Rectangle.class, name = "Rectangle"),
//       })

public abstract class Figure implements IMovable, IRotateble, IScalable, Serializable {
    /**
     * private static final long serialVersionUID = 1L;
     */
    protected ArrayList<Point> points;
    protected Point figureCenter;
    protected double area;
    protected double perimetr;
    protected double radius;

    public Figure(ArrayList<Point> points) {
        this.points = points;
        this.calculateRadius();
        this.calculatePerimetr();
        this.calculateArea();

    }

    public static ArrayList<Point> inputFigure(int numberOfPoint) {
        ArrayList<Point> points = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < numberOfPoint; i++) {
            if (numberOfPoint == 2) {
                if (i == 0) {
                    System.out.println("Введите координаты центра: ");
                    System.out.println("X: ");
                    int x = in.nextInt();
                    System.out.println("Y: ");
                    int y = in.nextInt();
                    points.add(new Point(x, y));
                }else {
                    System.out.println("Введите радиус: ");
                    int x = in.nextInt();
                    int y = x;
                    points.add(new Point(x, y));
                }
            }else {
                System.out.println("Введите координаты " + (i + 1) + "-й вершины: ");
                System.out.println("X: ");
                int x = in.nextInt();
                System.out.println("Y: ");
                int y = in.nextInt();
                points.add(new Point(x, y));
            }

        }
        return points;
    }

    public void calculateArea() {
    }

    public void calculatePerimetr() {
    }

    public void calculateRadius() {
    }

    public double getArea() {
        return area;
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public Point getCenter() {
        return figureCenter;
    }


    public double getRadius() {
        return radius;
    }
}
