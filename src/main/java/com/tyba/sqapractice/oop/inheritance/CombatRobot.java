package com.tyba.sqapractice.oop.inheritance;

/**
 * TOPIC 2: Inheritance
 *
 * CombatRobot INHERITS from Robot.
 * It carries bullets and attacks by shooting them.
 */
public class CombatRobot extends Robot {

    private int bulletCount;

    public CombatRobot(String name, int energyLevel, int bulletCount) {
        super(name, energyLevel);
        this.bulletCount = bulletCount;
    }

    /** POLYMORPHISM: overrides the base attack() behavior */
    @Override
    public String attack() {
        if (bulletCount > 0) {
            bulletCount--;
            return name + " fires a bullet! 💥 Remaining ammo: " + bulletCount;
        }
        return name + " is OUT OF AMMO! Reloading...";
    }

    public String reload(int bullets) {
        this.bulletCount += bullets;
        return name + " reloaded! Total ammo: " + bulletCount;
    }

    public int getBulletCount() { return bulletCount; }
}
