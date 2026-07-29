package com.tyba.sqapractice.oop.classes;

/**
 * TOPIC 1: Classes, Objects, and Constructors
 *
 * This class demonstrates:
 * - Class definition with attributes (fields)
 * - Constructor overloading (multiple constructors)
 * - Object creation and state
 */
public class Robot {

    // Fields (attributes of the object)
    private String name;
    private String model;
    private int energyLevel;
    private boolean isActive;

    // -------------------------------------------------
    // CONSTRUCTORS (multiple ways to create a Robot)
    // -------------------------------------------------

    /** Default constructor: creates a generic robot */
    public Robot() {
        this.name = "Unknown";
        this.model = "Generic-v1";
        this.energyLevel = 100;
        this.isActive = false;
    }

    /** Constructor with just a name */
    public Robot(String name) {
        this.name = name;
        this.model = "Generic-v1";
        this.energyLevel = 100;
        this.isActive = false;
    }

    /** Full constructor: name + model + energy */
    public Robot(String name, String model, int energyLevel) {
        this.name = name;
        this.model = model;
        this.energyLevel = energyLevel;
        this.isActive = true;
    }

    // -------------------------------------------------
    // METHODS (behaviors of the object)
    // -------------------------------------------------

    public String introduce() {
        return "I am " + name + ", model: " + model + ", energy: " + energyLevel + "%";
    }

    public String activate() {
        this.isActive = true;
        return name + " is now ACTIVE!";
    }

    public String deactivate() {
        this.isActive = false;
        return name + " is now INACTIVE.";
    }

    // -------------------------------------------------
    // GETTERS
    // -------------------------------------------------

    public String getName()      { return name; }
    public String getModel()     { return model; }
    public int getEnergyLevel()  { return energyLevel; }
    public boolean isActive()    { return isActive; }
}
