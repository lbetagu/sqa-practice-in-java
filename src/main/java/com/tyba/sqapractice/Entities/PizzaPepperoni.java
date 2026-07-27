package com.tyba.sqapractice.Entities;

public class PizzaPepperoni extends Pizza implements Empacable{
    
    int adicionPimiento; // Atributo exclusivo de esta pizza

    public PizzaPepperoni(String tamaño, String tipoMasa, int cantidadPorciones) {
        // La palabra 'super' llama al constructor del Padre (Pizza)
        super(tamaño, tipoMasa, cantidadPorciones); 
        this.adicionPimiento = adicionPimiento;
    }

    // Método exclusivo de este hijo
    public void agregarPimiento() {
        System.out.println("🍕 Agregando " + this.adicionPimiento + " a la pizza de pepperoni.");
    }

    @Override
    public void prepararIngredientes() {
        System.out.println("🍕 [Receta]: Estirando masa " + tipoMasa + " y poniendo 30 rodajas de pepperoni.");
    }
    @Override
    public void empacarEnCaja() {
        System.out.println("📦 Metiendo la pizza de pepperoni en caja térmica roja.");
    }

    @Override
    public void ponerSelloDeGarantia() {
        System.out.println("🔒 Pegando sello de 'Cerrado en Cocina'.");
    }

}