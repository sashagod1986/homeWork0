package org.example;

public class Fish extends Animals {
    private String name;
    public Fish(String name){ super(name); }
    public void swim() { System.out.println("Fish swin"); }
    @Override
    public void voice() { System.out.println("Fish voice"); }
    @Override
    public void run() { System.out.println("Fish run"); }



}
