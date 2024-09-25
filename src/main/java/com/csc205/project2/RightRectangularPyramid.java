package com.csc205.project2;
/*
AI prompt:
-now do the surface area formula for a pyramid
 */

public class RightRectangularPyramid extends Shape{
    private double length;
    private double height;
    private double width;

    public RightRectangularPyramid(){
        super();
        this.length = 0.0;
        this.height = 0.0;
        this.width = 0.0;
    }

    public RightRectangularPyramid(double l, double h, double w){
        super();
        this.length = l;
        this.height = h;
        this.width = w;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double surfaceArea() {
        return length * width +
                length * Math.sqrt(Math.pow(width / 2, 2) + Math.pow(height, 2)) +
                width * Math.sqrt(Math.pow(length / 2, 2) + Math.pow(height, 2));
    }

    @Override
    public double volume() {
        return (length * width * height)/3;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pyramid{");
        sb.append("length=").append(length);
        sb.append(", height=").append(height);
        sb.append(", width=").append(width);
        sb.append(", volume= ").append(volume());
        sb.append(", surface area= ").append(surfaceArea());
        sb.append('}');
        return sb.toString();
    }
}
