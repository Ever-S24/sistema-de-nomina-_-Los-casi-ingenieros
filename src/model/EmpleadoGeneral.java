package model;

// Clase base abstracta para todos los tipos de empleados
public abstract class EmpleadoGeneral {

    protected String nombre;
    protected double salarioBase;

    public EmpleadoGeneral(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // Se debe calcular el salario de forma diferente para cada tipo de empleado.
    public abstract double calcularSalario();

    // Deducciones obligatorias: Seguro social y pension (4% del salario bruto) y ARL (0.522%)
    public double calcularDeducciones(double salarioBruto) {
        double pension = salarioBruto * 0.04;
        double arl = salarioBruto * 0.00522;
        return pension + arl;
    }

    // Calcular el salario neto, que equivale al salario bruto restandole las deducciones.
    // El salario neto no puede ser negativo.
    public double calcularSalarioNeto() {
        double bruto = calcularSalario();
        double deducciones = calcularDeducciones(bruto);
        double neto = bruto - deducciones;

        if (neto < 0) {
            throw new IllegalArgumentException("El salario neto no puede ser negativo.");
        }

        return neto;
    }
    public String getNombre() {
        return nombre;
    }
}