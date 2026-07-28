package com.tyba.sqapractice.Entities.PizzaModerna;

// Componente 1: La Masa
public class Masa {
    private String tipo;      // Ej: "Sin Gluten", "Borde de Queso"
    private double costoAdicional;

    public Masa(String tipo, double costoAdicional) {
        this.tipo = tipo;
        this.costoAdicional = costoAdicional;
    }

    public String getTipo() { return tipo; }
    public double getCostoAdicional() { return costoAdicional; }
}