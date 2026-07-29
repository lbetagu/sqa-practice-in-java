package com.tyba.sqapractice.oop.composition;

/**
 * TOPIC 5: Composition
 *
 * SensorModule gives the robot the ability to detect enemies.
 */
public class SensorModule {

    private String sensorType; // "radar", "infrared", "sonar"
    private int range;         // detection range in meters

    public SensorModule(String sensorType, int range) {
        this.sensorType = sensorType;
        this.range = range;
    }

    public String scan() {
        return "Scanning with " + sensorType + " — detecting within " + range + "m! 📡";
    }

    // Factory methods
    public static SensorModule radar()    { return new SensorModule("Radar",    1000); }
    public static SensorModule infrared() { return new SensorModule("Infrared",  300); }
    public static SensorModule sonar()    { return new SensorModule("Sonar",     800); }

    public String getSensorType() { return sensorType; }
    public int getRange()         { return range; }
}
