package com.tyba.sqapractice.Entities;

public class Pizzeria {
    
    public static void main(String[] args) {
        
        System.out.println("--- Abriendo la Pizzería ---");

        // Objeto 1: Creamos una pizza pequeña
        Pizza pizzaPersonal = new Pizza("Pequeña", "Delgada", 4);
        
        // Objeto 2: Creamos una pizza grande con bordes de queso
        Pizza pizzaFamiliar = new Pizza("Familiar", "Bordes de queso", 10);

        // Interactuando con el Objeto 1
        System.out.println("\n-- Pedido de la mesa 1 --");
        pizzaPersonal.servir(); // Intentamos servirla cruda (dará error lógico)
        pizzaPersonal.hornear(); // La metemos al horno
        pizzaPersonal.servir();  // Ahora sí la servimos

        // Interactuando con el Objeto 2
        System.out.println("\n-- Pedido de la mesa 2 --");
        pizzaFamiliar.hornear(); 

    }
}