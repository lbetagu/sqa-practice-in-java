package com.tyba.sqapractice.jhoa.sprint_331;

public class Vehiculo {
    String marca;
    String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarInfo() {
        System.out.println("Vehiculo: " + marca + " " + modelo);
    }
}