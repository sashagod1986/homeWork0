package org.example;

public abstract class KitchenAppliances implements Actions {
    private String name;
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public KitchenAppliances(String name){ this.name = name; }
}
