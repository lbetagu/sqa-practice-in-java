package com.tyba.sqapractice.hernan.sprint331.model;

import com.tyba.sqapractice.hernan.sprint331.interfaces.Registrable;
import com.tyba.sqapractice.hernan.sprint331.interfaces.Vacunable;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal implements Registrable, Vacunable {
    private String nombre;
    private int edad;
    private String especie;
    protected boolean estaCastrado;
    protected List<String> vacunasAplicadas;

    protected Animal(String nombre, int edad, String especie, boolean estaCastrado) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.estaCastrado = estaCastrado;
        this.vacunasAplicadas = new ArrayList<>();
    }

    public abstract String emitirSonido();

    public abstract String obtenerCuidadosEspeciales();

    @Override
    public String obtenerInfoRegistro() {
        return String.format("Animal[nombre=%s, especie=%s, edad=%d año(s), castrado=%s]",
                nombre, especie, edad, estaCastrado ? "Sí" : "No");
    }

    @Override
    public boolean validarDatosRegistro() {
        return nombre != null && !nombre.isEmpty()
                && edad > 0
                && especie != null && !especie.isEmpty();
    }

    @Override
    public void aplicarVacuna(String nombreVacuna) {
        if (!tieneVacuna(nombreVacuna)) {
            vacunasAplicadas.add(nombreVacuna);
            System.out.println("Vacuna '" + nombreVacuna + "' aplicada a " + nombre);
        } else {
            System.out.println(nombre + " ya tiene la vacuna: " + nombreVacuna);
        }
    }

    @Override
    public String obtenerHistorialVacunas() {
        if (vacunasAplicadas.isEmpty()) {
            return nombre + " no tiene vacunas registradas.";
        }
        return nombre + " - Vacunas: " + String.join(", ", vacunasAplicadas);
    }

    @Override
    public boolean tieneVacuna(String nombreVacuna) {
        return vacunasAplicadas.contains(nombreVacuna);
    }

    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " (" + especie + ")");
        System.out.println("Sonido: " + emitirSonido());
        System.out.println("Edad: " + edad + " año(s)");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad <= 0) {
            throw new IllegalArgumentException("La edad debe ser mayor a 0");
        }
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public boolean isEstaCastrado() {
        return estaCastrado;
    }

    public void setEstaCastrado(boolean estaCastrado) {
        this.estaCastrado = estaCastrado;
    }

    @Override
    public String toString() {
        return obtenerInfoRegistro();
    }
}
