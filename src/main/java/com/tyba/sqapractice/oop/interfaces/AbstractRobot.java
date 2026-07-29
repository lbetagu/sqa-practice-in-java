package com.tyba.sqapractice.oop.interfaces;

/**
 * TOPIC 3: Abstract Class vs Interface
 *
 * ABSTRACT CLASS differences from Interface:
 * - CAN have constructors           (interfaces cannot)
 * - CAN have instance fields        (interfaces cannot have state)
 * - CAN have concrete methods       (interfaces need 'default' keyword)
 * - CAN have any access modifier    (interface methods are public by default)
 * - A class can only extend ONE abstract class
 *   but can implement MULTIPLE interfaces
 *
 * Use abstract class when: subclasses share common state and base behavior.
 */
public abstract class AbstractRobot {

    // Shared fields (interfaces can't have these)
    protected String name;
    public int energyLevel;

    public AbstractRobot(String name, int energyLevel) {
        this.name = name;
        this.energyLevel = energyLevel;
    }

    // Concrete method: shared behavior, no need to override
    public String recharge() {
        energyLevel = 100;
        return name + " fully recharged! Energy: 100% ⚡";
    }

    // Concrete method: shared behavior
    public String getStatus() {
        return "[" + name + "] Energy: " + energyLevel + "%";
    }

    // Abstract method: EVERY subclass MUST implement this
    public abstract String performSpecialAbility();

    // Public getter for energyLevel
    public int getEnergyLevel() { return energyLevel; }
}
