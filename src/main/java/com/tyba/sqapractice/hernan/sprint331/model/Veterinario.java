package com.tyba.sqapractice.hernan.sprint331.model;

import com.tyba.sqapractice.hernan.sprint331.interfaces.Registrable;

public class Veterinario implements Registrable {

    private String nombre;
    private String matriculaProfesional;
    private String especialidad;
    private int anosExperiencia;
    private boolean disponible;

    public Veterinario(String nombre, String matriculaProfesional,
            String especialidad, int anosExperiencia) {
        this.nombre = nombre;
        this.matriculaProfesional = matriculaProfesional;
        this.especialidad = especialidad;
        this.anosExperiencia = anosExperiencia;
        this.disponible = true;
    }

    public Veterinario(String nombre, String matriculaProfesional) {
        this(nombre, matriculaProfesional, "Medicina General", 1);
    }

    @Override
    public String obtenerInfoRegistro() {
        return String.format("Dr. %s | Matrícula: %s | Especialidad: %s | Experiencia: %d año(s) | %s",
                nombre, matriculaProfesional, especialidad, anosExperiencia,
                disponible ? "Disponible" : "No disponible");
    }

    @Override
    public boolean validarDatosRegistro() {
        return nombre != null && !nombre.isEmpty()
                && matriculaProfesional != null && !matriculaProfesional.isEmpty()
                && anosExperiencia >= 0;
    }

    public void atenderMascota(MascotaRegistrada mascota, String diagnostico) {
        if (!disponible) {
            System.out.println("Dr. " + nombre + " no está disponible en este momento.");
            return;
        }
        System.out.println("Dr. " + nombre + " atendiendo a " + mascota.getAnimal().getNombre());
        mascota.registrarConsulta("Atendido por Dr. " + nombre + " - " + diagnostico);
        System.out.println("Diagnóstico registrado: " + diagnostico);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre del veterinario no puede estar vacío");
        }
        this.nombre = nombre;
    }

    public String getMatriculaProfesional() {
        return matriculaProfesional;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        if (anosExperiencia < 0) {
            throw new IllegalArgumentException("Los años de experiencia no pueden ser negativos");
        }
        this.anosExperiencia = anosExperiencia;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return obtenerInfoRegistro();
    }
}
