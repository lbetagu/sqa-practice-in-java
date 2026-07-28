package com.tyba.sqapractice.hernan.sprint331.model;

import com.tyba.sqapractice.hernan.sprint331.interfaces.Registrable;

public class MascotaRegistrada implements Registrable {

    private static int contadorRegistros = 0;

    private final int numeroRegistro;
    private final Animal animal;
    private final HistorialMedico historial;
    private String nombreDueno;
    private String telefonoDueno;
    private boolean activo;

    public MascotaRegistrada(Animal animal, String nombreDueno, String telefonoDueno) {
        this.animal = animal;
        this.nombreDueno = nombreDueno;
        this.telefonoDueno = telefonoDueno;
        this.historial = new HistorialMedico();
        this.numeroRegistro = ++contadorRegistros;
        this.activo = true;
    }

    public String escucharSonido() {
        return animal.emitirSonido();
    }

    public String verCuidados() {
        return animal.obtenerCuidadosEspeciales();
    }

    public void vacunar(String vacuna) {
        animal.aplicarVacuna(vacuna);
        historial.agregarTratamiento("Vacuna: " + vacuna);
    }

    public void registrarConsulta(String descripcion) {
        historial.agregarConsulta(descripcion);
    }

    @Override
    public String obtenerInfoRegistro() {
        return String.format("Registro#%03d | Dueño: %s (%s) | %s",
                numeroRegistro, nombreDueno, telefonoDueno, animal.obtenerInfoRegistro());
    }

    @Override
    public boolean validarDatosRegistro() {
        return animal != null
                && animal.validarDatosRegistro()
                && nombreDueno != null && !nombreDueno.isEmpty()
                && telefonoDueno != null && !telefonoDueno.isEmpty();
    }

    public void imprimirFichaCompleta() {
        System.out.println("═".repeat(60));
        System.out.println("FICHA CLÍNICA - " + animal.getNombre().toUpperCase());
        System.out.println("═".repeat(60));
        System.out.println(obtenerInfoRegistro());
        System.out.println("  Tipo de animal: " + animal.getClass().getSimpleName());
        System.out.println("  Estado: " + (activo ? "Activo" : "Inactivo"));
        System.out.println(historial.generarResumen());
        System.out.println("  " + animal.obtenerHistorialVacunas());
        System.out.println("═".repeat(60));
    }

    public Animal getAnimal() {
        return animal;
    }

    public HistorialMedico getHistorial() {
        return historial;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public static int getTotalRegistros() {
        return contadorRegistros;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public String getTelefonoDueno() {
        return telefonoDueno;
    }

    public void setTelefonoDueno(String telefonoDueno) {
        this.telefonoDueno = telefonoDueno;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
