package org.launchcode;

import org.launchcode.Cat;

public class HouseCat extends Cat {
        private String name;
        private String species = "Felis catus";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HouseCat(String aName, double aWeight) {
            super(aWeight);
            name = aName;
        }

        public HouseCat(String aName) {
            name = aName;
        }

        public boolean isSatisfied() {
            return !isHungry() && !isTired();
        }

        @Override
        public String noise() {
            return "Hello, my name is " + name + "!";
        }

        public String purr() {
            return "I'm a HouseCat";
        }
    }