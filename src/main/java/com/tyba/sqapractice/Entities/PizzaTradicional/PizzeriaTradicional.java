package com.tyba.sqapractice.Entities.PizzaTradicional;

import java.util.ArrayList;
import java.util.List;

public class PizzeriaTradicional {
    
    public static void main(String[] args) {
        
        // Creamos una lista que acepta objetos de tipo Padre (Pizza)
        List<Pizza> ordenesDelDia = new ArrayList<>();

        // POLIMORFISMO 
        // Podemos meter objetos Hijo dentro de una variable de tipo Padre
        ordenesDelDia.add(new PizzaHawaiana("Mediana", "Delgada",8,true));     // Hijo 
        ordenesDelDia.add(new PizzaPepperoni("Grande", "Gruesa con borde de queso", 12)); // Hijo

        System.out.println("--- Encendiendo el horno del restaurante ---");

        // Creamos una variable para ir sumando la factura total de las pizzas.
         double totalFactura = 0;

        // Recorremos la lista y le decimos a cada pizza que se hornee.
        // El código solo dice "pizza.hornear()", pero cada una lo hará a su modo:
        for (Pizza pizza : ordenesDelDia) {

            // 1. USO DE GETTER HEREDADO: Consultamos el precio de forma segura
            System.out.println("\n--- Procesando orden por valor de: $" + pizza.getPrecioBase() + " ---");
            
            // Sumamos el precio de esta pizza al total acumulado
            totalFactura += pizza.getPrecioBase();

            pizza.hornear();
            pizza.prepararIngredientes();

            if (pizza instanceof Empacable) {
                // Hacemos un "casteo" ((Empacable) pizza) para poder usar los métodos de la caja
                Empacable pizzaCaja = (Empacable) pizza;
                pizzaCaja.empacarEnCaja();
                pizzaCaja.ponerSelloDeGarantia();
            }
        }

        // Imprimimos el resumen financiero usando los datos obtenidos por el getter
        System.out.println("\n=================================");
        System.out.println("💰 Total cobrado en el día: $" + totalFactura);
        System.out.println("=================================");
    }
}