package com.tyba.sqapractice.oop;

import com.tyba.sqapractice.oop.composition.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * TOPIC 5 Tests: Composition vs Inheritance
 */
class CompositionTest {

    @Test
    void robotWithLaserAndFlyingModules() {
        Robot robot = new Robot(
                "Phantom",
                WeaponModule.laser(),
                MovementModule.flying(),
                SensorModule.radar()
        );

        assertTrue(robot.attack().toLowerCase().contains("laser"));
        assertTrue(robot.move().toLowerCase().contains("flying"));
        assertTrue(robot.scan().toLowerCase().contains("radar"));
    }

    @Test
    void robotWithBulletsAndSwimmingModules() {
        Robot robot = new Robot(
                "Kraken",
                WeaponModule.bullets(),
                MovementModule.swimming(),
                SensorModule.sonar()
        );

        assertTrue(robot.attack().toLowerCase().contains("bullet"));
        assertTrue(robot.move().toLowerCase().contains("swimming"));
        assertTrue(robot.scan().toLowerCase().contains("sonar"));
    }

    @Test
    void canUpgradeWeaponAtRuntime() {
        Robot robot = new Robot(
                "Phantom",
                WeaponModule.bullets(),
                MovementModule.flying(),
                SensorModule.radar()
        );

        assertTrue(robot.attack().toLowerCase().contains("bullet"));

        // Upgrade weapon at runtime — impossible with pure inheritance!
        robot.upgradeWeapon(WeaponModule.missile());

        assertTrue(robot.attack().toLowerCase().contains("missile"),
                "After upgrade, robot should fire missiles");
    }

    @Test
    void canUpgradeMovementAtRuntime() {
        Robot robot = new Robot(
                "Phantom",
                WeaponModule.laser(),
                MovementModule.rolling(),
                SensorModule.infrared()
        );

        assertTrue(robot.move().toLowerCase().contains("rolling"));

        robot.upgradeMovement(MovementModule.teleport());

        assertTrue(robot.move().toLowerCase().contains("teleport"),
                "After upgrade, robot should teleport");
    }

    @Test
    void statusShowsAllModules() {
        Robot robot = new Robot(
                "Apex",
                WeaponModule.missile(),
                MovementModule.flying(),
                SensorModule.radar()
        );

        String status = robot.getStatus();
        assertTrue(status.contains("Apex"));
        assertTrue(status.contains("Missile"));
        assertTrue(status.contains("Flying"));
        assertTrue(status.contains("Radar"));
    }

    @Test
    void weaponModuleFiresCorrectly() {
        WeaponModule laser = WeaponModule.laser();
        assertEquals("Laser Cannon", laser.getWeaponType());
        assertEquals(80, laser.getDamage());
        assertTrue(laser.fire().contains("Laser Cannon"));
    }

    @Test
    void movementModuleMovesCorrectly() {
        MovementModule flight = MovementModule.flying();
        assertEquals("Flying", flight.getMovementType());
        assertEquals(800, flight.getSpeed());
    }

    @Test
    void sensorModuleScansCorrectly() {
        SensorModule radar = SensorModule.radar();
        assertEquals(1000, radar.getRange());
        assertTrue(radar.scan().contains("1000"));
    }
}
