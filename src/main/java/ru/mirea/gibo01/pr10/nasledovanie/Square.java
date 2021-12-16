package ru.mirea.gibo01.pr10.nasledovanie;

public class Square extends  Rectangle {

    protected double side;
    protected String color;

    public Square(String color, boolean field, int width, int length, double side, String color1) {
        super(color, field, width, length);
        this.side = side;
        this.color = color1;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", field=" + field +
                ", side=" + side +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public double getArea() {
        return (this.side);
    }
    public double getPerimeter() {
        return (this.side);
    }

}
