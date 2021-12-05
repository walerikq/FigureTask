package ru.figurePain;

import ru.figurePain.vizualization.Window;
import ru.figurePain.factory.CircleCreator;
import ru.figurePain.factory.FigureCreator;
import ru.figurePain.factory.RectangleCreator;
import ru.figurePain.factory.TriangleCreator;

import java.io.*;
import java.util.*;

public class Main {

    final static File file = new File("figures.txt");

    public static void main(String[] args) {
        ArrayList<Figure> figures = initialiazeFromFile(file);//Создание коллекции фигур, куда входят коллекции треуг. прямоуг. и пр.

        ArrayList<Point> trianglePoints = new ArrayList<>();//создание списка точек для треугольника
//        Triangle triangle1 = new Triangle(new ArrayList<Point>());
//        Triangle triangle2 = new Triangle(new Point(-1, 5),new Point(0, 8),new Point(1, 4));
//        Triangle triangle3 = new Triangle(new Point(-2, 0),new Point(0, -5),new Point(2, 0));
//        Collections.addAll(trianglePoints, new Point(0, 0), new Point(0, 30), new Point(40, 30));
//        Triangle r1 = new Triangle(trianglePoints);
//        Collections.addAll(figures, r1);
//
//
//       1

//
//        printFigures(figures);


//        ArrayList<Figure> f = initialiazeFromFile(file);
        menu(figures);

    }


    public static void menu(List<Figure> figures) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите нужный пункт меню:");
            System.out.println("1 - Вывести все фигуры.");
            System.out.println("2 - Добавить фигуру.");
            System.out.println("3 - Изменить фигуру.");
            System.out.println("4 - Удалить фигуру.");
            System.out.println("5 - Записать в файл");
            System.out.println("6 - Получить фигуры из файла");
            System.out.println("7 - Сделать отрисовку созданных фигур");
            System.out.println("0 - Выход.");

            int num = in.nextInt();
            switch (num) {
                case 0:
                    System.exit(0);
                case 1:
                    printFigures(figures);
                    break;
                case 2:
                    System.out.println("Какую фигуру хотите создать?");
                    FigureCreator figureCreator;
                    figureCreator = selectFigure();
                    ArrayList<Point> points = (ArrayList<Point>) FigureCreateHelper.createPointsFromInput();
                    Figure figure = figureCreator.createFigure(points);
                    figures.add(figure);
                    break;
                case 3:
                    System.out.println("Какую фигуру вы хотите изменить?");
                    printFigures(figures);
                    num = in.nextInt();
                    Figure f = figures.get(num - 1);
                    selectAction(f);

                    break;
                case 4:
                    printFigures(figures);
                    System.out.println("Введите номер фигуры, которую нужно удалить:");
                    num = in.nextInt();
                    figures.remove(num - 1);

                    break;
                case 5:
                    SaveToFile(figures, file);
                    break;
                case 6:
                    initialiazeFromFile(file);
                    break;
                case 7:
                    new Window((ArrayList<Figure>) figures);
                    break;

            }
        }

    }

    /**
     * метод для вывода фигур из списка
     */
    static void printFigures(List<Figure> figures) {
        int i = 1;
        for (Figure f : figures) {
            System.out.println(i + ". " + f);
            i++;
        }
    }

    /**
     * метод для выора создания фигур
     */
    static FigureCreator selectFigure() {
        System.out.println("Выберите какую фигуру создать: ");
        System.out.println("1 - треугольник");
        System.out.println("2 - круг");
        System.out.println("3 - прямоугольник");
        FigureCreator figureCreator;
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        switch (num) {
            case 1:
                figureCreator = new TriangleCreator();
                break;
            case 2:
                figureCreator = new CircleCreator();
                break;
            case 3:
                figureCreator = new RectangleCreator();
                break;
            default:
                System.out.println("Введите правильное значение");
                return selectFigure();
        }
        return figureCreator;
    }

    /**
     * метод для выбора действия фигур
     */
    static Figure selectAction(Figure f) {
        System.out.println("Выберите изменение: ");
        System.out.println("1 - перемещение");
        System.out.println("2 - поворот");
        System.out.println("3 - масштаб");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
//        num = in.nextInt();
        switch (num) {
            case 1:
                System.out.println("Укажите число по оси х: ");
                int x = in.nextInt();
                System.out.println("Укажите число по оси у: ");
                int y = in.nextInt();
                f.move(new Point(x, y));
                break;
            case 2:
                System.out.println("Укажите угол поворота:");
                x = ScannerHelper.getIntFromInput("Введите угол поворота: \n");
                f.rotate(x);

                break;
            case 3:
                System.out.println("Во сколько раз изменить масштаб фигуры");
                x = in.nextInt();
                f.scale(x);

                break;
            default:
                System.out.println("Введите правильное значение");
                return selectAction(f);

        }
        return f;
    }

    /**
     * метод для сохранения фигур в файл
     */
    private static void SaveToFile(List<Figure> figures, File file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file, false))) {
            oos.writeObject(figures);
            System.out.println("Объект записан");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());//это не одно и тоже??
        }
    }

    /**
     * метод для того, чтобы достать фигуры из файла, куда они были ранее записаны
     */
    private static ArrayList<Figure> initialiazeFromFile(File file) {
        ArrayList<Figure> f = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            f = (ArrayList<Figure>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }


}



