package org.example;

public class Circle implements Actions{
    private final double Pi = 3.1415926536;
    private double diameter = 0;
    public Circle(double diameter){
        this.diameter = diameter;
    }
    public void perimeter() {
        double p = Pi*diameter;
        System.out.println("perimeter="+p);
    }
    public void space() {
        double s = Pi*Math.pow(diameter/2,2);
        System.out.println("space="+s);
    }
}
