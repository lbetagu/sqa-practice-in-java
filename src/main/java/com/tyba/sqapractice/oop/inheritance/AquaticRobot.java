package com.tyba.sqapractice.oop.inheritance;

/**
 * TOPIC 2: Inheritance
 *
 * AquaticRobot INHERITS from Robot.
 * It can swim and attacks by launching torpedoes.
 */
public class AquaticRobot extends Robot {

    private int depth; // meters underwater

    public AquaticRobot(String name, int energyLevel, int depth) {
        super(name, energyLevel);
        this.depth = depth;
    }

    /** POLYMORPHISM: overrides the base attack() behavior */
    @Override
    public String attack() {
        return name + " launches a torpedo from " + depth + "m underwater! 🌊";
    }

    public String swim() {
        return name + " dives to " + depth + " meters and swims silently! 🤿";
    }

    public int getDepth() { return depth; }
}
