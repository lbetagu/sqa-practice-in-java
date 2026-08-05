package com.tyba.sqapractice.jhoa.sprint_331;

public class Main {
    public static void main(String[] args) {
        Carro miCarro = new Carro("Mazda", "2");
        miCarro.mostrarInfo();

        Moto miMoto = new Moto("Yamaha", "NMAX");
        miMoto.mostrarInfo();

        miCarro.moverse();
        miCarro.conducir();
        miMoto.moverse();

    }
}
