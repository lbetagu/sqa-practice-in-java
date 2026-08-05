package com.tyba.sqapractice.jhoa.sprint_331;

public class Carro extends Vehiculo implements Conducible {

    private Motor motor;

    public Carro(String marca, String modelo, String tipoMotor, int cilindraje) {
        super(marca, modelo);
        this.motor = new Motor(tipoMotor, cilindraje);
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

    public void arrancar() {
        motor.encender();
        System.out.println("El carro está listo para arrancar.");
    }

}
