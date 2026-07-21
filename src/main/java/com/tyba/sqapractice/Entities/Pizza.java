package com.tyba.sqapractice.Entities;

public class Pizza {
    
    // 1. Atributos (Las características de la pizza)
    String tamaño;        // ej: "Pequeña", "Mediana", "Familiar"
    String tipoMasa;      // ej: "Delgada", "Gruesa", "Bordes de queso"
    int cantidadPorciones;
    boolean estaHorneada; // Para saber si ya salió del horno

    // 2. El Constructor (El momento en que armamos la pizza cruda)
    public Pizza(String tamaño, String tipoMasa, int cantidadPorciones) {
        this.tamaño = tamaño;
        this.tipoMasa = tipoMasa;
        this.cantidadPorciones = cantidadPorciones;
        this.estaHorneada = false; // Toda pizza nace cruda por defecto
    }

    // 3. Métodos (Lo que le puede pasar a la pizza)
    public void hornear() {
        if (!estaHorneada) {
            this.estaHorneada = true;
            System.out.println("La pizza " + this.tamaño + " está horneada y lista.");
        } else {
            System.out.println("Cuidado, la pizza ya estaba horneada. ¡Se va a quemar!");
        }
    }

    public void servir() {
        if (estaHorneada) {
            System.out.println("Sirviendo " + this.cantidadPorciones + " porciones de masa " + this.tipoMasa + ".");
        } else {
            System.out.println("No puedes servir una pizza cruda. ¡Hornéala primero!");
        }
    }
}