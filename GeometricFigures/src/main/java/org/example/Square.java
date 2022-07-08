package org.example;

public class Square implements Actions{
    private double a = 0;
    public Square(double a){
        this.a = a;
    }
    public void perimeter() {
        double p = a*4;
        System.out.println("perimeter="+p);
    }
    public void space() {
        double s = Math.pow(a,2);
        System.out.println("space="+s);
    }
}
