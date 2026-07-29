package com.tyba.sqapractice.oop.encapsulation;

/**
 * TOPIC 4: Encapsulation and Access Modifiers
 *
 * Access Modifiers:
 * - private   → only accessible within THIS class
 * - (default) → accessible within the same package
 * - protected → accessible in this class + subclasses
 * - public    → accessible from ANYWHERE
 *
 * Encapsulation: hide internal state, expose controlled access via methods.
 */
public class Robot {

    // private: hidden from the outside world — only this class can touch it
    private String name;
    private int energyLevel;
    private int armorPoints;
    private String secretCode; // never exposed externally

    // protected: subclasses can access this
    protected String model;

    // package-private (no modifier): visible within the same package
    int internalSensorReading;

    // public constant: accessible by everyone, cannot be changed
    public static final int MAX_ENERGY = 100;
    public static final int MIN_ENERGY = 0;

    // -------------------------------------------------
    // CONSTRUCTOR
    // -------------------------------------------------
    public Robot(String name, String model, int armorPoints) {
        this.name = name;
        this.model = model;
        this.armorPoints = armorPoints;
        this.energyLevel = MAX_ENERGY;
        this.secretCode = "XR-" + Math.abs(name.hashCode() % 9999);
    }

    // -------------------------------------------------
    // PUBLIC GETTERS — controlled read access
    // -------------------------------------------------
    public String getName()     { return name; }
    public int getEnergyLevel() { return energyLevel; }
    public int getArmorPoints() { return armorPoints; }
    public String getModel()    { return model; }
    // Note: secretCode has NO getter — it's truly private

    // -------------------------------------------------
    // PUBLIC SETTERS — controlled write access with validation
    // -------------------------------------------------
    public void setEnergyLevel(int energy) {
        if (energy < MIN_ENERGY) energy = MIN_ENERGY;
        if (energy > MAX_ENERGY) energy = MAX_ENERGY;
        this.energyLevel = energy;
    }

    // -------------------------------------------------
    // PRIVATE METHODS — internal helpers, not exposed
    // -------------------------------------------------
    private boolean hasEnoughEnergy(int required) {
        return energyLevel >= required;
    }

    private void consumeEnergy(int amount) {
        energyLevel = Math.max(MIN_ENERGY, energyLevel - amount);
    }

    // -------------------------------------------------
    // PUBLIC BEHAVIOR — uses private helpers internally
    // -------------------------------------------------
    public String activateShield() {
        if (hasEnoughEnergy(30)) {
            consumeEnergy(30);
            return name + " shield activated! Energy remaining: " + energyLevel + "% 🛡️";
        }
        return name + " NOT ENOUGH ENERGY to activate shield! (" + energyLevel + "% < 30%)";
    }

    public String fireLaser() {
        if (hasEnoughEnergy(50)) {
            consumeEnergy(50);
            return name + " fires laser! Energy remaining: " + energyLevel + "% 🔴";
        }
        return name + " NOT ENOUGH ENERGY to fire laser! (" + energyLevel + "% < 50%)";
    }

    public String getStatus() {
        return "[" + name + "] Model: " + model
                + " | Energy: " + energyLevel + "%"
                + " | Armor: " + armorPoints;
    }
}
