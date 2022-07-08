package org.example;

public class Main {
    public static void main(String[] args) {
        KitchenAppliances kettle = new Kettle("kettle");
        kettle.make();
        KitchenAppliances coffeeMachine = new CoffeeMachine("coffeeMachine");
        coffeeMachine.make();
        KitchenAppliances washingMachine = new WashingMachine("washingMachine");
        washingMachine.make();
    }
}