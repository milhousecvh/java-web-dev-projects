package org.launchcode;

public class Main {

    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());   // prints true


        Cat mittens = new Cat(8.4);

        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight()); // prints 13

        System.out.println(spike.noise());
        System.out.println(mittens.noise());

        System.out.println(spike.isSatisfied());
    }
}
