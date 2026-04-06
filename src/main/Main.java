package main;

import model.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Nomina ===\n");

        EmpleadoGeneral e1 = new EmpleadoAsalariado("Juan", 3000000, 6);
        EmpleadoGeneral e2 = new EmpleadoPorHoras("Ana", 20000, 45, 2, true);

        System.out.println("Empleado: Juan");
        System.out.println("Tipo: Asalariado");
        System.out.println("Salario neto: $" + e1.calcularSalarioNeto());

        System.out.println("\nEmpleado: Ana");
        System.out.println("Tipo: Por Horas");
        System.out.println("Salario neto: $" + e2.calcularSalarioNeto());
    }
}