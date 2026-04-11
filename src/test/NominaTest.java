package test;

import model.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Pruebas unitarias del sistema de nomina
// Se verificarán las reglas de negocio para cada tipo de emleado

public class NominaTest {

//                                 EMPLEADO ASALARIADO

//    Prueba 1: un empleado con más de 5 años en la empresa debe recibir un bono de antiguedad del 10%.
//    Vamos a compararlo con uno con menos años en la empresa para verificar la diferencia.

@Test
public void testAsalariado_ConBonoAntiguedad() {
    EmpleadoAsalariado conBono =new EmpleadoAsalariado("juan v", 2000000, 6);
    EmpleadoAsalariado sinBono =new EmpleadoAsalariado("luis p", 2000000, 3);
    assertTrue(conBono.calcularSalarioNeto() > sinBono.calcularSalarioNeto());
}












}  
