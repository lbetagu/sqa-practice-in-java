package com.tyba.sqapractice.oop.composition;

/**
 * TOPIC 5: Composition vs Inheritance
 *
 * WeaponModule is a standalone component that can be injected into a Robot.
 * The Robot USES a weapon — it HAS-A weapon (composition).
 *
 * Key advantage: we can SWAP or UPGRADE the weapon at runtime,
 * which is impossible with pure inheritance.
 */
public class WeaponModule {

    private String weaponType;
    private int damage;
    private int range; // meters

    public WeaponModule(String weaponType, int damage, int range) {
        this.weaponType = weaponType;
        this.damage = damage;
        this.range = range;
    }

    public String fire() {
        return "Firing " + weaponType + " → " + damage + " damage at " + range + "m range! 💥";
    }

    // Factory methods for common weapon types
    public static WeaponModule laser()  {
        return new WeaponModule("Laser Cannon", 80, 500);
    }

    public static WeaponModule bullets() {
        return new WeaponModule("Bullet Turret", 40, 200);
    }

    public static WeaponModule missile() {
        return new WeaponModule("Missile Launcher", 150, 2000);
    }

    public String getWeaponType() { return weaponType; }
    public int getDamage()        { return damage; }
    public int getRange()         { return range; }
}
