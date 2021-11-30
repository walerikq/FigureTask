package ru.example;

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

public abstract class Figure implements IMovable,IRotateble, IScalable, Serializable {
/** private static final long serialVersionUID = 1L;*/
    protected ArrayList<Point> points;
    protected Point figureCenter;
    protected double area;
    protected double perimetr;

    public Figure(ArrayList<Point> points){
        this.points = points;
    }
    public static ArrayList<Point> inputFigure(int numberOfPoint) {
        ArrayList<Point> points = new ArrayList<>();
        System.out.println("Введите координаты для " + numberOfPoint + " вершин");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < numberOfPoint; i++) {
            System.out.println((i + 1) + "-я вершина ");
            System.out.println("X: ");
            int x = in.nextInt();
            System.out.println("Y: ");
            int y = in.nextInt();
            points.add(new Point(x,y));
        }
        return points;
    }
    public void calculateArea(){}
    public void calculatePerimetr(){}

    public double getArea(){
        return area;
    }
    public double getPerimetr(){
        return perimetr;
    }



}
