package org.example;

import java.security.spec.RSAOtherPrimeInfo;

public abstract class Animals implements Actions {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private int weight;
    public int getWeight() { return weight; }
    public void setWeight(int weight) { this.weight = weight; }
    public Animals(String name){ this.name = name; }


}
