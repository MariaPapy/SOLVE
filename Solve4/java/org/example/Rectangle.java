package org.example;

public class Rectangle extends Figure implements Drawable{
    @Override
    public double area() {
        double s = 100;
        return s;
    }

    @Override
    public double perimetr() {
        double p = 50;
        return p;
    }

    @Override
    public String draw(){
        String s = "Нарисован чёрный прямоугольник с кодинатами " + Paint.x + " " + Paint.y;
        return s;
    }

    public String draw(Color color){
        String s = null;
        if (color == Color.BLUE) {
            s = "Нарисован синий прямоугольник с кодинатами " + Paint.x + " " + Paint.y;
        }else if (color == Color.BLACK){
            s = "Нарисован черный прямоугольник с кодинатами " + Paint.x + " " + Paint.y;
        }else if (color == Color.RED){
            s = "Нарисован красный прямоугольник с кодинатами " + Paint.x + " " + Paint.y;
        }else if (color == Color.GREEN){
            s = "Нарисован зелёный прямоугольник с кодинатами " + Paint.x + " " + Paint.y;
        }else if (color == Color.YELLOW){
            s = "Нарисован жёлтый прямоугольник с кодинатами " + Paint.x + " " + Paint.y;
        }
        return s;
    }
}
