package com.tyba.sqapractice.hernan.sprint331.model;

public class Gato extends Animal {
    private boolean esDeInteriores;
    private int nivelIndependencia; // 1-10

    public Gato(String nombre, int edad, boolean esDeInteriores, boolean estaCastrado) {
        super(nombre, edad, "Gato", estaCastrado);
        this.esDeInteriores = esDeInteriores;
        this.nivelIndependencia = 7;
    }

    public Gato(String nombre, int edad) {
        this(nombre, edad, true, false);
    }

    @Override
    public String emitirSonido() {
        return "Miau!";
    }

    @Override
    public String obtenerCuidadosEspeciales() {
        return String.format("Gato: Cepillado del pelaje, juego interactivo diario%s",
                esDeInteriores ? ", ambiente interior seguro" : ", revisar posibles heridas del exterior");
    }

    @Override
    public String obtenerInfoRegistro() {
        return super.obtenerInfoRegistro() +
                String.format(",interior=%s, independencia=%d/10", esDeInteriores ? "Sí" : "No", nivelIndependencia);
    }

    public void ronronear() {
        System.out.println(getNombre() + " está ronroneando... Purrrr~");
    }

    public boolean isEsDeInteriores() {
        return esDeInteriores;
    }

    public void setEsDeInteriores(boolean esDeInteriores) {
        this.esDeInteriores = esDeInteriores;
    }

    public int getNivelIndependencia() {
        return nivelIndependencia;
    }

    public void setNivelIndependencia(int nivelIndependencia) {
        if (nivelIndependencia < 1 || nivelIndependencia > 10) {
            throw new IllegalArgumentException("El nivel de independencia debe estar entre 1 y 10");
        }
        this.nivelIndependencia = nivelIndependencia;
    }
}
