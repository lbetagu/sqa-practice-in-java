package com.tyba.sqapractice.oop;

import com.tyba.sqapractice.oop.inheritance.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * TOPIC 2 Tests: Inheritance and Polymorphism
 */
class InheritanceTest {

    @Test
    void baseRobotPerformsBasicAttack() {
        Robot robot = new Robot("Generic", 100);
        String attack = robot.attack();
        assertTrue(attack.contains("Generic"));
        assertTrue(attack.contains("basic"));
    }

    @Test
    void flyingRobotOverridesAttackWithLaser() {
        FlyingRobot flyer = new FlyingRobot("Falcon", 100, 500);
        String attack = flyer.attack();
        assertTrue(attack.contains("laser"), "FlyingRobot should fire lasers");
        assertTrue(attack.contains("500"), "Should mention altitude");
    }

    @Test
    void flyingRobotCanFly() {
        FlyingRobot flyer = new FlyingRobot("Falcon", 100, 500);
        String fly = flyer.fly();
        assertTrue(fly.contains("500"));
    }

    @Test
    void aquaticRobotOverridesAttackWithTorpedo() {
        AquaticRobot aqua = new AquaticRobot("Shark", 100, 200);
        String attack = aqua.attack();
        assertTrue(attack.contains("torpedo"), "AquaticRobot should launch torpedoes");
        assertTrue(attack.contains("200"), "Should mention depth");
    }

    @Test
    void aquaticRobotCanSwim() {
        AquaticRobot aqua = new AquaticRobot("Shark", 100, 200);
        String swim = aqua.swim();
        assertTrue(swim.contains("200"));
    }

    @Test
    void combatRobotFiresBulletsAndDecrementsCount() {
        CombatRobot combat = new CombatRobot("Tank", 100, 5);
        assertEquals(5, combat.getBulletCount());

        combat.attack();
        assertEquals(4, combat.getBulletCount());
    }

    @Test
    void combatRobotRunsOutOfAmmo() {
        CombatRobot combat = new CombatRobot("Tank", 100, 1);
        combat.attack(); // fires last bullet
        String result = combat.attack(); // should be out of ammo
        assertTrue(result.contains("OUT OF AMMO"));
    }

    @Test
    void combatRobotCanReload() {
        CombatRobot combat = new CombatRobot("Tank", 100, 0);
        combat.reload(10);
        assertEquals(10, combat.getBulletCount());
    }

    /**
     * POLYMORPHISM in action:
     * Each robot type responds differently to the same attack() call.
     */
    @Test
    void polymorphismDifferentAttacksFromSameMethod() {
        Robot[] robots = {
            new FlyingRobot("Eagle", 100, 300),
            new AquaticRobot("Mako", 100, 100),
            new CombatRobot("Bullet", 100, 5)
        };

        String[] expectedKeywords = { "laser", "torpedo", "bullet" };

        for (int i = 0; i < robots.length; i++) {
            String attack = robots[i].attack().toLowerCase();
            assertTrue(attack.contains(expectedKeywords[i]),
                    "Expected " + expectedKeywords[i] + " in: " + attack);
        }
    }
}
