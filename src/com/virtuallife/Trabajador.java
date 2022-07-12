package com.virtuallife;

public class Trabajador extends Persona {

    private int salario;

    public Trabajador(String nombre, int edad, String telefono, int salario) {
        super(nombre, edad, telefono);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}

