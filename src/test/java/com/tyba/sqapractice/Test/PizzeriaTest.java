package com.tyba.sqapractice.Test;

import org.junit.jupiter.api.Test;

import com.tyba.sqapractice.Entities.Pizzeria;

public class PizzeriaTest {

    @Test
    public void ejecutarRutinaDeLaPizzeria() {
        System.out.println("Iniciando el test...");
        
        // El método main exige un arreglo de Strings como parámetro (args).
        // Le pasamos un arreglo vacío porque no estamos usando argumentos de consola.
        String[] argumentosVacios = {}; 
        
        // Llamamos a la clase y a su método directamente
        Pizzeria.main(argumentosVacios);
        
        System.out.println("Test finalizado.");
    }
}