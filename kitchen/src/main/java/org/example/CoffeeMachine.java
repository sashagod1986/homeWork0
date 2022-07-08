package org.example;

public class CoffeeMachine extends KitchenAppliances {
    private String name;
    public CoffeeMachine(String name){
        super(name);
    }
    @Override
    public void make() { System.out.println("make coffee"); }
}
