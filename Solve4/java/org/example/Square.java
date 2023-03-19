package org.example;

public class Square extends Figure implements Drawable{
    @Override
    public double area(){
        double s = 50;
        return s;
    }
    @Override
    public double perimetr(){
        double p = 100;
        return p;
    }

    @Override
    public String draw(){
        String s = "Нарисован чёрный квадрат с кодинатами " + Paint.x + " " + Paint.y;
        return s;
    }

    public String draw(Color color) {
        String s = null;
        if (color == Color.BLUE) {
            s = "Нарисован синий квадрат с кодинатами " + Paint.x + " " + Paint.y;
        } else if (color == Color.BLACK) {
            s = "Нарисован черный квадрат с кодинатами " + Paint.x + " " + Paint.y;
        } else if (color == Color.RED) {
            s = "Нарисован красный квадрат с кодинатами " + Paint.x + " " + Paint.y;

        } else if (color == Color.GREEN) {
            s = "Нарисован зелёный квадрат с кодинатами " + Paint.x + " " + Paint.y;
            return s;
        } else if (color == Color.YELLOW) {
            s = "Нарисован жёлтый квадрат с кодинатами " + Paint.x + " " + Paint.y;
        }
        return s;
    }
}
