package com.tyba.sqapractice.oop.interfaces;

/**
 * TOPIC 3: Interfaces vs Abstract Classes — combined example
 *
 * UltraRobot demonstrates:
 * - Extending ONE abstract class (AbstractRobot)
 * - Implementing MULTIPLE interfaces simultaneously
 *
 * This is the key advantage of interfaces:
 * a class can only extend 1 parent, but can implement many interfaces.
 */
public class UltraRobot extends AbstractRobot
        implements Flyable, Swimmable, LaserShooter, BulletShooter {

    public UltraRobot(String name, int energyLevel) {
        super(name, energyLevel);
    }


    // --- AbstractRobot abstract method ---
    @Override
    public String performSpecialAbility() {
        return name + " activates ALL systems simultaneously! 🤖💥";
    }

    // --- Flyable interface ---
    @Override
    public String fly() {
        return this.name + " fires jet boosters and takes to the sky! ✈️";
    }

    // --- Swimmable interface ---
    @Override
    public String swim() {
        return name + " converts to aqua mode and dives deep! 🌊";
    }

    // --- LaserShooter interface ---
    @Override
    public String fireLaser() {
        return name + " charges up and releases a devastating laser beam! 🔴";
    }

    // --- BulletShooter interface ---
    @Override
    public String fireBullet() {
        return name + " unleashes a rapid bullet storm! 💥";
    }
}
