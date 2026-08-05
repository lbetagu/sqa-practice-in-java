package com.tyba.sqapractice.jhoa.sprint_331;

public class Motor {
    private String tipo;
    private int cilindraje;

    public Motor(String tipo, int cilindraje) {
        this.tipo = tipo;
        this.cilindraje = cilindraje;
    }

    public void encender() {
        System.out.println("El motor " + tipo + " de " + cilindraje + "cc está encendido. ¡Rrum rrum!");
    }
}
