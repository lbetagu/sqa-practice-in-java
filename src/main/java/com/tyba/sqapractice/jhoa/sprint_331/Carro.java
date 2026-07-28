package com.tyba.sqapractice.jhoa.sprint_331;

public class Carro extends Vehiculo {

    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Este es un carro, marca " + marca + ", modelo " + modelo);
    }
}
