package ru.example.vizualization;

import ru.example.Circle;
import ru.example.Figure;

import java.awt.*;
import java.util.ArrayList;

public class GraphicCanvas extends Canvas {
    private  ArrayList<Figure> figures;

    public GraphicCanvas(ArrayList<Figure> figures){
        super();
        this.figures = figures;

    }
    public void paint(Graphics g){
       int weight = 500;
       int height = 500;
       int startX = 250;
       int startY = 250;
        Graphics canvas  = g.create(startX, startY, weight,height);
        canvas.setColor(Color.BLUE);
        canvas.fillRect(0,0,weight,height);
        canvas.setColor(Color.BLACK);
        canvas.drawLine(weight/2, 0, weight /2, height);
        canvas.drawLine( 0,height/2,  weight,height /2);

        for(Figure f : figures){
            if(f instanceof Circle){
                Circle c = (Circle) f;
                int x1 = (int) c.getCenter().getX();
                int y1 = (int) c.getCenter().getY();
                int radius = (int)c.getRadius();

                canvas.drawOval(x1-radius,y1 - radius, radius*2, radius*2);
            }else{
                for (int i = 0; i < f.getPoints().size()-1; i++){
                    canvas.drawLine((int)f.getPoints().get(i).getX(),
                            (int)f.getPoints().get(i).getY(),
                            (int) f.getPoints().get(i+1).getX(),
                            (int) f.getPoints().get(i+1).getY());

                }
                canvas.drawLine((int)f.getPoints().get(f.getPoints().size()-1).getX(),
                                (int)f.getPoints().get(f.getPoints().size()-1).getY(),
                                (int) f.getPoints().get(0).getX(),
                                (int) f.getPoints().get(0).getY());
            }
        }
    }
}
