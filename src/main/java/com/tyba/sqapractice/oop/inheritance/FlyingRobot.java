package com.tyba.sqapractice.oop.inheritance;

/**
 * TOPIC 2: Inheritance
 *
 * FlyingRobot INHERITS from Robot.
 * It adds flying capability and OVERRIDES attack() to fire lasers.
 */
public class FlyingRobot extends Robot {

    private int altitude; // meters

    public FlyingRobot(String name, int energyLevel, int altitude) {
        super(name, energyLevel); // calls Robot's constructor
        this.altitude = altitude;
    }

    /** POLYMORPHISM: overrides the base attack() behavior */
    @Override
    public String attack() {
        return name + " fires laser beams from " + altitude + "m altitude! 🔴";
    }

    public String fly() {
        return name + " activates jet boosters and soars to " + altitude + " meters! ✈️";
    }

    public int getAltitude() { return altitude; }
}
