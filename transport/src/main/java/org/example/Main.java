package org.example;

public class Main {
    public static void main(String[] args) {
        Transport harley = new Motobike("Harley");
        harley.go();
        harley.carryingPassengers();
        harley.carriesCargo();
        System.out.println();
        Transport vw = new Car("Volkswagen");
        vw.go();
        vw.carryingPassengers();
        vw.carriesCargo();
        System.out.println();
        Transport daf = new Truck("DAF");
        daf.go();
        daf.carryingPassengers();
        daf.carriesCargo();

    }
}