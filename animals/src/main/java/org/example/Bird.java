package org.example;

public class Bird extends Animals{
    private String name;
    public Bird(String name){ super(name); }
    public void fly() { System.out.println("bird fly"); }
    @Override
    public void voice() { System.out.println("bird voice"); }
    @Override
    public void run() { System.out.println("bird run"); }

}
