package ru.mirea.gibo01.pr10.nasledovanie;

public class Circle extends Shape {
    private int radius;
    @Override
    public double getArea() {
        double s;
        s  = this.getArea()*this.getArea()*Math.PI;
        s = Math.pow(this.getArea(),2)*Math.PI;
        return s;
    }
    @Override
    public double getPerimeter() {
        double p;
        return (2*Math.PI*this.getArea());
    }

    public Circle(String color, boolean field, int radius) {
        super(color, field);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", field=" + field +
                '}';
    }
}