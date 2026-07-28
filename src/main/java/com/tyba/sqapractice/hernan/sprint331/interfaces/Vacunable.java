package com.tyba.sqapractice.hernan.sprint331.interfaces;

public interface Vacunable {

    void aplicarVacuna(String nombreVacuna);

    String obtenerHistorialVacunas();

    boolean tieneVacuna(String nombreVacuna);

    default void verificarVacunaObligatoria(String vacuna) {
        if (tieneVacuna(vacuna)) {
            System.out.println("Vacuna '" + vacuna + "' confirmada.");
        } else {
            System.out.println("Vacuna '" + vacuna + "' PENDIENTE. ¡Requiere atención!");
        }
    }
}
