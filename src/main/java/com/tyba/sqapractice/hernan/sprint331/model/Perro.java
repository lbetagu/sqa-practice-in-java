package com.tyba.sqapractice.hernan.sprint331.model;

public class Perro extends Animal {

    private String raza;
    private String tamano;
    private boolean estaEntrenado;

    public Perro(String nombre, int edad, String raza, String tamano, boolean estaCastrado) {
        super(nombre, edad, "Perro", estaCastrado);
        this.raza = raza;
        this.tamano = tamano;
        this.estaEntrenado = false;
    }

    public Perro(String nombre, int edad, String raza) {
        this(nombre, edad, raza, "mediano", false);
    }

    @Override
    public String emitirSonido() {
        return "¡Guau! ¡Guau!";
    }

    @Override
    public String obtenerCuidadosEspeciales() {
        return String.format("Perro [%s - %s]: Paseos diarios, baño cada 2 semanas%s",
                raza, tamano,
                estaEntrenado ? ", entrenamiento de mantenimiento" : ", requiere entrenamiento básico");
    }

    @Override
    public String obtenerInfoRegistro() {
        return super.obtenerInfoRegistro() +
                String.format(", raza=%s, tamaño=%s, entrenado=%s",
                        raza, tamano, estaEntrenado ? "Sí" : "No");
    }

    public void entrenar() {
        this.estaEntrenado = true;
        System.out.println(getNombre() + " completó el entrenamiento básico!");
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        if (raza == null || raza.isEmpty()) {
            throw new IllegalArgumentException("La raza no puede estar vacía");
        }
        this.raza = raza;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public boolean isEstaEntrenado() {
        return estaEntrenado;
    }
}
