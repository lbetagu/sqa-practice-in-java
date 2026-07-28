package com.tyba.sqapractice.hernan.sprint331;

import com.tyba.sqapractice.hernan.sprint331.interfaces.Registrable;
import com.tyba.sqapractice.hernan.sprint331.interfaces.Vacunable;
import com.tyba.sqapractice.hernan.sprint331.model.Animal;
import com.tyba.sqapractice.hernan.sprint331.model.Clinica;
import com.tyba.sqapractice.hernan.sprint331.model.Gato;
import com.tyba.sqapractice.hernan.sprint331.model.MascotaRegistrada;
import com.tyba.sqapractice.hernan.sprint331.model.Perro;
import com.tyba.sqapractice.hernan.sprint331.model.Veterinario;

public class Main {

    public static void main(String[] args) {

        // Creación de objetos y llamado de contructores
        Perro perro1 = new Perro("Max", 3, "Labrador", "grande", true);
        Perro perro2 = new Perro("Toby", 2, "Chihuahua");
        Gato gato1 = new Gato("Luna", 5, true, true);
        Gato gato2 = new Gato("Michi", 1);
        Veterinario vet1 = new Veterinario("García", "VET-001", "Cirugía", 10);
        Veterinario vet2 = new Veterinario("Martínez", "VET-002");
        System.out.println("Objetos creados: 4 animales, 2 veterinarios\n");

        // Herencia y polimorfismo (misma clase -emitir sonido- diferente
        // comportamiento)
        Animal[] animales = { perro1, perro2, gato1, gato2 };
        for (Animal animal : animales) {
            System.out.printf("  %-12s (%s): %s%n",
                    animal.getNombre(),
                    animal.getClass().getSimpleName(),
                    animal.emitirSonido());
        }
        // Polimorfismo en cuidados especiales
        for (Animal animal : animales) {
            System.out.println(animal.obtenerCuidadosEspeciales());
        }

        // Implementar interfaces
        Registrable registrableAnimal = perro1;
        Vacunable vacunableAnimal = perro1;
        registrableAnimal.imprimirRegistro();
        vacunableAnimal.aplicarVacuna("Rabia");
        vacunableAnimal.aplicarVacuna("Parvovirus");
        vacunableAnimal.aplicarVacuna("Rabia"); // Validar que esta vacuna ya se le aplicó
        vacunableAnimal.verificarVacunaObligatoria("Rabia"); // Validar que esta vacuna sea obligatoria
        vacunableAnimal.verificarVacunaObligatoria("Moquillo"); // Validar que esta vacuna sea obligatoria
        // El veterinario también implementa la interfaz Registrable
        Registrable registrableVet = vet1;
        registrableVet.imprimirRegistro();

        // Modificadores de acceso, se hace mediante getters y setters para proteger los
        // datos
        System.out.println("Nombre de Max: " + perro1.getNombre()); // getter público
        // Se valida que no se pueda crear un animal con nombre vacío o fuera de rango
        try {
            perro1.setNombre(""); // Intento de nombre vacío
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear perro1: " + e.getMessage());
        }
        try {
            gato1.setNivelIndependencia(15); // Fuera de rango
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear gato1: " + e.getMessage());
        }

        // CLINICA: compone veterinarios y mascotas (COMPOSICIÓN)
        Clinica clinica = new Clinica("VetClinic Central", "Calle 123 #45-67, Bogotá");
        clinica.agregarVeterinario(vet1);
        clinica.agregarVeterinario(vet2);

        // REGISTRO: MascotaRegistrada TIENE UN Animal (COMPOSICIÓN, no herencia)
        System.out.println("\nRegistrando mascotas en la clínica:");
        MascotaRegistrada regPerro1 = clinica.registrarMascota(perro1, "Carlos Pérez", "301-555-1234");
        MascotaRegistrada regGato1 = clinica.registrarMascota(gato1, "María López", "320-555-9012");
        regPerro1.imprimirRegistro();
        regGato1.imprimirRegistro();
        // INFORME FINAL COMPLETO
        clinica.imprimirInformeCompleto();
    }
}
