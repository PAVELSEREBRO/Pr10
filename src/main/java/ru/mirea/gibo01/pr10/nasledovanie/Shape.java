package ru.mirea.gibo01.pr10.nasledovanie;

public abstract class Shape {
    protected String color;
    protected boolean field;
    public abstract double getArea();
    public abstract double getPerimeter();

    public Shape(String color, boolean field) {
        this.color = color;
        this.field = field;
    }

    public String getColor() {
        return color;
    }

    public boolean isField() {
        return field;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", field=" + field +
                '}';
    }

}