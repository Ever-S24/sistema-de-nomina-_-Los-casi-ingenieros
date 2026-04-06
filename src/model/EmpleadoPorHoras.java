package model;

// Clase de empleado que cobra segun las horas que ha trabajado
public class EmpleadoPorHoras extends EmpleadoGeneral {

    private int horas;
    private double pagoPorHora;
    private int añosEnEmpresa;
    private boolean aceptaFondoAhorro;

    public EmpleadoPorHoras(String nombre, double pagoPorHora, int horas,
    int añosEnEmpresa, boolean aceptaFondoAhorro) {
        super(nombre, 0);
        this.pagoPorHora = pagoPorHora;
        this.horas = horas;
        this.añosEnEmpresa = añosEnEmpresa;
        this.aceptaFondoAhorro = aceptaFondoAhorro;

        // las horas no pueden ser negativas.
        if (horas < 0) {
            throw new IllegalArgumentException("Las horas trabajadas no pueden ser negativas.");
        }
    }

    @Override
    public double calcularSalario() {
        double total;

        if (horas > 40) {
            int horasExtra = horas - 40;
            total = (40 * pagoPorHora) + (horasExtra * pagoPorHora * 1.5);
        } else {
            total = horas * pagoPorHora;
        }
        return total;
    }

    // Si el empleado lleva mas de 1 año trabajando y acepta, se descuenta un 2% como fondo de ahorro
    @Override
    public double calcularSalarioNeto() {
        double neto = super.calcularSalarioNeto();

        if (añosEnEmpresa > 1 && aceptaFondoAhorro) {
            double fondo = neto * 0.02;
            neto = neto - fondo;
        }
        return neto;
    }
}