package com.tyba.sqapractice.Test;

import org.junit.jupiter.api.Test;

import com.tyba.sqapractice.Entities.PizzaModerna.PizzeriaModerna;

public class PizzeriaModernaTest {

    @Test
    public void ordenarPizza() {
    System.out.println("Tomando la orden de la pizza...");
        
        // El método main exige un arreglo de Strings como parámetro (args).
        // Le pasamos un arreglo vacío porque no estamos usando argumentos de consola.
        String[] argumentosVacios = {}; 
        
        // Llamamos a la clase y a su método directamente
        PizzeriaModerna.main(argumentosVacios);
        
        System.out.println("Enviando pizza.");
    
}

}