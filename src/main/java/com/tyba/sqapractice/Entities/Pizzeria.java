package com.tyba.sqapractice.Entities;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    
    public static void main(String[] args) {
        
        // Creamos una lista que acepta objetos de tipo Padre (Pizza)
        List<Pizza> ordenesDelDia = new ArrayList<>();

        // ¡ POLIMORFISMO EN ACCIÓN ! 
        // Podemos meter objetos Hijo dentro de una variable de tipo Padre
        ordenesDelDia.add(new Pizza("Pequeña", "Delgada",6));             // Pizza normal
        ordenesDelDia.add(new PizzaHawaiana("Mediana", "Delgada",8,true));     // Hijo 

        System.out.println("--- Encendiendo el horno del restaurante ---");

        // Recorremos la lista y le decimos a cada pizza que se hornee.
        // Fíjate que el código solo dice "pizza.hornear()", pero cada una lo hará a su modo:
        for (Pizza pizza : ordenesDelDia) {
            pizza.hornear();
        }
    }
}