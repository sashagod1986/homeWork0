package org.example;

public abstract class Transport implements Actions {
    private String type;
    public Transport(String type){ this.type = type; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

}
