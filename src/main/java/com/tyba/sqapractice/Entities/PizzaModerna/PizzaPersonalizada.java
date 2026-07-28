package com.tyba.sqapractice.Entities.PizzaModerna;

import com.tyba.sqapractice.Entities.PizzaTradicional.Empacable;

import java.util.ArrayList;
import java.util.List;

public class PizzaPersonalizada implements Empacable {
    
    private String nombreCliente;
    private double precioBase = 10.00; // Precio base solo por el horneado
    
    // --- AQUÍ ESTÁ LA COMPOSICIÓN ("TIENE UN") ---
    private Masa masa; // La pizza TIENE UNA masa
    private List<Ingrediente> ingredientes; // La pizza TIENE MUCHOS ingredientes

    public PizzaPersonalizada(String nombreCliente, Masa masa) {
        this.nombreCliente = nombreCliente;
        this.masa = masa;
        this.ingredientes = new ArrayList<>(); // Inicializamos la lista vacía
    }

    // Método para ensamblar la pizza dinámicamente
    public void agregarIngrediente(Ingrediente ingrediente) {
        this.ingredientes.add(ingrediente);
        System.out.println("➕ Agregado: " + ingrediente.getNombre() + " ($" + ingrediente.getPrecio() + ")");
    }

    // El precio se calcula delegando la responsabilidad a los componentes que la forman
    public double calcularPrecioTotal() {
        double total = this.precioBase + this.masa.getCostoAdicional();
        for (Ingrediente ing : this.ingredientes) {
            total += ing.getPrecio();
        }
        return total;
    }

    public void mostrarReceta() {
        System.out.println("\n🍕 Pizza para: " + nombreCliente);
        System.out.println("   Masa: " + masa.getTipo() + " (++" + masa.getCostoAdicional() + ")");
        System.out.print("   Ingredientes: ");
        for (Ingrediente ing : ingredientes) {
            System.out.print("[" + ing.getNombre() + "] ");
        }
        System.out.println("\n   💰 Precio Total: $" + calcularPrecioTotal());
    }

    @Override
    public void empacarEnCaja() {
        System.out.println("📦 Pizza personalizada empacada con cuidado para " + nombreCliente);
    }

    @Override
    public void ponerSelloDeGarantia() {
        System.out.println("🔒 Sello de garantía aplicado.");
    }
}