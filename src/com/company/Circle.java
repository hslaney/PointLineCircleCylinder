package com.company;

public class Circle {
    //attribute
    private double radius;

    public Circle( double r )        //constructor
    {
        radius = r;

    }
    public Circle()         //default constructor
    {
        radius = 1;
    }
    public double circumference()
    {
        return 2*Math.PI*radius;

    }
    public double area()
    {
        return Math.PI * radius * radius;

    }


    public static void main(String[] args){
        Circle c1 = new Circle(10);
        System.out.println("The radius is " + c1.radius);
        System.out.println("The circumference is " + c1.circumference());
        System.out.println("The area is " + c1.area());

        System.out.println();

        Circle c2 = new Circle();
        System.out.println("The radius is " + c2.radius);
        System.out.println("The circumference is " + c2.circumference());
        System.out.println("The area is " + c2.area());

        System.out.println();

        Circle c3 = new Circle(5);
        System.out.println("The radius is " + c3.radius);
        System.out.println("The circumference is " + c3.circumference());
        System.out.println("The area is " + c3.area());
    }

}
/* Output:
The radius is 10.0
The circumference is 62.83185307179586
The area is 314.1592653589793

The radius is 1.0
The circumference is 6.283185307179586
The area is 3.141592653589793

The radius is 5.0
The circumference is 31.41592653589793
The area is 78.53981633974483

 */