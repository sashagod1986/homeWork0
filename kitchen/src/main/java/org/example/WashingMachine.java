package org.example;

public class WashingMachine extends KitchenAppliances {
    private String name;
    public WashingMachine(String name){
        super(name);
    }
    @Override
    public void make() { System.out.println("washes things"); }
}
