package com.csc205.project2;
/*
AI prompt:
-Now I want the formula for surface Area of a cylinder


 */

public class Cylinder extends Shape{

    private double height;
    private double radius;

    public Cylinder(){
        super();
        this.height = 0.0;
        this.radius = 0.0;
    }

    public Cylinder(double h, double r){
        super();
        this.height = h;
        this.radius = r;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder{");
        sb.append("height= ").append(height);
        sb.append(", radius= ").append(radius);
        sb.append(", volume= ").append(volume());
        sb.append(", surface area= ").append(surfaceArea());
        sb.append('}');
        return sb.toString();
    }
}
