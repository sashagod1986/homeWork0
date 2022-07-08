package org.example;

public class Main {
    public static void main(String[] args) {
        Triangle tri = new Triangle(5,4,3);
        tri.space();
        tri.perimeter();
        System.out.println();
        Circle cir = new Circle(5);
        cir.space();
        cir.perimeter();
        System.out.println();
        Square sq = new Square(5);
        sq.space();
        sq.perimeter();
    }
}