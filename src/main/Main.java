package main;

import model.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Nomina ===\n");

        EmpleadoGeneral e1 = new EmpleadoAsalariado("Juan", 3000000, 6);
        EmpleadoGeneral e2 = new EmpleadoPorHoras("Ana", 20000, 45, 2, true);
        EmpleadoGeneral e3 = new EmpleadoPorComision("Luis", 1500000, 25000000, 0.05);
        EmpleadoGeneral e4 = new EmpleadoTemporal("Sofia", 1800000);

        System.out.println("Empleado: Juan");
        System.out.println("Tipo: Asalariado");
        System.out.println("Salario neto: $" + e1.calcularSalarioNeto());

        System.out.println("\nEmpleado: Ana");
        System.out.println("Tipo: Por Horas");
        System.out.println("Salario neto: $" + e2.calcularSalarioNeto());

        System.out.println("\nEmpleado: Luis");
        System.out.println("Tipo: Por Comision");
        System.out.println("Salario neto: $" + e3.calcularSalarioNeto());

        System.out.println("\nEmpleado: Sofia");
        System.out.println("Tipo: Temporal");
        System.out.println("Salario neto: $" + e4.calcularSalarioNeto());
    }
}