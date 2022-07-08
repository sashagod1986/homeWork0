package org.example;

public class Motobike extends Transport {
    private String type;
    public Motobike(String type){super(type);}
    public void go(){ System.out.println("Bike ride"); }
    public void carriesCargo() {System.out.println("Bike carries cargo");}
    public void carryingPassengers() {System.out.println("Bike carrying passengers");}
}
