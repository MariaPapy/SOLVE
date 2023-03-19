package org.example;

public class Circle extends Figure implements Drawable {
    @Override
    public double area(){
        double s = 10;
        return s;
    }
    @Override
    public double perimetr() {
        double p = 20;
        return p;
    }

    @Override
    public String draw(){
        String s = "Нарисован чёрный круг с кодинатами " + Paint.x + " " + Paint.y;
        return s;
    }

    public String draw(Color color){
        String s = null;
        if (color == Color.BLUE) {
            s = "Нарисован синий круг с кодинатами " + Paint.x + " " + Paint.y;
        }else if (color == Color.BLACK){
            s = "Нарисован черный круг с кодинатами " + Paint.x + " " + Paint.y;
        }else if (color == Color.RED){
            s = "Нарисован красный круг с кодинатами " + Paint.x + " " + Paint.y;
        }else if (color == Color.GREEN){
            s = "Нарисован зелёный круг с кодинатами " + Paint.x + " " + Paint.y;
        }else if (color == Color.YELLOW){
            s = "Нарисован жёлтый круг с кодинатами " + Paint.x + " " + Paint.y;
        }
        return s;
    }
}

