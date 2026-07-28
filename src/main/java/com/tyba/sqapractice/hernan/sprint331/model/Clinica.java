package com.tyba.sqapractice.hernan.sprint331.model;

import java.util.ArrayList;
import java.util.List;

public class Clinica {

    private final String nombre;
    private final String direccion;
    private final List<Veterinario> veterinarios;
    private final List<MascotaRegistrada> mascotas;

    public Clinica(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.veterinarios = new ArrayList<>();
        this.mascotas = new ArrayList<>();
    }

    public MascotaRegistrada registrarMascota(Animal animal, String nombreDueno, String telefono) {
        MascotaRegistrada mascota = new MascotaRegistrada(animal, nombreDueno, telefono);
        if (mascota.validarDatosRegistro()) {
            mascotas.add(mascota);
            System.out.println("Mascota registrada exitosamente: " + animal.getNombre());
            return mascota;
        } else {
            System.out.println("No se pudo registrar: datos inválidos");
            return null;
        }
    }

    public void agregarVeterinario(Veterinario veterinario) {
        veterinarios.add(veterinario);
        System.out.println("Veterinario agregado: Dr. " + veterinario.getNombre());
    }

    public void realizarRondaDeSonidos() {
        System.out.println("\nRONDA DE SONIDOS DE LA CLÍNICA " + nombre);
        System.out.println("─".repeat(40));
        for (MascotaRegistrada mascota : mascotas) {
            Animal animal = mascota.getAnimal();
            System.out.println("  " + animal.getNombre() + " (" +
                    animal.getClass().getSimpleName() + "): " + animal.emitirSonido());
        }
    }

    public void imprimirInformeCompleto() {
        System.out.println("\n INFORME COMPLETO - " + nombre.toUpperCase());
        System.out.println(direccion);
        System.out.println("Veterinarios: " + veterinarios.size());
        System.out.println("Mascotas registradas: " + mascotas.size());
        System.out.println("═".repeat(60));
        mascotas.forEach(MascotaRegistrada::imprimirFichaCompleta);
    }

    public List<Animal> buscarPorTipo(Class<? extends Animal> tipo) {
        List<Animal> resultado = new ArrayList<>();
        for (MascotaRegistrada m : mascotas) {
            if (tipo.isInstance(m.getAnimal())) {
                resultado.add(m.getAnimal());
            }
        }
        return resultado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<MascotaRegistrada> getMascotas() {
        return new ArrayList<>(mascotas);
    }

    public List<Veterinario> getVeterinarios() {
        return new ArrayList<>(veterinarios);
    }

    public int getTotalMascotas() {
        return mascotas.size();
    }
}
