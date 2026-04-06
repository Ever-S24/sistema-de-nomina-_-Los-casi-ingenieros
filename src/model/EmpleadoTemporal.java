package model;

// Empleado temporal: solo salario fijo, sin bonos ni beneficios
public class EmpleadoTemporal extends EmpleadoGeneral {

    public EmpleadoTemporal(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    public double calcularSalario() {
        // No tiene bonos ni beneficios adicionales
        return salarioBase;
    }
}