package test;

import model.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Pruebas unitarias del sistema de nomina
public class NominaTest {

    // Primera prueba: un asalariado con mas de 5 años debe ganar más que uno sin antiguedad
    @Test
    public void testAsalariado_BonoAntiguedad() {
        EmpleadoAsalariado conBono = new EmpleadoAsalariado("Juan", 3000000, 6);
        EmpleadoAsalariado sinBono = new EmpleadoAsalariado("Pedro", 3000000, 3);
        assertTrue(conBono.calcularSalarioNeto() > sinBono.calcularSalarioNeto());

    }
}