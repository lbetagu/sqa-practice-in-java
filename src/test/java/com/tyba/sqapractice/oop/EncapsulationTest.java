package com.tyba.sqapractice.oop;

import com.tyba.sqapractice.oop.encapsulation.Robot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * TOPIC 4 Tests: Encapsulation and Access Modifiers
 */
class EncapsulationTest {

    @Test
    void constructorSetsFieldsCorrectly() {
        Robot robot = new Robot("Blaze", "Titan-X", 80);
        assertEquals("Blaze", robot.getName());
        assertEquals("Titan-X", robot.getModel());
        assertEquals(80, robot.getArmorPoints());
        assertEquals(Robot.MAX_ENERGY, robot.getEnergyLevel()); // starts full
    }

    @Test
    void setEnergyValidatesUpperBound() {
        Robot robot = new Robot("Blaze", "Titan-X", 80);
        robot.setEnergyLevel(999); // way above max
        assertEquals(Robot.MAX_ENERGY, robot.getEnergyLevel(), "Energy should cap at MAX_ENERGY");
    }

    @Test
    void setEnergyValidatesLowerBound() {
        Robot robot = new Robot("Blaze", "Titan-X", 80);
        robot.setEnergyLevel(-50); // below zero
        assertEquals(Robot.MIN_ENERGY, robot.getEnergyLevel(), "Energy should floor at MIN_ENERGY");
    }

    @Test
    void activateShieldConsumesEnergyWhenSufficient() {
        Robot robot = new Robot("Blaze", "Titan-X", 80);
        robot.setEnergyLevel(100);
        String result = robot.activateShield();
        assertEquals(70, robot.getEnergyLevel(), "Shield costs 30 energy");
        assertTrue(result.contains("activated"));
    }

    @Test
    void activateShieldFailsWhenEnergyTooLow() {
        Robot robot = new Robot("Blaze", "Titan-X", 80);
        robot.setEnergyLevel(20); // less than 30 required
        String result = robot.activateShield();
        assertEquals(20, robot.getEnergyLevel(), "Energy should not change on failed shield");
        assertTrue(result.contains("NOT ENOUGH ENERGY"));
    }

    @Test
    void fireLaserConsumes50Energy() {
        Robot robot = new Robot("Blaze", "Titan-X", 80);
        robot.setEnergyLevel(100);
        robot.fireLaser();
        assertEquals(50, robot.getEnergyLevel());
    }

    @Test
    void fireLaserFailsWhenEnergyBelow50() {
        Robot robot = new Robot("Blaze", "Titan-X", 80);
        robot.setEnergyLevel(40);
        String result = robot.fireLaser();
        assertTrue(result.contains("NOT ENOUGH ENERGY"));
        assertEquals(40, robot.getEnergyLevel(), "Energy unchanged when laser fails");
    }

    @Test
    void maxEnergyConstantIsPublicAndCorrect() {
        assertEquals(100, Robot.MAX_ENERGY);
        assertEquals(0, Robot.MIN_ENERGY);
    }
}
