package ru.mirea.gibo01.pr10.nasledovanie;

public class Main {
    public static void main(String[] args) {


        Circle a = new Circle("red", true,45);
        System.out.println(a);
        System.out.println("Периметр равен " + a.getPerimeter());
        System.out.println("Площадь равна " + a.getArea());
        Rectangle b = new Rectangle("yellow", true,34,65);
        System.out.println(b);
        System.out.println(b.getArea() + b.getPerimeter());

        Shape c = new Rectangle("green", true, 56,75);
        System.out.println(c.getPerimeter());
        Square g = new Square("blue", true, 32, 56, 43, "black");
        System.out.println(g);
        System.out.println(g.getPerimeter());
        System.out.println(g.getArea());
    }
}