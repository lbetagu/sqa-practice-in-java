package com.tyba.sqapractice.Entities.PizzaModerna;

public class PizzeriaModerna {

    public static void main(String[] args) {
        
        System.out.println("--- CREANDO PIZZAS CON COMPOSICIÓN ---");

        // 1. Fabricamos nuestras "piezas de Lego" disponibles en la cocina
        Masa masaSinGluten = new Masa("Sin Gluten", 3.50);
        Masa masaBordeQueso = new Masa("Borde Relleno de Queso", 4.00);

        Ingrediente pepperoni = new Ingrediente("Pepperoni", 2.00);
        Ingrediente piña = new Ingrediente("Piña", 1.50);
        Ingrediente champiñones = new Ingrediente("Champiñones", 1.75);
        Ingrediente jamon = new Ingrediente("Jamón", 2.00);
        Ingrediente queso = new Ingrediente("queso", 1.80);
        Ingrediente tocineta = new Ingrediente("tocineta", 2.20);
        Ingrediente pollo = new Ingrediente("pollo", 2.40);

        // 2. Armamos el Pedido 1: Una hawaiana chick sin gluten
        PizzaPersonalizada pedido1 = new PizzaPersonalizada("Hermione Granger", masaBordeQueso);
        pedido1.agregarIngrediente(jamon);
        pedido1.agregarIngrediente(piña);
        pedido1.agregarIngrediente(pollo);
        pedido1.agregarIngrediente(tocineta);
        pedido1.agregarIngrediente(champiñones);
        pedido1.agregarIngrediente(queso);
        
        pedido1.mostrarReceta();
        pedido1.empacarEnCaja();

        // 3. Armamos el Pedido 2: pizza de carnes
        PizzaPersonalizada pedido2 = new PizzaPersonalizada("Harry Potter", masaSinGluten);
        pedido2.agregarIngrediente(queso);
        pedido2.agregarIngrediente(tocineta);
        pedido2.agregarIngrediente(jamon);
        pedido2.agregarIngrediente(pollo);
        pedido2.agregarIngrediente(pepperoni);
        pedido2.agregarIngrediente(pepperoni); // ¡Doble pepperoni!
        
        pedido2.mostrarReceta();
    }
    
}
