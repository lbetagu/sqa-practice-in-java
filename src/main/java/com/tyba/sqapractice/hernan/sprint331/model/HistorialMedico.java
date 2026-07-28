package com.tyba.sqapractice.hernan.sprint331.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HistorialMedico {

    private final List<String> consultas;
    private final List<String> tratamientos;
    private LocalDate ultimaVisita;
    private String observacionesGenerales;

    public HistorialMedico() {
        this.consultas = new ArrayList<>();
        this.tratamientos = new ArrayList<>();
        this.observacionesGenerales = "";
    }

    public void agregarConsulta(String descripcion) {
        String entrada = "[" + LocalDate.now() + "] " + descripcion;
        consultas.add(entrada);
        this.ultimaVisita = LocalDate.now();
        System.out.println("Consulta registrada: " + descripcion);
    }

    public void agregarTratamiento(String tratamiento) {
        String entrada = "[" + LocalDate.now() + "] " + tratamiento;
        tratamientos.add(entrada);
        System.out.println("Tratamiento registrado: " + tratamiento);
    }

    public String generarResumen() {
        StringBuilder sb = new StringBuilder();
        sb.append("  HISTORIAL MÉDICO\n");
        sb.append("  Última visita: ").append(ultimaVisita != null ? ultimaVisita : "Sin visitas").append("\n");

        sb.append("  Consultas (").append(consultas.size()).append("):\n");
        consultas.forEach(c -> sb.append("    • ").append(c).append("\n"));

        sb.append("  Tratamientos (").append(tratamientos.size()).append("):\n");
        tratamientos.forEach(t -> sb.append("    • ").append(t).append("\n"));

        if (!observacionesGenerales.isEmpty()) {
            sb.append("  Observaciones: ").append(observacionesGenerales);
        }
        return sb.toString();
    }

    public List<String> getConsultas() {
        return new ArrayList<>(consultas);
    }

    public List<String> getTratamientos() {
        return new ArrayList<>(tratamientos);
    }

    public LocalDate getUltimaVisita() {
        return ultimaVisita;
    }

    public String getObservacionesGenerales() {
        return observacionesGenerales;
    }

    public void setObservacionesGenerales(String observaciones) {
        this.observacionesGenerales = observaciones;
    }

    public int getTotalConsultas() {
        return consultas.size();
    }
}
