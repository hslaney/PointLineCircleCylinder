package com.company;

public class Cylinder {
    //attributes
    private double height;
    private Circle crc;

    public Cylinder()       //default constructor
    {
        height = 1;
        crc = new Circle();
    }

    public Cylinder(double h, double radius )
    {
        height = h;
        crc = new Circle(radius);

    }

    public double vol()
    {
        double volume = crc.area() * height;
        return volume;

    }
    public double sa()
    {
        double surfaceArea = crc.circumference() * height + crc.area() * 2;
        return surfaceArea;
    }


}
