package com.csc205.project2;

/*
Ai Prompt:
- show me the formula for how to find surface area of a cube, but written in java

 */

public class Cube extends Shape{
    private double width;

    public Cube(){
        super();
        this.width = 0.0;
    }
    public Cube(double v){
        this.width = v;
    }

    @Override
    public double surfaceArea() {
        return 6 * Math.pow(width, 2);
    }

    @Override
    public double volume() {
        return Math.pow(width, 3);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube{");
        sb.append("width=").append(width);
        sb.append(", Surface area=").append(surfaceArea());
        sb.append(", Volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}


