package org.example;

public class Triangle implements Actions {
    private double a = 0;
    private double b = 0;
    private double c = 0;
    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void perimeter() {
        double p = a+b+c;
        System.out.println("perimeter="+p);
    }
    public void space() {
        double p = (a+b+c)/2;
        System.out.println("space="+Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }
}
