package org.example;

public class Car extends Transport {
    private String type;
    public Car(String type){super(type);}
    public void go(){ System.out.println("Car ride"); }
    public void carriesCargo() {System.out.println("Car carries cargo");}
    public void carryingPassengers() {System.out.println("Car carrying passengers");}
}
