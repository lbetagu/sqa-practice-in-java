package com.tyba.sqapractice.oop;

import com.tyba.sqapractice.oop.classes.Robot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * TOPIC 1 Tests: Classes, Objects, and Constructors
 */
class ClassesTest {

    @Test
    void defaultConstructorCreatesGenericRobot() {
        Robot robot = new Robot();
        assertEquals("Unknown", robot.getName());
        assertEquals("Generic-v1", robot.getModel());
        assertEquals(100, robot.getEnergyLevel());
        assertFalse(robot.isActive());
    }

    @Test
    void constructorWithNameSetsNameCorrectly() {
        Robot robot = new Robot("Alpha");
        assertEquals("Alpha", robot.getName());
        assertEquals("Generic-v1", robot.getModel());
    }

    @Test
    void fullConstructorSetsAllFields() {
        Robot robot = new Robot("Titan", "X-9000", 75);
        assertEquals("Titan", robot.getName());
        assertEquals("X-9000", robot.getModel());
        assertEquals(75, robot.getEnergyLevel());
        assertTrue(robot.isActive()); // full constructor activates the robot
    }

    @Test
    void introduceReturnsCorrectDescription() {
        Robot robot = new Robot("Nova", "Stealth-v3", 90);
        String intro = robot.introduce();
        assertTrue(intro.contains("Nova"));
        assertTrue(intro.contains("Stealth-v3"));
        assertTrue(intro.contains("90"));
    }

    @Test
    void activateAndDeactivateRobot() {
        Robot robot = new Robot("Blaze");
        assertFalse(robot.isActive());

        String result = robot.activate();
        assertTrue(robot.isActive());
        assertTrue(result.contains("ACTIVE"));

        robot.deactivate();
        assertFalse(robot.isActive());
    }
}
