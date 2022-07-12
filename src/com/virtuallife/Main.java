package com.virtuallife;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Manuel", 44, "666123456", 350000);

        System.out.println("Nombre: " + cliente.getNombre() + "\n" + "Edad: " + cliente.getEdad() + "\n" +
                "Teléfono: " + cliente.getTelefono() + "\n" + "Crédito: " + cliente.getCredito());

        Trabajador empleado = new Trabajador("Sebastián", 32, "626332312", 18000);

        System.out.println("Nombre: " + empleado.getNombre() + "\n" + "Edad: " + empleado.getEdad() + "\n" +
                "Teléfono: " + empleado.getTelefono() + "\n" + "Salario: " + empleado.getSalario());
    }
}