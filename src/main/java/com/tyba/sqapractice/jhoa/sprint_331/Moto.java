package com.tyba.sqapractice.jhoa.sprint_331;

public class Moto extends Vehiculo {

    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Esta es una moto, marca " + getMarca() + ", modelo " + getModelo());
    }

    @Override
    public void moverse() {
        System.out.println("La moto se mueve sobre 2 llantas.");
    }

}
