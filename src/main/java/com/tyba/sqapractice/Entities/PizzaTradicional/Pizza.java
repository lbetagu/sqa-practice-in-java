package com.tyba.sqapractice.Entities.PizzaTradicional;

public abstract class Pizza {
    
    protected String tamaño;
    protected String tipoMasa;
    protected int cantidadPorciones;
    protected boolean estaHorneada;
    
    private double precioBase;


    public Pizza(String tamaño, String tipoMasa, int cantidadPorciones, double precioBaseInicial) {
        this.tamaño = tamaño;
        this.tipoMasa = tipoMasa;
        this.cantidadPorciones = cantidadPorciones;
        this.estaHorneada = false;
        setPrecioBase(precioBaseInicial);
    }

// --- GETTERS (Ventanas de solo lectura para el público) ---
    
    public double getPrecioBase() {
        return this.precioBase;
    }

    public void setPrecioBase(double nuevoPrecio) {
        // AQUÍ ESTÁ EL PODER DEL ENCAPSULAMIENTO: Validamos antes de guardar
        if (nuevoPrecio <= 0) {
            throw new IllegalArgumentException("❌ Error de Seguridad: El precio de una pizza no puede ser $0 ni negativo (" + nuevoPrecio + ")");
        }
        this.precioBase = nuevoPrecio;
    }

    public boolean isEstaHorneada() { // Por convención, para booleanos usamos "is" en vez de "get"
        return this.estaHorneada;
    }

    public void hornear() {
        this.estaHorneada = true;
        System.out.println("🔥 Horneando pizza básica de masa " + this.tipoMasa + " de " + this.cantidadPorciones +" porciones.");
    }

    public abstract void prepararIngredientes();
}