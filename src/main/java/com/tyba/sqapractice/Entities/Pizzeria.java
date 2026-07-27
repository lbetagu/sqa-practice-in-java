package com.tyba.sqapractice.Entities;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    
    public static void main(String[] args) {
        
        // Creamos una lista que acepta objetos de tipo Padre (Pizza)
        List<Pizza> ordenesDelDia = new ArrayList<>();

        // ¡ POLIMORFISMO EN ACCIÓN ! 
        // Podemos meter objetos Hijo dentro de una variable de tipo Padre
        ordenesDelDia.add(new PizzaHawaiana("Mediana", "Delgada",8,true));     // Hijo 
        ordenesDelDia.add(new PizzaPepperoni("Grande", "Gruesa con borde de queso", 12)); // Hijo

        System.out.println("--- Encendiendo el horno del restaurante ---");

        // Recorremos la lista y le decimos a cada pizza que se hornee.
        // El código solo dice "pizza.hornear()", pero cada una lo hará a su modo:
        for (Pizza pizza : ordenesDelDia) {
            pizza.hornear();
            pizza.prepararIngredientes();

            if (pizza instanceof Empacable) {
                // Hacemos un "casteo" ((Empacable) pizza) para poder usar los métodos de la caja
                Empacable pizzaCaja = (Empacable) pizza;
                pizzaCaja.empacarEnCaja();
                pizzaCaja.ponerSelloDeGarantia();
            }
        }
    }
}