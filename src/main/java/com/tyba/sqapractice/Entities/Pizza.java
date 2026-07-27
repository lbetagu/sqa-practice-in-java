package com.tyba.sqapractice.Entities;

public class Pizza {
    String tamaño;
    String tipoMasa;
    int cantidadPorciones;
    boolean estaHorneada;

    public Pizza(String tamaño, String tipoMasa, int cantidadPorciones) {
        this.tamaño = tamaño;
        this.tipoMasa = tipoMasa;
        this.cantidadPorciones = cantidadPorciones;
        this.estaHorneada = false;
    }

    public void hornear() {
        this.estaHorneada = true;
        System.out.println("🔥 Horneando pizza básica de masa " + this.tipoMasa + " de " + this.cantidadPorciones +" porciones.");
    }
}