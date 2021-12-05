package ru.figurePain.vizualization;

import ru.figurePain.Figure;

import javax.swing.*;
import java.util.ArrayList;

public class Window extends JFrame{
    public Window(ArrayList<Figure> figures){
        super();
        this.setSize(1000,1000);
        this.add(new GraphicCanvas(figures));
        this.setVisible(true);

    }

}
