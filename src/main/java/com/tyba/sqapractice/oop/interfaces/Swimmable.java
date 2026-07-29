package com.tyba.sqapractice.oop.interfaces;

/** TOPIC 3: Interface — defines the swim contract */
public interface Swimmable {
    String swim();
    default String surface() {
        return "Rising to the surface!";
    }
}
