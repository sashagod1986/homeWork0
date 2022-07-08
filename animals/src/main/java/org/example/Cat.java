package org.example;

public class Cat extends Animals {
    private String name;
    public Cat(String name){
        super(name);
    }
    public void jump() { System.out.println("cat jump"); }

    public void voice(){
        System.out.println("voice mya");
    }
    public void run(){
        System.out.println("run tygydyk");
    }


}
