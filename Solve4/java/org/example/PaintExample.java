package org.example;

public class PaintExample {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(FigureUtil.area(circle));
        FigureUtil.draw(circle, Figure.Color.YELLOW);
        FigureUtil.draw(circle, Figure.Color.BLUE);
        FigureUtil.draw(circle);
        Square square = new Square();
        System.out.println(FigureUtil.area(square));
        FigureUtil.draw(square);
        Rectangle rectangle = new Rectangle();
        System.out.println(FigureUtil.perimetr(rectangle));
        Triangle tri = new Triangle();
        FigureUtil.draw(tri, Figure.Color.RED);

    }

}
