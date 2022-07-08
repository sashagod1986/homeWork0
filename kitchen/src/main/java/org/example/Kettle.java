package org.example;

public class Kettle extends KitchenAppliances {
    private String name;
    public Kettle(String name){
        super(name);
    }
    @Override
    public void make() { System.out.println("boil water"); }
}
