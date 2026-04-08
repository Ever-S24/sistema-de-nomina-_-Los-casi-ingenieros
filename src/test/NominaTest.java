package test;

import model.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Pruebas unitarias del sistema de nomina
public class NominaTest {

    // Primera prueba: un empleado asalariado con mas de 5 años debe ganar más que uno sin antiguedad
    @Test
    public void testAsalariado_BonoAntiguedad() {
        EmpleadoAsalariado conBono = new EmpleadoAsalariado("Juan", 3000000, 6);
        EmpleadoAsalariado sinBono = new EmpleadoAsalariado("Pedro", 3000000, 3);
        assertTrue(conBono.calcularSalarioNeto() > sinBono.calcularSalarioNeto());

    }
    // Segunda prueba: imposibilidad de ventas negativas
    @Test
    public void testComision_VentasNegativas(){
        assertThrows(IllegalArgumentException.class, ()-> {
            new EmpleadoPorComision("Error", 1500000, -1000, 0.05);
           });
    }

    //Tercera prueba: las horas extras deben pagarse a 1.5x
    @Test
    public void testPorHoras_HorasExtras() {
        EmpleadoPorHoras emp = new EmpleadoPorHoras("Ana", 20000, 45, 0, false);
        assertEquals(950000, emp.calcularSalario(), 0.01);
    }





}  
