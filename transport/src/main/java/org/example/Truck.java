package org.example;

public class Truck extends Transport {
    private String type;
    public Truck(String type){super(type);}
    public void go(){ System.out.println("Truck ride"); }
    public void carriesCargo() {System.out.println("Truck carries cargo");}
    public void carryingPassengers() {System.out.println("Truck carrying passengers");}
}
