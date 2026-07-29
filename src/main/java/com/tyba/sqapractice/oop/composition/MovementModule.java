package com.tyba.sqapractice.oop.composition;

/**
 * TOPIC 5: Composition
 *
 * MovementModule handles how the robot moves.
 * It is composed into the Robot rather than the Robot inheriting movement.
 */
public class MovementModule {

    private String movementType; // "fly", "swim", "roll", "teleport"
    private int speed;           // km/h

    public MovementModule(String movementType, int speed) {
        this.movementType = movementType;
        this.speed = speed;
    }

    public String move() {
        return "Moving via [" + movementType + "] at " + speed + " km/h! 🚀";
    }

    // Factory methods for common movement types
    public static MovementModule flying()    { return new MovementModule("Flying",    800); }
    public static MovementModule swimming()  { return new MovementModule("Swimming",   60); }
    public static MovementModule rolling()   { return new MovementModule("Rolling",   120); }
    public static MovementModule teleport()  { return new MovementModule("Teleport", 9999); }

    public String getMovementType() { return movementType; }
    public int getSpeed()           { return speed; }
}
