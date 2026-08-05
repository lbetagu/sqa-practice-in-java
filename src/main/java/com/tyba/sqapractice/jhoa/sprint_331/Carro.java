package com.tyba.sqapractice.jhoa.sprint_331;

public class Carro extends Vehiculo implements Conducible {

    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Este es un carro, marca " + getMarca() + ", modelo " + getModelo());
    }

    @Override
    public void moverse() {
        System.out.println("El carro se mueve sobre 4 llantas.");
    }

    @Override
    public void conducir() {
        System.out.println("Estoy conduciendo el carro usando un volante.");
    }

}
