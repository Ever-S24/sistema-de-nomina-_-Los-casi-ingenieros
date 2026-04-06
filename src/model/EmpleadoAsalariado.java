package model;

// Clase de un empleado con salario fijo mensual
public class EmpleadoAsalariado extends EmpleadoGeneral {

    private int años;

    public EmpleadoAsalariado(String nombre, double salarioBase, int años) {
        super(nombre, salarioBase);
        this.años = años;
    }

    @Override
    public double calcularSalario() {
        double total = salarioBase;

        // Si el empleado lleva mas de 5 años, entonces recibe un bono del 10%
        if (años > 5) {
            total = total + (salarioBase * 0.10);
        }

        return total;
    }

    // El bono de alimentacion ($1.000.000) lo cubre la empresa
    // se suma despues de las deducciones, por lo que no hace parte del salario bruto
    @Override
    public double calcularSalarioNeto() {
        double neto = super.calcularSalarioNeto();
        return neto + 1000000;
    }
}