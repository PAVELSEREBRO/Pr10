package ru.mirea.gibo01.pr10.nasledovanie;

public class Rectangle extends Shape {
    protected int width;
    protected int length;

    public Rectangle(String color, boolean field, int width, int length) {
        super(color, field);
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
    @Override
    public double getArea() {
        return (this.length * this.width);
    }
    public  double getPerimeter() {
        return ((this.length + this.width) * 2);
    }
}

