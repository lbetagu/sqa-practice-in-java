package com.tyba.sqapractice.Entities;

public class PizzaHawaiana extends Pizza {
    
    boolean conPiña; // atributo exclusivo

    public PizzaHawaiana(String tamaño, String tipoMasa, int cantidadPorciones, boolean conPiña) {
        super(tamaño, tipoMasa, cantidadPorciones);
        this.conPiña = conPiña;
    }
    
    public void verificarAlergia() {
        if(conPiña) {
            System.out.println("🍍 Advertencia: ¡Esta pizza tiene piña, abstenerse de consumirla si tiene alergia a la piña!");
        }
    }

@Override
    public void hornear() {
        this.estaHorneada = true;
        System.out.println("🔥 Pizza Hawaiana, horneando a fuego lento para caramelizar la piña.");
    }

    @Override
    public void prepararIngredientes() {
        System.out.println("🍕 [Receta]: Estirando masa " + tipoMasa + " y poniendo 20 rodajas de piña.");
    }

}