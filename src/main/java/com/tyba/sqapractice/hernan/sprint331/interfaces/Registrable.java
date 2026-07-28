package com.tyba.sqapractice.hernan.sprint331.interfaces;

public interface Registrable {
    String obtenerInfoRegistro();

    boolean validarDatosRegistro();

    default void imprimirRegistro() {
        if (validarDatosRegistro()) {
            System.out.println("[REGISTRO VÁLIDO] " + obtenerInfoRegistro());
        } else {
            System.out.println("[REGISTRO INVÁLIDO] Datos incompletos para: " + obtenerInfoRegistro());
        }
    }
}
