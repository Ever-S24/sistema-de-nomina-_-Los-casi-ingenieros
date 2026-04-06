package model;

// Empleado que gana salario base mas comision por ventas
public class EmpleadoPorComision extends EmpleadoGeneral {

    private double ventas;
    private double porcentajeComision;

    public EmpleadoPorComision(String nombre, double salarioBase,
                                double ventas, double porcentajeComision) {
        super(nombre, salarioBase);

        // Validacion: las ventas no pueden ser negativas
        if (ventas < 0) {
            throw new IllegalArgumentException("Las ventas no pueden ser negativas.");
        }

        this.ventas = ventas;
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public double calcularSalario() {
        double comision = ventas * porcentajeComision;
        double total = salarioBase + comision;

        // Si las ventas superan $20.000.000, recibe bono adicional del 3%
        if (ventas > 20000000) {
            total = total + (ventas * 0.03);
        }

        return total;
    }

    // El bono de alimentacion ($1.000.000) lo cubre la empresa
    @Override
    public double calcularSalarioNeto() {
        double neto = super.calcularSalarioNeto();
        return neto + 1000000;
    }
}