package com.tyba.sqapractice.oop.inheritance;

/**
 * TOPIC 2: Inheritance and Polymorphism
 *
 * Base class Robot — defines common behavior for all robots.
 * Subclasses will OVERRIDE the attack() method (polymorphism).
 */
public class Robot {

    protected String name;
    protected int energyLevel;

    public Robot(String name, int energyLevel) {
        this.name = name;
        this.energyLevel = energyLevel;
    }

    /** This method will be overridden by each robot type (polymorphism) */
    public String attack() {
        return name + " performs a basic punch attack!";
    }

    public String getStatus() {
        return "[" + name + "] Energy: " + energyLevel + "%";
    }

    public String getName()     { return name; }
    public int getEnergyLevel() { return energyLevel; }
}
