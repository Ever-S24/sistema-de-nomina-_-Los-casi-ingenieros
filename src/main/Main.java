package main;

import model.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Nomina ===\n");

        EmpleadoGeneral e1 = new EmpleadoAsalariado("Juan", 3000000, 6);

        System.out.println("Empleado: Juan");
        System.out.println("Tipo: Asalariado");
        System.out.println("Salario neto: $" + e1.calcularSalarioNeto());
    }
}