package com.tyba.sqapractice.oop.composition;

/**
 * TOPIC 5: Composition vs Inheritance
 *
 * COMPOSITION: Robot HAS-A weapon, HAS-A movement system, HAS-A sensor.
 * Instead of BEING a FlyingRobot or CombatRobot (inheritance),
 * this Robot is built by assembling modular components.
 *
 * KEY ADVANTAGES over inheritance:
 * 1. Flexible at runtime — can swap modules without changing the class
 * 2. Avoids deep inheritance chains
 * 3. Each module can be tested independently
 * 4. No "fragile base class" problem
 *
 * Mantra: "Prefer composition over inheritance" — GoF Design Patterns
 */
public class Robot {

    private String name;
    private WeaponModule weapon;        // HAS-A weapon
    private MovementModule movement;    // HAS-A movement system
    private SensorModule sensor;        // HAS-A sensor

    public Robot(String name, WeaponModule weapon, MovementModule movement, SensorModule sensor) {
        this.name = name;
        this.weapon = weapon;
        this.movement = movement;
        this.sensor = sensor;
    }

    // --- BEHAVIORS delegated to modules ---

    public String attack() {
        return name + " → " + weapon.fire();
    }

    public String move() {
        return name + " → " + movement.move();
    }

    public String scan() {
        return name + " → " + sensor.scan();
    }

    // --- RUNTIME FLEXIBILITY: swap modules without changing the Robot class ---

    public void upgradeWeapon(WeaponModule newWeapon) {
        System.out.println(name + " upgrading weapon from ["
                + weapon.getWeaponType() + "] to [" + newWeapon.getWeaponType() + "]");
        this.weapon = newWeapon;
    }

    public void upgradeMovement(MovementModule newMovement) {
        this.movement = newMovement;
    }

    public void upgradeSensor(SensorModule newSensor) {
        this.sensor = newSensor;
    }

    public String getStatus() {
        return "[" + name + "]"
                + " | Weapon: " + weapon.getWeaponType()
                + " | Movement: " + movement.getMovementType()
                + " | Sensor: " + sensor.getSensorType() + " (" + sensor.getRange() + "m)";
    }

    public String getName()               { return name; }
    public WeaponModule getWeapon()       { return weapon; }
    public MovementModule getMovement()   { return movement; }
    public SensorModule getSensor()       { return sensor; }
}
