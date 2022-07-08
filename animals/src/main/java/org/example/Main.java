package org.example;

public class Main {
    public static void main(String[] args) {
        Cat simon =  new Cat("Simon");
        simon.voice();
        simon.run();
        simon.jump();
        System.out.println();
        Dog milo = new Dog("Milo");
        milo.voice();
        milo.run();
        milo.jump();
        System.out.println();
        Fish nemo = new Fish("Nemo");
        nemo.voice();
        nemo.swim();
        System.out.println();
        Bird ozzy = new Bird("Ozzy");
        ozzy.voice();
        ozzy.fly();
    }
}