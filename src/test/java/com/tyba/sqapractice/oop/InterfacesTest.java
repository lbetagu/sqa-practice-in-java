package com.tyba.sqapractice.oop;

import com.tyba.sqapractice.oop.interfaces.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * TOPIC 3 Tests: Interfaces vs Abstract Classes
 */
class InterfacesTest {

    @Test
    void ultraRobotCanFly() {
        UltraRobot robot = new UltraRobot("Omega", 100);
        String result = robot.fly();
        assertTrue(result.contains("Omega"));
        assertFalse(result.isEmpty());
    }

    @Test
    void ultraRobotCanSwim() {
        UltraRobot robot = new UltraRobot("Omega", 100);
        String result = robot.swim();
        assertTrue(result.contains("Omega"));
    }

    @Test
    void ultraRobotCanFireLaser() {
        UltraRobot robot = new UltraRobot("Omega", 100);
        String result = robot.fireLaser();
        assertTrue(result.toLowerCase().contains("laser"));
    }

    @Test
    void ultraRobotCanFireBullet() {
        UltraRobot robot = new UltraRobot("Omega", 100);
        String result = robot.fireBullet();
        assertTrue(result.toLowerCase().contains("bullet"));
    }

    @Test
    void ultraRobotInheritsRechargeFromAbstractClass() {
        UltraRobot robot = new UltraRobot("Omega", 50);
        assertEquals(50, robot.getEnergyLevel());
        String result = robot.recharge();
        assertEquals(100, robot.getEnergyLevel());
        assertTrue(result.contains("100%"));
    }

    @Test
    void ultraRobotImplementsSpecialAbility() {
        UltraRobot robot = new UltraRobot("Omega", 100);
        String result = robot.performSpecialAbility();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void flyableDefaultLandMethodWorks() {
        // Interfaces can have default methods!
        UltraRobot robot = new UltraRobot("Omega", 100);
        String landing = robot.land();
        assertTrue(landing.toLowerCase().contains("land"));
    }

    @Test
    void ultraRobotIsInstanceOfAllTypes() {
        UltraRobot robot = new UltraRobot("Omega", 100);

        // Can be treated as any of its interfaces or parent class
        assertTrue(robot instanceof AbstractRobot);
        assertTrue(robot instanceof Flyable);
        assertTrue(robot instanceof Swimmable);
        assertTrue(robot instanceof LaserShooter);
        assertTrue(robot instanceof BulletShooter);
    }
}
