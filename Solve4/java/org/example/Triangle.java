package org.example;

public class Triangle extends Figure implements Drawable{
    @Override
    public double area(){
        double s = 10;
        return s;
    }
    @Override
    public double perimetr() {
        double p = 50;
        return p;
    }
    @Override
    public String draw(){
        String s = "Нарисован чёрный треугольник с кодинатами " + Paint.x + " " + Paint.y;
        return s;
    }

    public String draw(Color color){
        String s = null;
        if (color == Color.BLUE) {
            s = "Нарисован синий треугольник с кодинатами " + Paint.x + " " + Paint.y;
        }else if (color == Color.BLACK){
            s = "Нарисован черный треугольник с кодинатами " + Paint.x + " " + Paint.y;
        }else if (color == Color.RED){
            s = "Нарисован красный треугольник с кодинатами " + Paint.x + " " + Paint.y;
        }else if (color == Color.GREEN){
            s = "Н зелёный треугольник с кодинатами " + Paint.x + " " + Paint.y;
        }else if (color == Color.YELLOW) {
            s = "Нарисован жёлтый треугольник с кодинатами " + Paint.x + " " + Paint.y;
        }
        return s;
    }
}
