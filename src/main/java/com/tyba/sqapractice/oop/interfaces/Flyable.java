package com.tyba.sqapractice.oop.interfaces;

/**
 * TOPIC 3: Interfaces
 *
 * An interface defines a CONTRACT — it says WHAT a robot can do,
 * but NOT how it does it. Classes that implement it must provide the "how".
 *
 * Key: A class can implement MULTIPLE interfaces.
 */
public interface Flyable {

    /** Any robot that can fly MUST implement this */
    String fly();

    /** Default method: interfaces CAN have a default implementation (Java 8+) */
    default String land() {
        return "Initiating landing sequence... touchdown!";
    }
}
