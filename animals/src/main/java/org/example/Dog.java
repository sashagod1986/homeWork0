package org.example;

public class Dog extends Animals{
    private String name;
    public Dog(String name){ super(name); }

    @Override
    public void voice() { System.out.println("voice gav"); }
    @Override
    public void run() { System.out.println("run dog tygydyk"); }
    public void jump() { System.out.println("dog jump"); }
}
